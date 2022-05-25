import java.util.Scanner;

class Atm {
  public static void main(String[] args) {
    String userName, password;
    int right = 3;
    int credit = 1500;
    int select;
    int cash;

    Scanner input = new Scanner(System.in);
    
    while(right > 0 ) {
      System.out.print("Lütfen Kullanıcı adını giriniz: ");
      userName = input.nextLine();
      System.out.print("Lütfen şifrenizi giriniz: ");
      password = input.nextLine();
  
      if(userName.equals("Furkan") && password.equals("asd123")) {
        System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
        
        do {
          System.out.print("1- Para Yatır \n2- Para Çek \n3- Bakiye Sorgula \n4- Çıkış Yap \n");
          System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
          select = input.nextInt();
          
          switch(select) {
            case 1:
              System.out.print("Yatırmak istediğiniz tutarı girin: ");
              cash = input.nextInt();
              System.out.println("Paranız hesabınıza yattı.");
              credit += cash;
              break;
            case 2:
              System.out.print("Çekmek istediğiniz tutarı girin: ");
              cash = input.nextInt();
              if(cash > credit){
                System.out.println("Yetersiz bakiye. Tekrar deneyin!");
              }else{
                credit -= cash;
              }
              break;
            case 3:
              System.out.println(credit + " TL");
              break;
            case 4:
              System.out.println("İyi günler dileriz.");
              break;
          }
        } while(select != 4);
        break;
      }else{
        right--;
        switch(right){
        case 2:
          System.out.println("Kullanıcı adı veya şifre hatalı! Lütfen tekrar deneyin!");
          System.out.println("Kalan hakkınız: " + right);
          break;
        case 1:
          System.out.println("Kullanıcı adı veya şifre hatalı! Lütfen tekrar deneyin!");
          System.out.println("Kalan hakkınız: " + right);
          break;
        case 0:
          System.out.println("Kalan hakkınız: " + right);
          System.out.println("Hesabınız bloke olmuştur. Lütfen bankanızla iletişime geçin!");
          break;
        }
      }
    }
  } 
}
 