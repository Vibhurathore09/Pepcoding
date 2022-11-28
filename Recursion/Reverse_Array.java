package Recursion;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        Reverse(a , n-1);
        sc.close();
    }

    private static void Reverse(int[] a, int i) {
        if(i < 0){
            return;
        }
        System.out.println(a[i]);
        Reverse(a , i-1);
        
    }
}
