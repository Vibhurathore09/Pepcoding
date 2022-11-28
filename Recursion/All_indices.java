package Recursion;

import java.util.Scanner;

public class All_indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int all[] = allIndex(a , 0 , x , 0);
        for(int i : all){
            System.out.print(i+" ");
        }
        sc.close(); 
    }

    private static int[] allIndex(int[] a, int i, int x, int j) {
        if(a.length == i){
            return new int[j];
        }
        if(a[i] == x){
            int [] arr = allIndex(a, i+1, x, j+1);
            arr[j] = i;
            return  arr;
        }else{
            int [] arr = allIndex(a, i+1, x, j);
            return arr;
        }
        // return new int[0];
    }
}
