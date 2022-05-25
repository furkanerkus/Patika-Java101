import java.util.Scanner;

class BodyMassIndex {
  public static void main(String[] args) {
    Double height, weight, bodyMassIndex;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen boyunuzu giriniz(metre olarak): ");
    height = input.nextDouble();
    System.out.print("Lütfen kilonuzu giriniz: ");
    weight= input.nextDouble();

    bodyMassIndex = weight / (height * height);
    System.out.println(bodyMassIndex);
  }
}