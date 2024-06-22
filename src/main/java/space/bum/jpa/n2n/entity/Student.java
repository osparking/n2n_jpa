package space.bum.jpa.n2n.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {

  @Id
  Long id;

  // @formatter:off  
  @ManyToMany
  @JoinTable(
      name = "course_like", 
      joinColumns = @JoinColumn(name = "student_id"), 
      inverseJoinColumns = @JoinColumn(name = "course_id"))  
  Set<Course> likedCourses;
  // @formatter:on

  // additional properties
  // standard constructors, getters, and setters
}
