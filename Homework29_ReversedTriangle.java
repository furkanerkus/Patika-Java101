import java.util.Scanner;

class ReversedTriangle {
  public static void main(String[] args) {
    int number;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen bir sayı giriniz: ");
    number = input.nextInt();

    for(int i = 1; i <= number; i++) {
      for(int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for(int k = 1; k <= (2 * (number - i) + 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  } 
}