import java.util.Scanner;

class TriangleWithStars {
  public static void main(String[] args) {
    int number;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen bir sayı giriniz: ");
    number = input.nextInt();
    
    /*
    for(int i = 1; i <= number; i++) {
      for(int x = number - i; x >= 0; x--){
        System.out.print(" ");
      }
      for(int y = 1; y <= (2 * i) - 1; y++){
        System.out.print("*");
      }
      System.out.println("");
      
    }
    */
    
    int i = 1;
    while(i <= number) {
      
      int k = number - i;
      while(k >= 0) {
        System.out.print(" ");
        k--;
      }
      
      int l = 1;
      while(l <= (2 * i) - 1){
        System.out.print("*");
        l++;
      }
      System.out.println();
      i++;
    }
  
    int x = 1;
    while(x < number) {
      
      int y = 1;
      while(y <= x + 1) {
        System.out.print(" ");
        y++;
      }
      
      int z = 1;
      while(z <= (2 * (number - x)) - 1){
        System.out.print("*");
        z++;
      }
      System.out.println();
      x++;
    }
  } 
}