# **MINE SWEEPER GAME**

# Information

* **It is a virtual game where the user detonates mines by pressing the right place or surrenders with a flag sign by pressing the wrong places.**

# Technologies Used

* **JAVA**

<br />

# Codes

```Java

        import java.util.Scanner;

        public class MineSweeper{
        
            public static void main(String[] args){

                Scanner input = new Scanner(System.in);

                System.out.println("Please enter the size of the board : ");


                System.out.print("Row Number : ");

                int rowNumber = input.nextInt();

                System.out.print("Column Number : ");

                int columnNumber = input.nextInt();


                MineSweeper1 ms = new MineSweeper1(rowNumber,columnNumber);

                ms.runGame();

            }
        }

```

```Java

            import java.util.Random;

import java.util.Scanner;


public class MineSweeper1{

    int[][] board;

    int[][] map;

    int rowNumber;

    int columnNumber;

    int size;

    boolean status;


    public MineSweeper1(int rowNumber, int columnNumber){

        this.rowNumber = rowNumber;

        this.columnNumber = columnNumber;

        this.board = new int[this.rowNumber][this.columnNumber];

        this.map = new int[this.rowNumber][this.columnNumber];

        this.size = (this.rowNumber*this.columnNumber);

    }

    Random random = new Random();

    Scanner scanner = new Scanner(System.in);


    void runGame(){

        playMines();

         System.out.println("------START GAME------");

         int userRow, userColumn;

         int counter = 0;

         this.status = true;

         while(this.status){

             showGameBoard(this.board);

             System.out.print("Please enter your row  : ");

             userRow = scanner.nextInt();

             System.out.print("Please enter your column  : ");

             userColumn = scanner.nextInt();

             if((userRow < 0 || userRow > this.rowNumber - 1) && (userColumn < 0 || userColumn > this.columnNumber - 1)){

                 System.out.println("Unavailable Coordinates...");

                 continue;

             }

             if(this.map[userRow][userColumn] == -1){

                 this.status = false;

                 System.out.println("!!!!Game Over!!!");

             }else{

                 checkMine(userRow, userColumn);

                 this.status = true;

                 counter++;

                 if(counter == (this.size - this.size / 4)){

                     System.out.println("Congratulations, you win");

                 break;

                 }
             }

         }
    }


    public void showGameBoard(int[][] gameBoard){

        for(int[] ints : gameBoard){

            for(int j = 0; j < gameBoard[0].length; j++){

                if(ints[j] >= 0){

                    System.out.print(" ");

                }

                System.out.print(ints[j] + " ");

            }

            System.out.println();

        }
    }

    public void playMines(){

        int randomRow, randomCol, counter = 0;

        while(counter != (size / 4)){

            randomRow = random.nextInt(rowNumber);

            randomCol = random.nextInt(columnNumber);

            if(map[randomRow][randomCol] != -1){

                map[randomRow][randomCol] = -1;

                counter++;

            }

        }
    }


    public void checkMine(int row, int column){

        if((column < columnNumber - 1) && (this.map[row][column + 1] == -1)){

            this.board[row][column] = this.board[row][column] + 1;

        }

        if((column > 0) && (this.map[row][column - 1] == -1)){

            this.board[row][column] = this.board[row][column] + 1;

        }

        if((row < rowNumber - 1) && (this.map[row + 1][column] == -1)){

            this.board[row][column] = this.board[row][column] + 1;

        }

        if((row > 0) && (this.map[row - 1][column] == -1)){

            this.board[row][column] = this.board[row][column] + 1;

        }

        if((row > 0) && (column > 0) && (this.map[row - 1][column - 1] == -1)){

            this.board[row][column] = this.board[row][column] + 1;

        }

        if((row > 0) && (column < this.columnNumber - 1) && (this.map[row - 1][column + 1] == -1)){

            this.board[row][column] = this.board[row][column] + 1;

        }

        if((row < this.rowNumber - 1) && (column > 0) && (this.map[row + 1][column - 1] == -1)){

            this.board[row][column] = this.board[row][column] + 1;

        }

        if((row < this.rowNumber - 1) && (column < this.columnNumber - 1) && (this.map[row + 1][column + 1] == -1)){

            this.board[row][column] = this.board[row][column] + 1;

        }

        if(board[row][column] == 0){

            board[row][column] = 0;
            
        }
    }
}

```

<br />

# LINK

* Click here https://github.com/Fogo9/MineSweeperGame.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
