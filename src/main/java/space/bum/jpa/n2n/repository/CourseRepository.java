package space.bum.jpa.n2n.repository;

import org.springframework.data.repository.CrudRepository;

import space.bum.jpa.n2n.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
