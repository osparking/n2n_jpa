package space.bum.jpa.n2n.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {

  @Id
  Long id;

  @ManyToMany
  Set<Student> likes;

  // additional properties
  // standard constructors, getters, and setters
}