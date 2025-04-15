package posApiCourse.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import posApiCourse.model.entity.Course;
import posApiCourse.service.interfaces.ICourseService;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @GetMapping("/list")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(courseService.findAllCourse());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.findByIdCourse(id));
    }

    @PostMapping("/register")
    public ResponseEntity<?> create(@RequestBody Course course) {
        return ResponseEntity.ok(courseService.createCourse(course));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, Course course) {
        return ResponseEntity.ok(courseService.updateCourse(id, course));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>  delete(@PathVariable Long id) {
        courseService.deleteByIdCourse(id);
        return ResponseEntity.noContent().build();
    }

    //CLIENT STUDENTS
    @GetMapping("/students-course/{courseId}")
    public ResponseEntity<?> findStudentsByCourseId(@PathVariable Long courseId){
        return ResponseEntity.ok(courseService.findStudentByCourseId(courseId));
    }
}
