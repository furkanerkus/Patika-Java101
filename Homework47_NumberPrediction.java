import java.util.*;

class NumberPrediction {
  public static void main (String[] args) {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    
    int right = 0;
    int prediction;
    int[] wrong = new int[6];
    boolean isWin = false;
    
    int number= rand.nextInt(1000);
    //int number = (int) (Math.random() * 100);

    while(right < 6) {
      System.out.print("Lütfen tahmininizi giriniz: ");
      prediction = input.nextInt();

      if(prediction < 0 || prediction > 100) {
        System.out.println("Lütfen doğru aralıkta bir değer girin!");
        continue;
      }

      if(prediction == number) {
        System.out.println("Tebrikler, Doğru tahmin. Tahmin ettiğinzi sayı: " + number);
        isWin = true;
        break;
      }else {
        
        System.out.println("Maalesef hatalı tahmin yaptınız!");
        if(prediction < number) {
          System.out.println(prediction + " sayısı tahmin edilen sayıdan küçüktür");
        }else {
          System.out.println(prediction + " sayısı tahmin edilen sayıdan büyüktür");
        }
        wrong[right] = prediction;
        right++;
        System.out.println("Kalan hakkınız: " + (6 - right));
      }
    }

    if(!isWin) {
      System.out.println("Kaybettiniz!");
      System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
    }
    System.out.println(number);    
  }
}