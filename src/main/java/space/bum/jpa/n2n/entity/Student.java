package space.bum.jpa.n2n.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {

  @Id
  Long id;

  @ManyToMany
  Set<Course> likedCourses;

  // additional properties
  // standard constructors, getters, and setters
}
