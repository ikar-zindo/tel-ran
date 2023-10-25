package services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StringService implements InitializingBean, DisposableBean {

   public String getString(String first, String second) {
      return first + ", " + second + "!";
   }

   @Override
   public void destroy() throws Exception {
      System.out.println("StringService bean was created.");
   }

   @Override
   public void afterPropertiesSet() throws Exception {
      System.out.println("StringService bean was created.");
   }
}
