package space.bum.jpa.n2n.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  // @formatter:off  
  @ManyToMany
  @JoinTable(
      name = "course_like", 
      joinColumns = @JoinColumn(name = "student_id"), 
      inverseJoinColumns = @JoinColumn(name = "course_id"))  
  Set<Course> likedCourses = new HashSet<>();
  // @formatter:on

  @OneToMany(mappedBy = "student")
  Set<CourseRating> ratings = new HashSet<>();
}
