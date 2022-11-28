package Recursion;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        boolean[][]visited = new boolean[n][m];
        floodfill(a , 0 , 0 ,"" , visited);
        sc.close();
    }
    public static void floodfill(int [][] a , int n , int m , String ans , boolean[][] visited){
        if(n < 0 || m < 0 || n == a.length || m == a[0].length || a[n][m] == 1){
            return;
        }
        if( n == a.length - 1 && m == a[0].length - 1){
            System.out.println(ans);
            return;
        }
        visited[n][m] = true;
        floodfill(a, n-1, m, ans+"t" , visited);
        floodfill(a, n, m-1, ans+"l" , visited);
        floodfill(a, n+1, m, ans+"d" , visited);
        floodfill(a, n, m+1, ans+"r" , visited);
        visited[n][m] = false;
    }
}
