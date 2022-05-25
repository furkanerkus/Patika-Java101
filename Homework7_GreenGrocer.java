import java.util.Scanner;

class GreenGrocer {
  public static void main(String[] args) {
    Double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.0;
    double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg, total;
    Scanner input = new Scanner(System.in);

    System.out.print("Armut Kaç Kilo ?: ");
    pearKg = input.nextDouble();
    System.out.print("Elma Kaç Kilo ?: ");
    appleKg = input.nextDouble();
    System.out.print("Domates Kaç Kilo ?: ");
    tomatoKg = input.nextDouble();
    System.out.print("Muz Kaç Kilo ?: ");
    bananaKg = input.nextDouble();
    System.out.print("Patlıcan Kaç Kilo ?: ");
    eggplantKg = input.nextDouble();

    total = (pear * pearKg) + (apple * appleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (eggplant * eggplantKg);
    System.out.print("Toplam Tutar: " + total + " TL");
  }  
}