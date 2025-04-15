package posApiCourse.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import posApiCourse.dto.request.StudentRequestDto;
import posApiCourse.dto.response.StudentResponseDto;

import java.util.List;

@FeignClient(name = "msvc-student", url = "http://localhost:8090")
public interface IStudentClient {

    @PostMapping("/api/students/register")
    public StudentRequestDto register(@RequestBody StudentRequestDto student);

    @GetMapping("/api/students/course/{courseId}")
    List<StudentResponseDto> findAllStudentByCourseId(@PathVariable Long courseId);
}
