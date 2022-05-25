import java.util.Scanner;

class HcfLcm {
  public static void main(String[] args) {
    int number1, number2, hcf = 1, lcm = 1;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen ilk sayıyı giriniz: ");
    number1 = input.nextInt();
    System.out.print("Lütfen ikinci sayıyı giriniz: ");
    number2 = input.nextInt();

    int i = Math.min(number1, number2);
    while(hcf <= i) {
      if( number1 % i == 0 && number2 % i == 0) {
        hcf = i;
      }
      i--;
    }
    System.out.println("Girdiğiniz sayılarının EBOB'u : " + hcf);
   
    int x = number1 * number2;
    while(x >= Math.max(number1, number2)) {
      if( x % number1 == 0 && x % number2 == 0) {
        lcm = x;
      }
      x--;
    }
    System.out.println("Girdiğiniz sayılarının EKOK'u : " + lcm);
  } 
}