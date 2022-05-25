import java.util.Scanner;

class HarmonicNumbers {
  public static void main(String[] args) {
    int number;
    Double total = 0.0;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen bir sayı giriniz: ");
    number = input.nextInt();

    for(int i = 1; i <= number; i++){
      total += (1. / i);
    }
    System.out.println("Sonuç: " + total);
  } 
}
 