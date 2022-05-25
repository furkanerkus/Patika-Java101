import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int mineNumber = 0;
    String level;
    String[][] gameMap;
    String[][] gameBoard;

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.level = "easy";
    }

    MineSweeper(int rowNumber, int colNumber, String level) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        if(level.equals("easy") || level.equals("medium") || level.equals("hard")) {
            this.level = level;
        }
        else {
            this.level = "easy";
        }
    }

    public void run() {
        Scanner input = new Scanner(System.in);

        createField();

        int counter = (this.rowNumber * this.colNumber - 1);
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!");
        while (counter > this.mineNumber) {
            showArray(this.gameBoard);
            System.out.print("Lütfen satır giriniz: ");
            int rowIndex = input.nextInt();
            System.out.print("Lütfen sütun giriniz: ");
            int colIndex = input.nextInt();
            if ((rowIndex > 0 && rowIndex <= this.rowNumber) && (colIndex > 0 && colIndex <= this.colNumber)) {
                rowIndex--;
                colIndex--;
                if (this.gameMap[rowIndex][colIndex].equals("* ")) {
                    System.out.println("Oyun bitti! Kaybettiniz...");
                    break;
                } else {
                    mineCounter(rowIndex, colIndex);
                    this.gameBoard[rowIndex][colIndex] = this.gameMap[rowIndex][colIndex];
                    counter--;
                    if(counter == this.mineNumber) {
                        System.out.println("Tebrikler! Kazandınız.");
                        break;
                    }
                }
            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz! \n");
            }
        }
        showArray(this.gameMap);
    }

    public void createField() {
        this.gameMap = new String[this.rowNumber][this.colNumber];
        this.gameBoard = new String[this.rowNumber][this.colNumber];
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                this.gameMap[i][j] = "- ";
                this.gameBoard[i][j] = "- ";
            }
        }
        placeMines();
    }

    public void placeMines() {
        switch (this.level) {
            case "easy" :
                this.mineNumber = (int)(this.rowNumber * this.colNumber / 5);
                break;
            case "medium" :
                this.mineNumber = (int)(this.rowNumber * this.colNumber / 4);
                break;
            case "hard" :
                this.mineNumber = (int)(this.rowNumber * this.colNumber / 3);
                break;
        }
        int i = 0;
        while(i <= this.mineNumber) {
            int randomRow = (int)(Math.random() * this.rowNumber);
            int randomCol = (int)(Math.random() * this.colNumber);
            if(this.gameMap[randomRow][randomCol].equals("- ")) {
                this.gameMap[randomRow][randomCol] = "* ";
                i++;
            }
        }
    }
    public void mineCounter(int i, int j) {
        if (this.gameMap[i][j] == "- ") {
            int sum = 0;
            if (i - 1 >= 0 && j - 1 >= 0)
                if (this.gameMap[i - 1][j - 1].equals("* "))
                    sum++;

            if (i - 1 >= 0)
                if (this.gameMap[i - 1][j].equals("* "))
                    sum++;

            if (i - 1 >= 0 && j + 1 < colNumber)
                if (this.gameMap[i - 1][j + 1].equals("* "))
                    sum++;

            if (j - 1 >= 0)
                if (this.gameMap[i][j - 1].equals("* "))
                    sum++;

            if (j + 1 < colNumber)
                if (this.gameMap[i][j + 1].equals("* "))
                    sum++;

            if (i + 1 < rowNumber && j - 1 >= 0)
                if (this.gameMap[i + 1][j - 1].equals("* "))
                    sum++;

            if (i + 1 < rowNumber)
                if (this.gameMap[i + 1][j].equals("* "))
                    sum++;

            if (i + 1 < rowNumber && j + 1 < colNumber)
                if (this.gameMap[i + 1][j + 1].equals("* "))
                    sum++;


            this.gameMap[i][j] = String.valueOf(sum) + " ";
        }
    }
    public void showArray(String[][] arr) {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}