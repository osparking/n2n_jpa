package space.bum.jpa.n2n.repository;

import org.springframework.data.repository.CrudRepository;

import space.bum.jpa.n2n.entity.CourseRegistration;

public interface RegistrationRepository
    extends CrudRepository<CourseRegistration, Long> {

}
