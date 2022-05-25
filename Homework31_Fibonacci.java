import java.util.Scanner;

class Fibonacci {
  public static void main(String[] args) {
    int firstNumber = 0, secondNumber = 1, stepNumber, total = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen görmek istediğiniz fibonacci adımını yazınız: ");
    stepNumber = input.nextInt();
    
    for(int i = 3; i <= stepNumber; i++){
      total = firstNumber + secondNumber;
      
      System.out.print(firstNumber);
      System.out.print(" + ");
      System.out.print(secondNumber);
      System.out.print(" = ");
      System.out.print(total);
      System.out.println(); 

      firstNumber = secondNumber;
      secondNumber = total;
    }
  } 
}