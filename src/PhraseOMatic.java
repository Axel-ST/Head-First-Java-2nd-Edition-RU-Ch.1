/*
 * Created by Axel_ST on 18.03.2021
 *
 * Head First Java, 2nd Edition (RU) p. 46
 */

public class PhraseOMatic {
   public static void main(String[] args) {
      String[] wordListOne = {"круглосуточный", "трехзвенный", "пятикилометровый", "взаимный",
              "обоюдный выигрыш", "фронтэнд", "веб-технологичный", "проникающий", "умный",
              "шесть сигм", "динамический", "метод критического пути"};
      String[] wordListTwo = {"уполномоченного", "трудного", "чистого продукт", "ориентированного",
              "центрального", "распределенного", "кластеризованного", "фирменного", "нестандартного ума",
              "позиционированного", "сетевого", "сфокусированного", "выгодного", "выровненного",
              "нацеленого на", "общего", "совместного", "ускоренного"};
      String[] wordListThree = {"процесса", "пункта разгрузки", "выхода из положения", "типа структуры",
              "таланта", "подхода", "уровня завоеванного внимания", "портала", "периода времени", "обзора",
              "образца", "пункта следования"};
      
      int oneLength = wordListOne.length;
      int twoLength = wordListTwo.length;
      int threeLength = wordListThree.length;
      
      int rand1 = (int) (Math.random() * oneLength);
      int rand2 = (int) (Math.random() * twoLength);
      int rand3 = (int) (Math.random() * threeLength);
      
      String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
      System.out.println("All that we need is " + phrase);
   }
}
