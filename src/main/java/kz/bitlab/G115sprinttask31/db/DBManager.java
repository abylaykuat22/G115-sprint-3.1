package kz.bitlab.G115sprinttask31.db;

import java.util.ArrayList;
import java.util.List;
import kz.bitlab.G115sprinttask31.models.Student;
import lombok.Getter;

public class DBManager {

  @Getter
  private static List<Student> students = new ArrayList<>();

  private static Long id = 3L;

  static {
    students.add(new Student(1L, "China", "China", 90, "A"));
    students.add(new Student(2L, "Danik", "Danik", 70, "B"));
    students.add(new Student(2L, "Misha", "Misha", 60, "C"));
  }

  public static void addStudent(Student student) {
    student.setId(id);
    id++;
    if (student.getExam() >= 90) {
      student.setMark("A");
    } else if (student.getExam() >= 75) {
      student.setMark("B");
    } else if (student.getExam() >= 60) {
      student.setMark("C");
    } else if (student.getExam() >= 50) {
      student.setMark("D");
    } else {
      student.setMark("F");
    }
    students.add(student);
  }
}
