import java.util.Scanner;

class Gpa {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    int mathematic, physic, chemistry, turkish, history, music;
    System.out.print("Lütfen matematik notunuzu girin:");
    mathematic = input.nextInt();
    
    System.out.print("Lütfen fizik notunuzu girin:");
    physic = input.nextInt();
    
    System.out.print("Lütfen kimya notunuzu girin:");
    chemistry = input.nextInt();
    
    System.out.print("Lütfen türkçe notunuzu girin:");
    turkish = input.nextInt();
    
    System.out.print("Lütfen tarih notunuzu girin:");
    history = input.nextInt();
    
    System.out.print("Lütfen müzik notunuzu girin:");
    music = input.nextInt();

    Double average = (mathematic + physic + chemistry + turkish + history + music) / 6.0;
    System.out.println("Ortalamınız: " + average);
    
    boolean status = average > 60;
    String output = status ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";
    System.out.println(output);
  }
}