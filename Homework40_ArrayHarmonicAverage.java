class ArrayHarmonicAverage {
  public static void main(String[] args) {
    double average = 0.0;
    int[] list = {15, 13, 21, 25, 10, 5, 18, 6};

    for(int i = 0; i < list.length; i++) {
      average += 1.0 / list[i];
    }
    System.out.println("Listemim harmonik ortalaması:" + average);
  }
}