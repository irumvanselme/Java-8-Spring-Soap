package rw.ac.rca.java8springsoap.endpoints;
import jaxb.classes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import rw.ac.rca.java8springsoap.repositories.ISupplierRepository;
import rw.ac.rca.java8springsoap.models.Supplier;

import java.util.List;
import java.util.Optional;

@Endpoint
public class SuppliersEndPoint {
    private final ISupplierRepository studentRepository;

    @Autowired
    public SuppliersEndPoint(ISupplierRepository repository) {
        this.studentRepository = repository;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "NewSupplierRequest")
    @ResponsePayload
    public NewSupplierResponse create(@RequestPayload NewSupplierRequest dto) {
        SupplierDetails __student = dto.getSupplier();

        Supplier _student = mapSupplier(__student);

        Supplier student = studentRepository.save(_student);

        NewSupplierResponse response = new NewSupplierResponse();

        __student.setId(student.getId());

        response.setSupplier(__student);

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "GetAllSuppliersRequest")
    @ResponsePayload
    public GetAllSuppliersResponse findAll(@RequestPayload GetAllSuppliersRequest request) {

        List<Supplier> students = studentRepository.findAll();

        GetAllSuppliersResponse response = new GetAllSuppliersResponse();

        for (Supplier student : students) {
            SupplierDetails _student = mapSupplier(student);

            response.getSupplier().add(_student);
        }

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "GetSupplierDetailsRequest")
    @ResponsePayload
    public GetSupplierDetailsResponse findById(@RequestPayload GetSupplierDetailsRequest request) {
        Optional<Supplier> _student = studentRepository.findById(request.getId());

        if (!_student.isPresent())
            return new GetSupplierDetailsResponse();

        Supplier student = _student.get();

        GetSupplierDetailsResponse response = new GetSupplierDetailsResponse();

        SupplierDetails __student = mapSupplier(student);

        response.setSupplier(__student);

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "DeleteSupplierRequest")
    @ResponsePayload
    public DeleteSupplierResponse delete(@RequestPayload DeleteSupplierRequest request) {
        studentRepository.deleteById(request.getId());
        DeleteSupplierResponse response = new DeleteSupplierResponse();
        response.setMessage("Successfully deleted a message");
        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "UpdateSupplierRequest")
    @ResponsePayload
    public UpdateSupplierResponse update(@RequestPayload UpdateSupplierRequest request) {
        SupplierDetails __student = request.getSupplier();

        Supplier _student = mapSupplier(__student);
        _student.setId(__student.getId());

        Supplier student = studentRepository.save(_student);

        UpdateSupplierResponse studentDTO = new UpdateSupplierResponse();

        __student.setId(student.getId());

        studentDTO.setSupplier(__student);

        return studentDTO;
    }

    private SupplierDetails mapSupplier(Supplier student) {
        SupplierDetails _student = new SupplierDetails();
        _student.setId(student.getId());
        _student.setNames(student.getNames());
        _student.setEmail(student.getEmail());
        _student.setMobile(student.getMobile());
        return _student;
    }

    private Supplier mapSupplier(SupplierDetails __student) {
        return new Supplier(__student.getId(), __student.getNames(), __student.getEmail(), __student.getMobile());
    }
}
