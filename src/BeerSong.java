/*
 * Created by Axel_ST on 18.03.2021
 *
 * Head First Java, 2nd Edition (RU) p. 44
 *
 * My version of this exercise
 */

public class BeerSong {
   public static void main(String[] args) {
      int beerNum = 99;
      String word = "бутылок (бутылки)";
         System.out.println(beerNum + " " + word + " пива на столе");
      
      while (beerNum > 0) {
         if (beerNum == 1)
            word = "бутылка"; // на последний прогон, одна бутылка
   
         System.out.println(beerNum + " " + word + " пива на столе");
         System.out.println(beerNum + " " + word + " пива");
         System.out.println("Возьми одну, пусти по кругу");
         System.out.println();
         beerNum--;
      }
      System.out.println("Закончилось..");
   }
}
