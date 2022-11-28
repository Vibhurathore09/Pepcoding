package Recursion;

import java.util.Scanner;

public class Last_Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(Last(a , x , n-1));
        sc.close();
    }

    private static int Last(int[] a, int x, int i) {
        if(i == 0){
            return -1;
        }
        if(a[i] == x){
            return i;
        }
        return Last(a, x, i-1);
    }
}
