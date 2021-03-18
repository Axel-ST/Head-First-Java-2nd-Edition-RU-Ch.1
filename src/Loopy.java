/*
 * Created by Axel_ST on 18.03.2021
 *
 * Head First Java, 2nd Edition (RU) p. 42
 */

public class Loopy {
   public static void main(String[] args) {
      int x = 1;
      System.out.println("Перед циклом");
      while (x < 4) {
         System.out.println("В цикле");
         System.out.println("Значение х = " + x);
         x++;
      }
      System.out.println("После цикла");
   }
}
