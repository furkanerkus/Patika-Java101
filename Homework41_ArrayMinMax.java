import java.util.*;

class ArrayMinMax {
  public static void main(String[] args) {
    int number, nearestNumber1, nearestNumber2;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen bir sayı giriniz: ");
    number = input.nextInt();
    
    int[] list = {15, -50, 12, -8, 35, -12, 45};

    /*
    nearestNumber1 = list[0];
    nearestNumber2 = list[0];

    int[] newList = list; 
    Arrays.sort(newList);

    for(int i =  0; i < newList.length; i++) {
      if(number < newList[i]) {
        nearestNumber1 = newList[i-1];
        nearestNumber2 = newList[i];
        break;
      }
    }
    System.out.println(Arrays.toString(newList));
    System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearestNumber1);
    System.out.println("Girilen sayıdan büyük en yakın sayı : " + nearestNumber2); 
    */

    int difference1 = list[0] - number;
    int difference2 = list[0] - number;
    nearestNumber1 = list[0];
    nearestNumber2 = list[0];

    for(int i = 0; i < list.length; i++) {
      if(list[i] < number && list[i] - number < 0) {
        if(number - list[i] < difference1){
          nearestNumber1 = list[i];
          difference1 = number - nearestNumber1;
        }
      }

      if(list[i] > number && list[i] - number > 0) {
        if(list[i] - number < difference2){
          nearestNumber2 = list[i];
          difference2 = nearestNumber2 - number;
        }
      }
    }
    System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearestNumber1);
    System.out.println("Girilen sayıdan büyük en yakın sayı : " + nearestNumber2); 
  }
}
    