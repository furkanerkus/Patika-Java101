import java.util.Scanner;

class MultipleOfNumber {
  public static void main(String[] args) {
    int number;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen bir sayı giriniz: ");
    number = input.nextInt();

    System.out.println("4'ün Katları: ");
    for(int i = 1; i <= number; i *= 4 ) {
      System.out.print(i + " ");
    }
    
    System.out.println("\n");
    System.out.println("5'ün Katları: ");
    for(int i = 1; i <= number; i *= 5 ) {
      System.out.print(i + " ");
    }
  } 
}