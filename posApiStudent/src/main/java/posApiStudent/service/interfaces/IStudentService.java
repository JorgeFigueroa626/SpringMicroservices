package posApiStudent.service.interfaces;

import posApiStudent.model.entity.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAllStudents();
    Student findStudentById(Long id);
    List<Student> findAllStudentByCourseId(Long idCourse);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    void deleteStudentById(Long id);
}
