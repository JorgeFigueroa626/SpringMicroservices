package posApiCourse.dto.response;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class StudentResponseDto {

    private Long id;

    private String name;

    private String lastName;

    private String email;

    private Long courseId;
}
