package Recursion;

import java.util.Scanner;

public class MazePathsD {
    static int c= 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        GetPaths("" , n1 , n2 , 1 ,1);
        System.out.println("\n"+c);
        sc.close();
    }
    public static void GetPaths(String s , int n1 , int n2 , int h , int v){
        if(n2 == h && n1 == v){
            System.out.println(s+" ");
            c++;
            return;
        }

        if(n1 > v){
            GetPaths(s+"V", n1, n2, h, v+1);
        }
        if(n2 > h){
            GetPaths(s+"H", n1, n2, h+1, v);
        }
        if(n1 > v && n2 > h){
            GetPaths(s+"D", n1, n2, h+1, v+1);
        }
        return;
    }
}
