package space.bum.jpa.n2n.repository;

import org.springframework.data.repository.CrudRepository;

import space.bum.jpa.n2n.entity.CourseRating;
import space.bum.jpa.n2n.entity.CourseRatingKey;

public interface CourseRatingRepository
    extends CrudRepository<CourseRating, CourseRatingKey> {

}
