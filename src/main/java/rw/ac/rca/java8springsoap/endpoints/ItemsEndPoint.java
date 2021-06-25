package rw.ac.rca.java8springsoap.endpoints;

import jaxb.classes.items.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import rw.ac.rca.java8springsoap.repositories.IItemRepository;
import rw.ac.rca.java8springsoap.models.Item;

import java.util.List;
import java.util.Optional;

@Endpoint
public class ItemsEndPoint {
    private final IItemRepository studentRepository;

    @Autowired
    public ItemsEndPoint(IItemRepository repository) {
        this.studentRepository = repository;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "NewItemRequest")
    @ResponsePayload
    public NewItemResponse create(@RequestPayload NewItemRequest dto) {
        ItemDetails __student = dto.getItem();

        Item _student = mapItem(__student);

        Item student = studentRepository.save(_student);

        NewItemResponse response = new NewItemResponse();

        __student.setId(student.getId());

        response.setItem(__student);

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "GetAllItemsRequest")
    @ResponsePayload
    public GetAllItemsResponse findAll(@RequestPayload GetAllItemsRequest request) {

        List<Item> students = studentRepository.findAll();

        GetAllItemsResponse response = new GetAllItemsResponse();

        for (Item student : students) {
            ItemDetails _student = mapItem(student);

            response.getItem().add(_student);
        }

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "GetItemDetailsRequest")
    @ResponsePayload
    public GetItemDetailsResponse findById(@RequestPayload GetItemDetailsRequest request) {
        Optional<Item> _student = studentRepository.findById(request.getId());

        if (!_student.isPresent())
            return new GetItemDetailsResponse();

        Item student = _student.get();

        GetItemDetailsResponse response = new GetItemDetailsResponse();

        ItemDetails __student = mapItem(student);

        response.setItem(__student);

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "DeleteItemRequest")
    @ResponsePayload
    public DeleteItemResponse delete(@RequestPayload DeleteItemRequest request) {
        studentRepository.deleteById(request.getId());
        DeleteItemResponse response = new DeleteItemResponse();
        response.setMessage("Successfully deleted a message");
        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "UpdateItemRequest")
    @ResponsePayload
    public UpdateItemResponse update(@RequestPayload UpdateItemRequest request) {
        ItemDetails __student = request.getItem();

        Item _student = mapItem(__student);
        _student.setId(__student.getId());

        Item student = studentRepository.save(_student);

        UpdateItemResponse studentDTO = new UpdateItemResponse();

        __student.setId(student.getId());

        studentDTO.setItem(__student);

        return studentDTO;
    }

    private ItemDetails mapItem(Item student) {
        ItemDetails _student = new ItemDetails();
        _student.setId(student.getId());
        _student.setCode(student.getCode());
        _student.setName(student.getName());
        _student.setStatus(student.getStatus().toString());

        return _student;
    }

    private Item mapItem(ItemDetails __student) {
        return new Item(__student.getId(), __student.getName(), __student.getCode(), __student.getStatus(), __student.getSupplier());
    }
}
