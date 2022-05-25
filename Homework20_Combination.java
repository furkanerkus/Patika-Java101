import java.util.Scanner;

class Combination {

   public static int factorial(int n) {
    int total = 1;
    for(int i = 1; i <= n; i++) {
      total *= i;
    }
    return total;
  }
  
  public static void main(String[] args) {
    int number1, number2, result;
    Scanner input = new Scanner(System.in);

    System.out.println("Lütfen kombinasyon için sayıları giriniz(C(sayı1, sayı2)): ");
    System.out.print("sayı1: ");
    number1 = input.nextInt();
    System.out.print("sayı2: ");
    number2 = input.nextInt();

    result = factorial(number1) / (factorial(number2) * factorial(number1-number2));

    System.out.println("C(" + number1 + "," + number2 + ")= " + result);
  } 
}