import java.util.*;

class Cumulative {
  public static void main(String[] args) {
    int math, physics,turkish, chem, music, total = 0;
    Double avarage, counter = 0.0;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen matematik notunuzu giriniz: ");
    math = input.nextInt();
    if(0 <= math && math <= 100) {
      total += math;
      counter ++;
    }

    System.out.print("Lütfen fizik notunuzu giriniz: ");
    physics = input.nextInt();
    if(0 <= physics && physics <= 100) {
      total += physics;
      counter ++;
    }
    
    System.out.print("Lütfen türkçe notunuzu giriniz: ");
    turkish = input.nextInt();
    if(0 <= turkish && turkish <= 100) {
      total += turkish;
      counter ++;
    }
      
    System.out.print("Lütfen kimya notunuzu giriniz: ");
    chem = input.nextInt();
    if(0 <= chem && chem <= 100) {
      total += chem;
      counter ++;
    }
      
    System.out.print("Lütfen müzik notunuzu giriniz: ");
    music = input.nextInt();
    if(0 <=music && music <= 100) {
      total += music;
      counter ++;  
    }
      
    avarage = total / counter;

    if(55 <= avarage) {
      System.out.println("Tebrikler sınıfı geçtiniz.");
    }else {
      System.out.println("Üzgünüz sınıfta kaldınız");
    }
    System.out.println("Not ortalamanız: " + avarage);
  }  
}