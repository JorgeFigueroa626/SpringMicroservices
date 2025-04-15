package posApiCourse.service.interfaces;

import posApiCourse.dto.response.StudentByCourseResponseDto;
import posApiCourse.model.entity.Course;

import java.util.List;

public interface ICourseService {

    public List<Course> findAllCourse();
    public Course findByIdCourse(Long id);
    StudentByCourseResponseDto findStudentByCourseId(Long courseId);
    public Course createCourse(Course course);
    public Course updateCourse(Long id, Course course);
    public void deleteByIdCourse(Long id);
}
