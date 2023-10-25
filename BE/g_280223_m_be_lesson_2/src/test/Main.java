package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.MathService;
import services.StringService;

public class Main {
   public static void main(String[] args) {

      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//      MathService service = (MathService) context.getBean("math");
      MathService service = context.getBean(MathService.class);
      StringService stringService = context.getBean(StringService.class);
//      BooleanService booleanService = context.getBean(BooleanService.class);

      System.out.println(service.calculate(3, 5));
      System.out.println(stringService.getString("Hello", "World"));
//      System.out.println(booleanService.get(true, true));

      context.close();
   }
}