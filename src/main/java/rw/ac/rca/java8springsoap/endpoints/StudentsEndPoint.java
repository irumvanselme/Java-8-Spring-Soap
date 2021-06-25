package rw.ac.rca.java8springsoap.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import rw.ac.rca.java8springsoap.repositories.IStudentRepository;
import rw.ac.rca.java8springsoap.models.Supplier;

import java.util.List;
import java.util.Optional;

@Endpoint
public class StudentsEndPoint {
    private final IStudentRepository studentRepository;

    @Autowired
    public StudentsEndPoint(IStudentRepository repository) {
        this.studentRepository = repository;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "NewStudentRequest")
    @ResponsePayload
    public NewStudentResponse create(@RequestPayload NewStudentRequest dto) {
        StudentDetails __student = dto.getStudent();

        Supplier _student = mapStudent(__student);

        Supplier student = studentRepository.save(_student);

        NewStudentResponse response = new NewStudentResponse();

        __student.setId(student.getId());

        response.setStudent(__student);

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "GetAllStudentsRequest")
    @ResponsePayload
    public GetAllStudentsResponse findAll(@RequestPayload GetAllStudentsRequest request) {

        List<Supplier> students = studentRepository.findAll();

        GetAllStudentsResponse response = new GetAllStudentsResponse();

        for (Supplier student : students) {
            StudentDetails _student = mapStudent(student);

            response.getStudent().add(_student);
        }

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "GetStudentDetailsRequest")
    @ResponsePayload
    public GetStudentDetailsResponse findById(@RequestPayload GetStudentDetailsRequest request) {
        Optional<Supplier> _student = studentRepository.findById(request.getId());

        if (!_student.isPresent())
            return new GetStudentDetailsResponse();

        Supplier student = _student.get();

        GetStudentDetailsResponse response = new GetStudentDetailsResponse();

        StudentDetails __student = mapStudent(student);

        response.setStudent(__student);

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "DeleteStudentRequest")
    @ResponsePayload
    public DeleteStudentResponse delete(@RequestPayload DeleteStudentRequest request) {
        studentRepository.deleteById(request.getId());
        DeleteStudentResponse response = new DeleteStudentResponse();
        response.setMessage("Successfully deleted a message");
        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/anselme/soap-app", localPart = "UpdateStudentRequest")
    @ResponsePayload
    public UpdateStudentResponse update(@RequestPayload UpdateStudentRequest request) {
        StudentDetails __student = request.getStudent();

        Supplier _student = mapStudent(__student);
        _student.setId(__student.getId());

        Supplier student = studentRepository.save(_student);

        UpdateStudentResponse studentDTO = new UpdateStudentResponse();

        __student.setId(student.getId());

        studentDTO.setStudent(__student);

        return studentDTO;
    }

    private StudentDetails mapStudent(Supplier student) {
        StudentDetails _student = new StudentDetails();
        _student.setId(student.getId());
        _student.setFirstName(student.getFirstName());
        _student.setLastName(student.getLastName());
        _student.setGender(student.getGender());
        _student.setResident(student.getResident());
        _student.setDateOfBirth(student.getDateOfBirth());
        _student.setParentsPhoneNumber(student.getParentsPhoneNumber());

        return _student;
    }

    private Supplier mapStudent(StudentDetails __student) {
        return new Supplier(__student.getId(), __student.getFirstName(), __student.getLastName(), __student.getGender(), __student.getDateOfBirth(), __student.getResident(), __student.getParentsPhoneNumber());
    }
}
