import java.util.Scanner;

class Taximeter {
  public static void main(String[] args) {
    Double pricePerKm = 2.2, km, totalPrice;
    int openingPrice = 10;
    Scanner input = new Scanner(System.in);

    System.out.print("Km giriniz: ");
    km = input.nextDouble();

    totalPrice = openingPrice + (km * pricePerKm);

    totalPrice = (totalPrice < 20) ? 20 : totalPrice;
    System.out.println("Toplam Tutar: " + totalPrice); 
  }
}