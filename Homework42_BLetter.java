class BLetter {
  public static void main(String[] args) {
    String[][] bLetter = new String[5][3];

    for(int i = 0; i < bLetter.length; i++) {
      for(int j = 0; j < bLetter[i].length; j++) {
        if(i == 0 || i == 2 || i == 4) {
          bLetter[i][j] = " * ";
        }else if(j == 0 || j == 2) {
          bLetter[i][j] = " * ";
        }else {
          bLetter[i][j] = "   ";
        }
      }
    }
    for (String[] row : bLetter){
      for(String col : row){
        System.out.print(col);
      }
      System.out.println(row);
    }
  }
}