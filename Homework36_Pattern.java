import java.util.Scanner;

class Pattern {
  static int number;
  static int pattern (int number1) {
    if(number1 <= 0){
      return reverse(number1);
    }else {
      System.out.print(number1 + " ");
      return pattern(number1 - 5);
    }
  }

  static int reverse(int number1) {
    if(number1 == getNumber()) {
      System.out.print(number1);
      return 0;
    }else {
      System.out.print(number1 + " ");
      return reverse(number1 + 5);
    }
  }

  public static int getNumber() { 
		return number; 
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen desen oluşturmak istediğiniz sayıyı giriniz: ");
    number = input.nextInt();
    pattern(number);
  }
}