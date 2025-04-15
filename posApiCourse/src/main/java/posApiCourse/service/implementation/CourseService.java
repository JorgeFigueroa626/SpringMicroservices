package posApiCourse.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import posApiCourse.client.IStudentClient;
import posApiCourse.dto.response.StudentByCourseResponseDto;
import posApiCourse.dto.response.StudentResponseDto;
import posApiCourse.model.entity.Course;
import posApiCourse.repository.ICourseRepository;
import posApiCourse.service.interfaces.ICourseService;

import java.util.List;

@Service
public class CourseService implements ICourseService {

    @Autowired
    private ICourseRepository courseRepository;

    @Autowired
    private IStudentClient studentClient;

    @Override
    public List<Course> findAllCourse() {
        return courseRepository.findAll();
    }

    @Override
    public Course findByIdCourse(Long id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public StudentByCourseResponseDto findStudentByCourseId(Long courseId) {
        Course course = courseRepository.findById(courseId).orElseThrow();

        //API STUDENTS
        List<StudentResponseDto> studentResponseDtos = studentClient.findAllStudentByCourseId(courseId);

        return StudentByCourseResponseDto
                .builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentResponseDtos(studentResponseDtos)
                .build();
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Long id, Course course) {
        Course update = courseRepository.findById(id).orElseThrow();
        update.setName(course.getName());
        update.setTeacher(course.getTeacher());
        return courseRepository.save(update);
    }

    @Override
    public void deleteByIdCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
