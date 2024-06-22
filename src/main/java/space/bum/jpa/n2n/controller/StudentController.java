package space.bum.jpa.n2n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import space.bum.jpa.n2n.entity.Student;
import space.bum.jpa.n2n.repository.CourseRepository;
import space.bum.jpa.n2n.repository.StudentRepository;

@Controller
@RequestMapping
@AllArgsConstructor
public class StudentController {

  private StudentRepository studentRepository;
  private CourseRepository courseRepository;

  @GetMapping("/")
  public String showHome() {
    var student = new Student();
    var result = studentRepository.save(student);

    return "home";
  }

}
