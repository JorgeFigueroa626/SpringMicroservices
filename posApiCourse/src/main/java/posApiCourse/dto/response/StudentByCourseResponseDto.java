package posApiCourse.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder()
public class StudentByCourseResponseDto {
    private String courseName;
    private String teacher;
    private List<StudentResponseDto> studentResponseDtos;
}
