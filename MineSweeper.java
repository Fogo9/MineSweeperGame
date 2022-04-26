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
