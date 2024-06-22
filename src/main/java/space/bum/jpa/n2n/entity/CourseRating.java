package space.bum.jpa.n2n.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class CourseRating {

  @EmbeddedId
  CourseRatingKey id;

  @ManyToOne
  @MapsId("studentId")
  @JoinColumn(name = "student_id")
  Student student;

  @ManyToOne
  @MapsId("courseId")
  @JoinColumn(name = "course_id")
  Course course;

  int rating;
}