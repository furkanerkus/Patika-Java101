class ArrayMaxMin {
  public static void main(String[] args) {
    int[] list = {12, 26, 32, -50, 23, -16, -8, 35, -12, -36, 45};
    int min = list[0];
    int max = list[0];

    for(int i = 0; i < list.length; i++) {
      if(min > list[i]) {
        min = list[i];
      }

      if(max < list[i]) {
        max =list[i];
      }
    }
    System.out.println("Listenin en büyük elemanı: " + max);
    System.out.println("Listenin en küçük elemanı: " + min);    
  }
}