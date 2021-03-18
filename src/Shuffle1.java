/*
 * Created by Axel_ST on 18.03.2021
 *
 * Head First Java, 2nd Edition (RU) p. 50 ex. Magnets with code
 */

public class Shuffle1 {
   public static void main(String[] args) {
      
      int x = 3;
      
      while (x > 0) {
         
         if (x > 2) {
            System.out.print("a");
         }
         
         x--;
         System.out.print("-");
         
         if (x == 2) {
            System.out.print("b c");
         }
         
         x--;
         System.out.print("-");
         
         if (x == 1) {
            System.out.print("d");
            x--;
         }
      }
   }
}
