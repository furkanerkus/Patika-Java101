import java.util.Scanner;

class AverageCalculator {
  public static void main(String[] args) {
    int number, i, average, total = 0, counter = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen bir sayı giriniz: ");
    number = input.nextInt();

    i = 1;

    while(i != number + 1) {
      if (i % 12 == 0) {
        total += i;
        counter++;
      }
      i++;
    }
    average = total / counter;
    System.out.println("Sonuç: " + average);
  } 
}