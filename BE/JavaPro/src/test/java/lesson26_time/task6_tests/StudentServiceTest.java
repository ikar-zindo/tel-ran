package lesson26_time.task6_tests;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class StudentServiceTest {

   private StudentService studentService = new StudentService();
   private StudentService emptyStudentService = new StudentService();

   @Before
   public void init() {
      studentService.createStudent("Test", 10, Degree.MASTER);
      studentService.createStudent("Test1", 20, Degree.MASTER);
      studentService.createStudent("Test2", 30, Degree.BACHELOR);
   }

   @Test
   public void CreateStudentTest() {
      Student student = studentService.getStudents().get(0);

      assertEquals("Test", student.getName());
      assertEquals(10, student.getAge());
      assertEquals(Degree.MASTER, student.getDegree());
   }

   @Test
   public void IdTest() {
      Student student = studentService.getStudents().get(2);
      assertEquals(Optional.of(3L).get(), student.getId());
   }

   @Test
   public void IsEmptyTest() {
      assertEquals(0, emptyStudentService.getCountStudents());
   }

   @Test
   public void GetStudentsListIsEmptyTest() {
      assertEquals(0, emptyStudentService.getStudents().size());
   }

   @Test
   public void GetCountStudentsTest() {
      assertEquals(3, studentService.getCountStudents());
   }

   @Test
   public void GetCountStudentsIsEmptyTest() {
      assertEquals(0, emptyStudentService.getCountStudents());
   }

   @Test
   public void GetCountStudentsByDegreeTest() {
      assertEquals(2, studentService.getCountStudentsByDegree(Degree.MASTER));
   }

   @Test
   public void GetCountStudentsIsEmptyByDegreeTest() {
      assertEquals(0, emptyStudentService.getCountStudentsByDegree(Degree.MASTER));
   }

   @Test
   public void GetAvgStudentsByDegreeTest() {
      assertEquals(0, Double.compare(20, studentService.getAvgStudents()));
   }

   @Test
   public void GetAvgStudentsIsEmptyByDegreeTest() {
      assertEquals(0, Double.compare(0.0, emptyStudentService.getAvgStudents()));
   }

   public void GetListStudentsByDegreeTest() {
   }
}