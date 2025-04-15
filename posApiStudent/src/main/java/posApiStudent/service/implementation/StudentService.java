package posApiStudent.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import posApiStudent.model.entity.Student;
import posApiStudent.repository.StudentRepository;
import posApiStudent.service.interfaces.IStudentService;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();

    }

    @Override
    public Student findStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Student> findAllStudentByCourseId(Long idCourse) {
        return studentRepository.findAllByCourseId(idCourse);
    }
    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student update = studentRepository.findById(id).orElseThrow();
        update.setName(student.getName());
        update.setLastName(student.getLastName());
        update.setEmail(student.getEmail());
        update.setCourseId(student.getCourseId());
        return studentRepository.save(update);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
