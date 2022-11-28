package Recursion;

import java.util.Scanner;

public class PrintStairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintPaths(n , "");
        sc.close();
    }
    public static void PrintPaths(int n , String s){
        if(n == 0){
            System.out.println(s+" ");
            return ;
        }
        if(n < 0){
            return;
        }
        PrintPaths(n-1, s+"1");
        PrintPaths(n-2, s+"2");
        PrintPaths(n-3, s+"3");
    }
}
