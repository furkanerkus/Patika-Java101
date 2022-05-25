import java.util.Scanner;

class Exponentiation {
  public static void main(String[] args) {
    int number1, number2,total = 1;
    Scanner input = new Scanner(System.in);

    System.out.print("Üssü alınacak sayıyı giriniz: ");
    number1 = input.nextInt();
    System.out.print("Üs olacak sayıyı giriniz: ");
    number2 = input.nextInt();

    for(int i = 1; i <= number2; i++) {
      total *= number1;
    }
    System.out.print("Cevap: " + total);
  } 
}