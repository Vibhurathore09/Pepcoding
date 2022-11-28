package Recursion;

import java.util.Scanner;

public class PowLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(pow(n , x));
        sc.close();
    }
    public static int pow(int n , int x){
        if(x == 0){
            return 1;
        }
            int x2 =  pow(n*n , x/2);
        if(x%2 == 1){
            x2 = x2 * n;
        }
        return x2;
    }
}
