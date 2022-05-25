import java.util.Scanner;

class PrimeNumber {
  static void primeNumber(int number) {
    int counter = 0;
    for(int i = 2; i < number; i++){
      if( number % i == 0){
        counter++;
      }
    }
    if(counter == 0){
      System.out.println(number + " sayısı asal sayıdır.");
    }else {
      System.out.println(number + " sayısı asal sayı değildir.");
    }
  }
  
  public static void main(String[] args) {
    int number;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen asallığını kontrol etmek istediğiniz sayıyı girin: ");
    number = input.nextInt();

    primeNumber(number);
  }
}