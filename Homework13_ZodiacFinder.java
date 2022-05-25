import java.util.Scanner;

class ZodiacFinder {
  public static void main(String[] args) {
    int day, month;
    String zodiac = "";
    boolean isError = false;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen doğdunuz ayı sayı olarak yazınız: ");
    month = input.nextInt();
    if(month < 1 || month > 12) {
      System.out.println("Lütfen geçerli bir ay seçiniz.");
    }
    
    System.out.print("Lütfen doğdunuz günü sayı olarak yazınız: ");
    day = input.nextInt();
    
    if (month == 1) {
      if(day < 1 || day > 31) {
         isError = true;
      }else if ( day <= 21) {
        zodiac = "Oğlak";
      }else {
        zodiac = "Kova";
      }
    }else if (month == 2) {
      if(day < 1 || day > 28) {
         isError = true;
      }else if ( day <= 19) {
        zodiac = "Kova";
      }else {
        zodiac = "Balık";
      }
    }else if (month == 3) {
      if(day < 1 || day > 31) {
         isError = true;
      }else if ( day <= 20) {
        zodiac = "Balık";
      }else {
        zodiac = "Koç";
      }
    }else if (month == 4) {
      if(day < 1 || day > 30) {
         isError = true;
      }else if ( day <= 20) {
        zodiac = "Koç";
      }else {
        zodiac = "Boğa";
      }
    }else if (month == 5) {
      if(day < 1 || day > 31) {
         isError = true;
      }else if ( day <= 21) {
        zodiac = "Boğa";
      }else {
        zodiac = "İkizler";
      }
    }else if (month == 6) {
      if(day < 1 || day > 30) {
         isError = true;
      }else if ( day <= 22) {
        zodiac = "İkizler";
      }else {
        zodiac = "Yengeç";
      }
    }else if (month == 7) {
      if(day < 1 || day > 31) {
         isError = true;
      }else if ( day <= 22) {
        zodiac = "Yengeç";
      }else {
        zodiac = "Aslan";
      }
    }else if (month == 8) {
      if(day < 1 || day > 31) {
         isError = true;
      }else if ( day <= 22) {
        zodiac = "Aslan";
      }else {
        zodiac = "Başak";
      }
    }else if (month == 9) {
      if(day < 1 || day > 30) {
         isError = true;
      }else if ( day <= 22) {
        zodiac = "Başak";
      }else {
        zodiac = "Terazi";
      }
    }else if (month == 10) {
      if(day < 1 || day > 31) {
         isError = true;
      }else if ( day <= 22) {
        zodiac = "Terazi";
      }else {
        zodiac = "Akrep";
      }
    }else if (month == 11) {
      if(day < 1 || day > 30) {
         isError = true;
      }else if ( day <= 21) {
        zodiac = "Akrep";
      }else {
        zodiac = "Yay";
      }
    }else if (month == 12) {
      if(day < 1 || day > 31) {
         isError = true;
      }else if ( day <= 21) {
        zodiac = "Yay";
      }else {
        zodiac = "Oğlak";
      }
    }
    
    if (isError == true){
      System.out.println("Lütfen geçerli bir gün se1çiniz.");
    }else{
      System.out.println("Burcunuz: " + zodiac);
    }
  }  
}