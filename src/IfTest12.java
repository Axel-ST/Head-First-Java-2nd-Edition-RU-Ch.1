/*
 * Created by Axel_ST on 18.03.2021
 *
 * Head First Java, 2nd Edition (RU) p. 43
 */

public class IfTest12 {
   public static void main(String[] args) {
      int x = 3;
      
      if (x == 3)
         System.out.println("х равно 3");
      System.out.println("Напишет в любом случае");
      
      x = 2;
      
      if (x == 3)
         System.out.println("х равно 3");
      else
         System.out.println("х не равно 3");
      System.out.println("Напишет в любом случае");
   }
}
