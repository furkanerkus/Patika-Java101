import java.util.Scanner;

class TriangeArea {
  public static void main(String[] args) {
    int edge1, edge2, edge3, edgeLength;
    Double area, u;
    Scanner input = new Scanner(System.in);

    System.out.print("1. Kenar Ölçüsünü Giriniz:");
    edge1 = input.nextInt();
    System.out.print("2. Kenar Ölçüsünü Giriniz:");
    edge2 = input.nextInt();
    System.out.print("3. Kenar Ölçüsünü Giriniz:");
    edge3 = input.nextInt();

    edgeLength = (edge1 + edge2 + edge3);
    u = (edgeLength / 2.0);
    area = Math.sqrt(u * (u - edge1) * (u - edge2) * (u - edge3));
    System.out.println("Alan: " + area);
  }
}