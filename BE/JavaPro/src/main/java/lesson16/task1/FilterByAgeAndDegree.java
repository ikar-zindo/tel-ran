package lesson16.task1;

public class FilterByAgeAndDegree implements Filter{
   @Override
   public boolean test(Student student) {
      return student.getAge() < 25 && student.getDegree().equals(Degree.BACHELOR);
   }
}
