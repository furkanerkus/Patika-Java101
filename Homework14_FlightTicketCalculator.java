import java.util.Scanner;

class FlightTicketCalculator {
  public static void main(String[] args) {
    int distance, age, ticketType;
    Double distanceIndex = 0.1, normalPrice, age12Factor = 0.5, age24Factor = 0.1, age65Factor = 0.3, roundTripFactor = 0.2;
    boolean isError = false;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen mesafeyi km cinsinden girin: ");
    distance = input.nextInt();
    if(distance < 1 ) {
      isError = true;
    }
    
    System.out.print("Lütfen yaşınızı girin: ");
    age = input.nextInt();
    if(age < 1 ) {
      isError = true;
    }
    
    System.out.print("Lütfen uçuş tipinizi seçin seiçn(1 => Tek Yön , 2 => Gidiş Dönüş): ");
    ticketType = input.nextInt();
    if(!(ticketType == 1 || ticketType == 2) ) {
      isError = true;
    }

    normalPrice = distanceIndex * distance;

    if(isError == true) {
      System.out.println("Hatalı veri girdiniz!");
    }else {
      if(age <= 12) {
        normalPrice = normalPrice * (1 - age12Factor);
      }else if(age <= 24) {
        normalPrice = normalPrice * (1 - age24Factor);
      }else if(age >= 65) {
        normalPrice = normalPrice * (1 - age65Factor);
      }
    
      if(ticketType == 2) {
        normalPrice = normalPrice * (1 - roundTripFactor);
        normalPrice *= 2;
      }
      System.out.print("Toplam Tutar: " + normalPrice + " TL");
    }
  }  
}