package space.bum.jpa.n2n.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import space.bum.jpa.n2n.entity.Course;
import space.bum.jpa.n2n.entity.CourseRating;
import space.bum.jpa.n2n.entity.CourseRatingKey;
import space.bum.jpa.n2n.entity.CourseRegistration;
import space.bum.jpa.n2n.entity.Student;
import space.bum.jpa.n2n.repository.CourseRatingRepository;
import space.bum.jpa.n2n.repository.CourseRepository;
import space.bum.jpa.n2n.repository.RegistrationRepository;
import space.bum.jpa.n2n.repository.StudentRepository;

@Controller
@RequestMapping
@AllArgsConstructor
public class StudentController {

  private StudentRepository studentRepository;
  private CourseRepository courseRepository;
  private CourseRatingRepository courseRatingRepository;
  private RegistrationRepository registrationRepository;

  @GetMapping("/")
  public String showHome() {
    var course = courseRepository.save(new Course());
    var student = new Student();

    student.getLikedCourses().add(course);
    student = studentRepository.save(student);

    var crKey = new CourseRatingKey(student.getId(), course.getId());
    var courseRating = new CourseRating(crKey, student, course, 5);
    courseRatingRepository.save(courseRating);

    var regis = new CourseRegistration();
    regis.setCourse(course);
    regis.setStudent(student);
    regis.setRegisteredAt(LocalDateTime.now());
    regis.setGrade(3);
    registrationRepository.save(regis);

    return "home";
  }

}
