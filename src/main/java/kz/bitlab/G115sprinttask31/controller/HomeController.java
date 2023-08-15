package kz.bitlab.G115sprinttask31.controller;

import java.util.List;
import kz.bitlab.G115sprinttask31.db.DBManager;
import kz.bitlab.G115sprinttask31.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String homePage(Model model) {
    List<Student> students = DBManager.getStudents();
    model.addAttribute("studenty", students);
    return "home";
  }

  @GetMapping("/add-student")
  public String addStudentPage() {
    return "add-student";
  }

  @PostMapping("/add-student")
  public String addStudent(Student student) {
    DBManager.addStudent(student);
    return "redirect:/";
  }
}
