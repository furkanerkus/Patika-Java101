import java.util.*;

class Transpose {

  public static int[][] transpose(int[][] matrix) {
    int[][] transpose = new int[matrix[0].length][matrix.length];

    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[0].length; j++) {
        transpose[j][i] = matrix[i][j];
      }
    }
    return transpose;
  }
  
  public static void main (String[] args) { 
    int[][] matr = {{1,2,3}, {4,5,6}};
    
    for (int[] row : transpose(matr)){
      for(int col : row){
        System.out.print(col);
      }
      System.out.println(row);
    }
  }
}