package Recursion;

import java.util.Scanner;

public class Knight_Tour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chess[][] = new int[n][n];
        int r = sc.nextInt();
        int c = sc.nextInt();
        printKnightTour(chess, r, c, 1);
        sc.close();
    }
    public static void printKnightTour( int [][] chess ,int r, int c ,int move){
        if(r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0 ){
            return;
        }
        else if(move == chess.length * chess.length){
            chess[r][c] = move;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = move;
        printKnightTour(chess, r-2, c+1, move+1);
        printKnightTour(chess, r-1, c+2, move+1);
        printKnightTour(chess, r+1, c+2, move+1);
        printKnightTour(chess, r+2, c+1, move+1);
        printKnightTour(chess, r+2, c-1, move+1);
        printKnightTour(chess, r+1, c-2, move+1);
        printKnightTour(chess, r-1, c-2, move+1);
        printKnightTour(chess, r-2, c-1, move+1);
        chess[r][c] = 0;
    }
    public static void displayBoard(int [][] chess){
        int n = chess.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(chess[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println();
    }
}
