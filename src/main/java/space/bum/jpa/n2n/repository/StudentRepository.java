package space.bum.jpa.n2n.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import space.bum.jpa.n2n.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
