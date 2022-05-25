import java.util.Scanner;

class EventProponent {
  public static void main(String[] args) {
    int heat;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen sıcaklığı giriniz: ");
    heat = input.nextInt();

    if (heat < 5) {
      System.out.println("Sıcaklık" + heat + " derece ve kayağa gitmek için ideal.");
    }else if (heat <= 9) {
      System.out.println("Sıcaklık" + heat + " derece ve sinemaya gitmek için ideal.");
    }else if (heat <= 15) {
      System.out.println("Sıcaklık" + heat + " derece ve sinemaya veya pikniğe gitmek için ideal.");
    }else if (heat <= 25) {
      System.out.println("Sıcaklık" + heat + " derece ve pikniğe gitmek için ideal.");
    }else {
      System.out.println("Sıcaklık" + heat + " derece ve yüzmek için ideal.");
    }
  }  
}