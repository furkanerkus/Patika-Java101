import java.util.Scanner;

class PalindromNumber {
  static boolean isPalindrom(int number) {
    int temp = number, reverseNumber = 0, lastNumber;
    while(temp != 0){
      lastNumber = temp % 10;
      reverseNumber = (reverseNumber * 10) + lastNumber;
      temp /= 10;
    }

    if(number == reverseNumber){
      System.out.println(number + " sayısı, bir palindrom sayıdır.");
      return true;
    }
    else{
      System.out.println(number + " sayısı, bir palindrom sayısı değildir.");
      return false;
    }
  }
  
  public static void main(String[] args) {
    System.out.println(isPalindrom(465));
  } 
}