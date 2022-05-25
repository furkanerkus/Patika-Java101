import java.util.Scanner;

class Login {
  public static void main(String[] args) {
    String userName, password, change, newPassword= "123456", newUserName = "Furkan";
    Boolean check = true;
    Scanner input = new Scanner(System.in);

    while(check){
      System.out.print("Kullanıcı adınız: ");
      userName = input.nextLine();
      System.out.print("Şifreniz: ");
      password = input.nextLine();
      if(userName.equals(newUserName)) {
        if(password.equals(newPassword)) {
          System.out.println("Başarılı şekilde giriş yapıldı.");
          break;
        }else {
          System.out.println("Yanlış şifre girdiniz.");
          System.out.println("Şifrenizi değiştirmek ister misiniz?");
          System.out.print("Evet, Hayır: ");
          change = input.nextLine();
          if(change.equals("Evet")) {
            System.out.print("Yeni şifrenizi giriniz: ");
            newPassword = input.nextLine();
            if(newPassword.equals(password)) {
              System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }else {
              System.out.println("Şifreniz başarılı şekilde değiştirildi.");
              password = newPassword;
            }
          }else {
            System.out.println("Lütfen şifrenizi baştan giriniz.");
        }
        }
      }else {
        System.out.println("Yanlış kullanıcı adı girdiniz.");
      } 
    }
  }  
}