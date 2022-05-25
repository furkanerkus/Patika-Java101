import java.util.Scanner;

class LeapYear {
  public static void main(String[] args) {
    int year;
    boolean leapYear = false;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen bir yıl giriniz: ");
    year = input.nextInt();

    if(year % 4 == 0) {
      if(year % 100 == 0) {
        if(year % 400 == 0) {
           leapYear = true;
        }
      }else {
        leapYear = true;
      }
    }

    if(leapYear == true) {
      System.out.println(year + " bir artık yıldır.");
    }else {
      System.out.println(year + " bir artık yıl değildir.");
    }
  }  
}