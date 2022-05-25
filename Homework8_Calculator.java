import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {
    int number1, number2, selection;
    Scanner input = new Scanner(System.in);

    System.out.print("Birinci sayıyı giriniz: ");
    number1 = input.nextInt();
    System.out.print("İkinci sayıyı giriniz: ");
    number2 = input.nextInt();

    System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
    System.out.print("Seiçniz: ");
    selection = input.nextInt();
  
    switch(selection) {
      case 1:
        System.out.println(number1 + number2);
        break;
      case 2:
        System.out.println(number1 - number2);
        break;
      case 3:
        System.out.println(number1 * number2);
        break;
      case 4:
        System.out.println(number1 / number2);
        break;
      default:
        System.out.println("Doğru bir seçim yapınız!");
    }
  }  
}