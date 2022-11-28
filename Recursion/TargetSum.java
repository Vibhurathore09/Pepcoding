package Recursion;

import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ;i  < n ; i++){
            a[i] = sc.nextInt();
        }

        int tar = sc.nextInt();
        printTargetSumSubsets(a , 0 , "" , 0 ,tar);
        sc.close();
    }

    private static void printTargetSumSubsets(int[] a, int i, String set, int sos, int tar) {

        if(i == a.length){
            if(sos == tar){
                System.out.println(set +".");
            }
            return;
        }

        printTargetSumSubsets(a, i+1, set+a[i]+", ", sos+a[i], tar);
        printTargetSumSubsets(a, i+1, set, sos, tar);
    }
}
