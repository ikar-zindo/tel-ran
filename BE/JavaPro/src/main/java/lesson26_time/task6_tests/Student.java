package lesson26_time.task6_tests;

public class Student {

   private Long id;
   private String name;
   private int age;
   private Degree degree;

   protected Student(Long id, String name, int age, Degree degree) {
      this.id = id;
      this.name = name;
      this.age = age;
      this.degree = degree;
   }

   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public Degree getDegree() {
      return degree;
   }

   public void setDegree(Degree degree) {
      this.degree = degree;
   }
}
