import java.util.Scanner;

class AmountOfVAT {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double sum, sumWithVat, sumVat, vat1= 0.18, vat2= 0.08;

    System.out.print("Tutarı giriniz: ");
    sum = input.nextDouble();
    
    if(0 <= sum && sum <= 1000) {
      sumVat = sum * vat1;
      sumWithVat = sum + sumVat;
      System.out.println("KDV2'siz Tutar: " + sum);
      System.out.println("KDV Tutarı: " + sumVat);
      System.out.println("Toplam Tutar: " + sumWithVat);
      System.out.println("KDV Oranı: " + vat1);
    }else {
      sumVat = sum * vat2;
      sumWithVat = sum + sumVat;
      System.out.println("KDV2'siz Tutar: " + sum);
      System.out.println("KDV Tutarı: " + sumVat);
      System.out.println("Toplam Tutar: " + sumWithVat);
      System.out.println("KDV Oranı: " + vat2);
    }
  }
}