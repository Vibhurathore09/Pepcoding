package Recursion;

import java.util.Scanner;

public class Display_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        Display(a , n , 0);
        sc.close();
    }

    private static void Display(int[] a, int n, int i) {
        if(n == i){
            return;
        }
        System.out.println(a[i]);
        Display(a, n, i+1);

    }

}
