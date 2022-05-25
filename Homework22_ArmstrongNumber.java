class ArmstrongNumber {
  public static void main(String[] args) {
    int tempNumber, tempTotal, total, orderValue, orderCounter = 3;

    System.out.println("3 basamaklı Armstrong sayılar:");
    
    for(int i = 100; i <=999; i++) {
      total = 0;
      tempNumber = i;
      while(tempNumber !=0) {
        orderValue = tempNumber % 10;
        tempTotal = 1;
        for(int x = 1; x <= orderCounter; x++){
          tempTotal *= orderValue;
        }
        total += tempTotal;
        tempNumber /= 10;
      }
      if (i == total) {
        System.out.println(i);
      }
    }
  } 
}
 