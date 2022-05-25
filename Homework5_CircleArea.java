import java.util.Scanner;

class CircleArea {
  public static void main(String[] args) {
    Double radius, angle,area1, area2, perimeter1, perimeter2, pi= 3.14;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen yarıçapı giriniz: ");
    radius = input.nextDouble();
    System.out.print("Lütfen açı giriniz: ");
    angle = input.nextDouble();
    perimeter1 = 2 * pi * radius;
    area1 = pi * radius *radius;
    perimeter2 = 2 * pi * radius * angle / 360;
    area2 = pi * radius *radius * angle / 360;
    
    System.out.println("Dairenin çevresi: " + perimeter1);
    System.out.println("Dairenin alanı: " + area1);
    System.out.println("Dairenin " + angle + " derece açılık çevresi: " + perimeter2);
    System.out.println("Dairenin " + angle + "derece açılık alanı: " + area2);
    
  }
}