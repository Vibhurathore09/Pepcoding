package Recursion;

import java.util.Scanner;

public class PrintMazePathsJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Print(n , m , 1, 1,"");
        sc.close();
    }
    public static void Print(int sr , int sc , int dr , int dc , String ans){
        if(sr == dr && sc == dc){
            System.out.println(ans);
            return;
        }
        for(int ms = 1 ; ms <= dc-sc ; ms++){
            Print(sr, sc+ms, dr, dc, ans+"h"+ms);
        }

        for(int ms = 1 ; ms <= dr-sr ; ms++){
            Print(sr+ms, sc, dr, dc, ans+"V"+ms);
        }
        for(int ms = 1 ; ms <= dr-sr && ms<=dc-sc ; ms++){
            Print(sr+ms, sc+ms, dr, dc, ans+"D"+ms);
        }
    }
}
