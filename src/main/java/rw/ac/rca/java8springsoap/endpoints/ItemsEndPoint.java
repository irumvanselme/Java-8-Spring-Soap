package rw.ac.rca.java8springsoap.endpoints;

import jaxb.classes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import rw.ac.rca.java8springsoap.models.Supplier;
import rw.ac.rca.java8springsoap.models.enums.EItemStatus;
import rw.ac.rca.java8springsoap.repositories.IItemRepository;
import rw.ac.rca.java8springsoap.models.Item;
import rw.ac.rca.java8springsoap.repositories.ISupplierRepository;
import rw.ac.rca.java8springsoap.utils.MappingHandler;

import java.util.List;
import java.util.Optional;

@Endpoint
public class ItemsEndPoint {
    private final IItemRepository itemRepository;
    private final ISupplierRepository supplierRepository;

    @Autowired
    public ItemsEndPoint(IItemRepository repository, ISupplierRepository supplierRepository) {
        this.itemRepository = repository;
        this.supplierRepository = supplierRepository;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "NewItemRequest")
    @ResponsePayload
    public NewItemResponse create(@RequestPayload NewItemRequest dto) {
        ItemDetails __item = dto.getItem();

        Optional<Supplier> supplier = supplierRepository.findById(__item.getSupplier());

        if (!supplier.isPresent())
            return new NewItemResponse();

        Item _item = mapItem(__item, supplier.get());
        Item item = itemRepository.save(_item);

        NewItemResponse response = new NewItemResponse();

        __item.setId(item.getId());

        response.setItem(__item);
        response.setSupplier(MappingHandler.mapToSupplierDetails(supplier.get()));

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "GetAllItemsRequest")
    @ResponsePayload
    public GetAllItemsResponse findAll(@RequestPayload GetAllItemsRequest request) {

        List<Item> items = itemRepository.findAll();

        GetAllItemsResponse response = new GetAllItemsResponse();

        for (Item item : items) {
            ItemDetails _item = mapItem(item);

            response.getItem().add(_item);
        }

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "GetItemDetailsRequest")
    @ResponsePayload
    public GetItemDetailsResponse findById(@RequestPayload GetItemDetailsRequest request) {
        Optional<Item> _item = itemRepository.findById(request.getId());

        if (!_item.isPresent())
            return new GetItemDetailsResponse();

        Item item = _item.get();

        GetItemDetailsResponse response = new GetItemDetailsResponse();

        ItemDetails __item = mapItem(item);

        response.setItem(__item);
        response.setSupplier(MappingHandler.mapToSupplierDetails(_item.get().getSupplier()));

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "DeleteItemRequest")
    @ResponsePayload
    public DeleteItemResponse delete(@RequestPayload DeleteItemRequest request) {
        itemRepository.deleteById(request.getId());
        DeleteItemResponse response = new DeleteItemResponse();
        response.setMessage("Successfully deleted a message");
        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "UpdateItemRequest")
    @ResponsePayload
    public UpdateItemResponse update(@RequestPayload UpdateItemRequest request) {
        ItemDetails __item = request.getItem();

        Optional<Supplier> supplier = supplierRepository.findById(__item.getSupplier());

        if (!supplier.isPresent())
            return new UpdateItemResponse();

        Item _item = mapItem(__item, supplier.get());

        Item item = itemRepository.save(_item);

        UpdateItemResponse itemDTO = new UpdateItemResponse();

        __item.setId(item.getId());

        itemDTO.setItem(__item);

        return itemDTO;
    }

    private ItemDetails mapItem(Item item) {
        ItemDetails _item = new ItemDetails();
        _item.setId(item.getId());
        _item.setCode(item.getCode());
        _item.setName(item.getName());
        _item.setStatus(item.getStatus().toString());

        return _item;
    }

    public Item mapItem(ItemDetails itemDetails, Supplier supplier) {
        return new Item(
                itemDetails.getId(),
                itemDetails.getName(),
                itemDetails.getCode(),
                itemDetails.getPrice(),
                EItemStatus.valueOf(itemDetails.getStatus()),
                supplier);
    }
}
