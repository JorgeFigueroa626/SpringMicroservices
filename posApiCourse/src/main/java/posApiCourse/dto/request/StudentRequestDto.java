package posApiCourse.dto.request;

import lombok.Data;

@Data
public class StudentRequestDto {

    private String name;

    private String lastName;

    private String email;

    private Long courseId;
}
