package ua.Romanov.Alexandr;

import java.util.Scanner;

// Java program to find number of possible moves of knight
public class Main {
    // dimension of a chessboard
    public static final int n = 8;
    public static final int m = 8;

    // To calculate possible moves
    static int isPosibleMove(int firstX, int firstY, int newX, int newY) {
        // All possible moves of a knight
        int X[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int Y[] = {1, 2, 2, 1, -1, -2, -2, -1};


        // Check if each possible move is valid or not
        for (int i = 0; i < 8; i++) {

            // Position of knight after move
            int newPositinX = firstX + X[i];
            int newPositionY = firstY + Y[i];

            if (newPositinX == newX && newPositionY == newY ) return 1;
            if (newPositinX<0 && newPositionY<0) return -1;

        }
        return 0;
    }

    // Driver program to check findPossibleMoves()
    public static void main(String[] args) {

        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input first X: ");
            int firstX = scanner.nextInt();
            System.out.print("Input first Y: ");
            int firstY = scanner.nextInt();
            System.out.print("Введите X: ");
            int newX = scanner.nextInt();
            System.out.print("Введите Y: ");
            int newY = scanner.nextInt();
            int isTrue = isPosibleMove(firstX, firstY, newX, newY);
            if (isTrue == 1) System.out.println("valid move");
            if (isTrue==-1) System.out.println("out of board");
            else System.out.println("invalid move");
        }


    }


}


