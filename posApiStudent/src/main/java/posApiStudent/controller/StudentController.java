package posApiStudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import posApiStudent.model.entity.Student;
import posApiStudent.service.interfaces.IStudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/list")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(studentService.findAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.findStudentById(id));
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<?> findAllStudentByCourseId(@PathVariable Long courseId) {
        return ResponseEntity.ok(studentService.findAllStudentByCourseId(courseId));
    }

    @PostMapping("/register")
    public ResponseEntity<?> create(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.createStudent(student));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> create(@PathVariable Long id, @RequestBody Student student) {
        return ResponseEntity.ok(studentService.updateStudent(id, student));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(Long id) {
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }
}
