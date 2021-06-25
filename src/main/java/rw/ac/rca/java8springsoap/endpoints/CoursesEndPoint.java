package rw.ac.rca.java8springsoap.endpoints;

import jaxb.classes.courses.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import rw.ac.rca.java8springsoap.repositories.ICourseRepository;
import rw.ac.rca.java8springsoap.models.Course;

import java.util.List;
import java.util.Optional;

@Endpoint
public class CoursesEndPoint {
    private final ICourseRepository studentRepository;

    @Autowired
    public CoursesEndPoint(ICourseRepository repository) {
        this.studentRepository = repository;
    }

    @PayloadRoot(namespace = "students.xsd", localPart = "NewCourseRequest")
    @ResponsePayload
    public NewCourseResponse create(@RequestPayload NewCourseRequest dto) {
        CourseDetails __student = dto.getCourse();

        Course _student = mapCourse(__student);

        Course student = studentRepository.save(_student);

        NewCourseResponse response = new NewCourseResponse();

        __student.setId(student.getId());

        response.setCourse(__student);

        return response;
    }

    @PayloadRoot(namespace = "students.xsd", localPart = "GetAllCoursesRequest")
    @ResponsePayload
    public GetAllCoursesResponse findAll(@RequestPayload GetAllCoursesRequest request) {

        List<Course> students = studentRepository.findAll();

        GetAllCoursesResponse response = new GetAllCoursesResponse();

        for (Course student : students) {
            CourseDetails _student = mapCourse(student);

            response.getCourse().add(_student);
        }

        return response;
    }

    @PayloadRoot(namespace = "students.xsd", localPart = "GetCourseDetailsRequest")
    @ResponsePayload
    public GetCourseDetailsResponse findById(@RequestPayload GetCourseDetailsRequest request) {
        Optional<Course> _student = studentRepository.findById(request.getId());

        if (!_student.isPresent())
            return new GetCourseDetailsResponse();

        Course student = _student.get();

        GetCourseDetailsResponse response = new GetCourseDetailsResponse();

        CourseDetails __student = mapCourse(student);

        response.setCourse(__student);

        return response;
    }

    @PayloadRoot(namespace = "students.xsd", localPart = "DeleteCourseRequest")
    @ResponsePayload
    public DeleteCourseResponse delete(@RequestPayload DeleteCourseRequest request) {
        studentRepository.deleteById(request.getId());
        DeleteCourseResponse response = new DeleteCourseResponse();
        response.setMessage("Successfully deleted a message");
        return response;
    }

    @PayloadRoot(namespace = "students.xsd", localPart = "UpdateCourseRequest")
    @ResponsePayload
    public UpdateCourseResponse update(@RequestPayload UpdateCourseRequest request) {
        CourseDetails __student = request.getCourse();

        Course _student = mapCourse(__student);
        _student.setId(__student.getId());

        Course student = studentRepository.save(_student);

        UpdateCourseResponse studentDTO = new UpdateCourseResponse();

        __student.setId(student.getId());

        studentDTO.setCourse(__student);

        return studentDTO;
    }

    private CourseDetails mapCourse(Course student) {
        CourseDetails _student = new CourseDetails();
        _student.setId(student.getId());
        _student.setCode(student.getCode());
        _student.setName(student.getName());
        _student.setMax(student.getMax());

        return _student;
    }

    private Course mapCourse(CourseDetails __student) {
        return new Course(__student.getId(), __student.getName(), __student.getCode(), __student.getMax());
    }
}
