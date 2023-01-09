package Recursion;

import java.util.Scanner;

public class First_Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(first(a , x , 0));
        sc.close();
    }
    public static int first(int a[] , int x , int i){
        if(i == a.length){
            return -1;
        }
        
        if(a[i] == x){
            return i;
        }
        return first(a , x , i+1);
        
    }
}
