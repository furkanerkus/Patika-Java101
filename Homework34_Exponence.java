import java.util.Scanner;

class Exponence{
  static int exponence(int number1,int number2) {
    if(number2 == 0) {
      return 1;
    }
    return (exponence(number1, number2 - 1) * number1);
  }
  
  public static void main(String[] args) {
    int number1, number2;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen üssü alıncak sayıyı giriniz: ");
    number1 = input.nextInt();
    System.out.print("Lütfen üssü sayıyı giriniz: ");
    number2 = input.nextInt();

    System.out.println(exponence(number1, number2));
  }
}