import java.util.Scanner;

class PrimeNumberFinder {
  public static void main(String[] args) {
    int counter = 0;
    System.out.println("1'den 100'e kadar olan asal sayılar: ");
    for(int i = 2; i < 100; i++) {
      for(int j = 2 ; j < i; j++){
        if(i % j == 0) {
          counter++;
          break;
        }
      }
      if(counter < 1) {
        System.out.print(i + " ");
      }
      counter = 0;
    }
  } 
}
 