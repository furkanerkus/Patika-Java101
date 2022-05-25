import java.util.Scanner;

class Sorting {
  public static void main(String[] args) {
    int number1, number2, number3;
    Scanner input = new Scanner(System.in);

    System.out.print("İlk sayıyı giriniz: ");
    number1 = input.nextInt();
    System.out.print("İkinci sayıyı giriniz: ");
    number2 = input.nextInt();
    System.out.print("Üçüncü sayıyı giriniz: ");
    number3 = input.nextInt();

    if(number1 > number2 && number1 > number3) {
      if (number2 > number3){
        System.out.println("birinci sayı > ikinci sayı > üçüncü sayı");
      }else {
        System.out.println("birinci sayı > üçüncü sayı > ikinci sayı");
      }
    }else if(number2 > number1 && number2 > number3) {
      if (number1 > number3){
        System.out.println("ikinci sayı > birinci sayı > üçüncü sayı");
      }else {
        System.out.println("ikinci sayı > üçüncü sayı > birinci sayı");
      }
    }else {
      if (number1 > number2){
        System.out.println("üçüncü sayı > birinci sayı > ikinci sayı");
      }else {
        System.out.println("üçüncü sayı > ikinci sayı > birinci sayı");
      }
    }
  }  
}