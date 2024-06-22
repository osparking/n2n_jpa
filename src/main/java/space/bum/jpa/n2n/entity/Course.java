package space.bum.jpa.n2n.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @ManyToMany(mappedBy = "likedCourses")
  Set<Student> likes;

  @OneToMany(mappedBy = "course")
  Set<CourseRating> ratings;
}
