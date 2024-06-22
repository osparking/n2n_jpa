package space.bum.jpa.n2n.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Embeddable
@Data
@AllArgsConstructor
@EqualsAndHashCode
public class CourseRatingKey implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "student_id")
  Long studentId;

  @Column(name = "course_id")
  Long courseId;
}
