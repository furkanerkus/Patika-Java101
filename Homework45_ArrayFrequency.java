import java.util.*;

class ArrayFrequency {
  public static void main (String[] args) { 
    int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
    int[] checkArr = new int[arr.length];
    int startIndex = 0;
    
    for(int i = 0; i < arr.length; i++) {
      boolean check = false;
      for(int j = 0; j < checkArr.length; j++ ) {
        if(arr[i] == checkArr[j]) {
          check = true;
        }
      }
      if(!check) {
        checkArr[startIndex++] = arr[i];
      }
    }

    System.out.println("Dizi: " + Arrays.toString(arr));
    System.out.println("Tekrar Sayıları");

    for(int i = 0; i < checkArr.length; i++) {
      int counter = 0;
      for(int j = 0; j < arr.length; j++) {
        if(checkArr[i] == arr[j]) {
          counter++;
        }
      }
      if(counter == 0) {
        break;
      }else{
        System.out.println(checkArr[i] + " sayısı " + counter + " kere tekrar edildi.");
      }
    }
  }
}