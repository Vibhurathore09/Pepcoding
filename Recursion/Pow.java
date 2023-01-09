package Recursion;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(pow(n , x));
        sc.close();
    }
    public static int pow(int n, int x ){
        if(x == 0){
            return 1;
        }
        return n * pow(n , x-1);
    }
}
