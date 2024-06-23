package space.bum.jpa.n2n.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseRegistration {

  @Id
  Long id;

  @ManyToOne
  @JoinColumn(name = "student_id")
  Student student;

  @ManyToOne
  @JoinColumn(name = "course_id")
  Student course;

  LocalDateTime registeredAt;

  int grade;
}
