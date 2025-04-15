package posApiCourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import posApiCourse.model.entity.Course;

@Repository
public interface ICourseRepository extends JpaRepository<Course, Long> {
}
