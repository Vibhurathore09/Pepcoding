package Recursion;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        max(a , 0 , Integer.MIN_VALUE);
        sc.close();
        
    }
    public static int max(int a[] , int i , int max){
        if(a.length == i){
            System.out.println(max);
            return max;
        }
        if(max < a[i]){
            max = a[i];
        }
        max(a, i+1, max);
        return -1;
    }
}
