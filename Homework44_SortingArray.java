import java.util.*;

class SortingArray {
  public static void main(String[] args) {
    int arrayLength;
    int startIndex = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen dizi boyutunu giriniz: ");
    arrayLength = input.nextInt();
    int[] list = new int[arrayLength];
    

    while(startIndex < arrayLength) {
      int number;
      System.out.print("Lütfen dizinin " + (startIndex+1) + ". elemanını giriniz: ");
      number = input.nextInt();
      list[startIndex++] = number;
      number++;
    }
    Arrays.sort(list);
    System.out.println(Arrays.toString(list));
  }
}