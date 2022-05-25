import java.util.*;

class DuplicateEvenNumbers {

  static boolean isFind(int[] arr, int value) {
    for(int i : arr) {
      if(value == i) {
        return true;
      }
    }
    return false;
  }

  
  public static void main(String[] args) {
    int[] list = {1, 3, 8, 3, 6, 4, 8, 1, 6, 5, 8, 4};
    int[] duplicated = new int[list.length];
    int startIndex = 0;

    for(int i = 0; i < list.length; i++) {
      for(int j = 0; j < list.length; j++){
        if((i != j) && (list[i] == list[j])) {
          if((!isFind(duplicated, list[i])) && (list[i] % 2 == 0)) {
            duplicated[startIndex++] = list[i];
          }
          break;
        }
      }
    }
    System.out.println(Arrays.toString(duplicated));
  }
}