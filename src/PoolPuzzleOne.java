/*
 * Created by Axel_ST on 18.03.2021
 *
 * Head First Java, 2nd Edition (RU) p. 54 ex. Pool puzzle
 */

public class PoolPuzzleOne {
   public static void main(String[] args) {
      int x = 0;
      
      while (x < 4) { // 2.5
         System.out.print("a"); // 1.2
         if (x < 1) {
            System.out.print(" "); // 1.1
         }
         System.out.print("n"); // 1.3
         if (x > 1) { // 2.3
            System.out.print(" oyster"); // 4.3
            x = x + 2; // 3.2
         }
         if (x == 1) {
            System.out.print("noys "); // 4.1
         }
         if (x < 1) { // 2.2
            System.out.print("oise "); // 4.2
         }
         System.out.println("");
         x = x + 1; // 3.1
      }
   }
}
