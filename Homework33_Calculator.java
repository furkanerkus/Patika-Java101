import java.util.Scanner;

class Calculator {

  static int sum (int number1, int number2) {
    int total = 0;
    total = number1 + number2;
    System.out.println(total);
    return total;
  }

  static int sub (int number1, int number2) {
    int total = 0;
    total = number1 - number2;
    System.out.println(total);
    return total;
  }

  static int mult (int number1, int number2) {
    int total = 0;
    total = number1 * number2;
    System.out.println(total);
    return total;
  }

  static int div (int number1, int number2) {
    int total = 0;
    if(number2 != 0) {
      total = number1 / number2;
      System.out.println(total);
      return total;
    }else {
      System.out.println("İkinci sayı sıfırdan farklı olmalı.");
      return 0;
    }
    
  }

  static int exp (int number1, int number2) {
    int total = 1;
    for(int i = 1; i <= number2; i ++){
      total *= number1;
    }
    System.out.println(total);
    return total;
  }

  static int mod (int number1, int number2) {
    int total = 1;
    total = number1 % number2;
    System.out.println(total);
    return total;
  }

  static int rectPerimeter (int number1, int number2) {
    int perimeter;
    perimeter = (number1 +number2) * 2;
    System.out.print("Dikdrtgenin çevresi: ");
    System.out.println(perimeter);
    return perimeter;
  }

  static int rectArea (int number1, int number2) {
    int area;
    area = number1 * number2;
    System.out.print("Dikdrtgenin alanı: ");
    System.out.println(area);
    return area;
  }
  
  
  public static void main(String[] args) {
    int number1, number2, select;
    Scanner input = new Scanner(System.in);
    
    String menu = "1- Toplama işlemi:\n" + "2- Çıkarma işlemi:\n" + "3- Çarpma işlemi:\n" + "4- Bölme işlemi:\n" + "5- Üslü sayı hesaplama:\n" + "6- Mod alma:\n" + "7- Dikdrtgen çevre hesabı:\n" + "8-Dikdrtgen alan hesabı:\n" +  "9- Çıkış yap.";

    System.out.println(menu);
    while(true) {
      System.out.print("Bir işlem seçiniz: ");
      select = input.nextInt();
      if(select == 9) {
        break;
      }
      
      System.out.print("İlk sayıyı giriniz: ");
      number1 = input.nextInt();
      
      System.out.print("İkinci sayıyı giriniz: ");
      number2 = input.nextInt();
      
      switch(select) {
        case 1:
          sum(number1, number2);
          break;
        case 2:
          sub(number1, number2);
          break;
        case 3:
          mult(number1, number2);
          break;
        case 4:
          div(number1, number2);
          break;
        case 5:
          exp(number1, number2);
          break;
        case 6:
          mod(number1, number2);
          break;
        case 7:
          rectPerimeter(number1, number2);
          break;
        case 8:
          rectArea(number1, number2);
          break;
        default:
          System.out.println("Lütfen geçerli bir sayı giriniz!");
          break;
      }
    }
  }
}