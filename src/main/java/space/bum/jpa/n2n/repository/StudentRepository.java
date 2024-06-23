package space.bum.jpa.n2n.repository;

import org.springframework.data.repository.CrudRepository;

import space.bum.jpa.n2n.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
