package Arrays;

import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i <  n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, k);
        for(int val : arr){
            System.out.print(val+" ");
        }
        sc.close();
    }
    public static void reverse(int [] arr , int i , int j){
        int li = i ;
        int hi = j;
        while(li < hi){
            int temp = arr[li];
            arr[li] = arr[hi];
            arr[hi] = temp;
            li++;
            hi--;
        }
    }
    public static void rotate(int arr[] , int k){
        k = k%arr.length;
        if(k < 0){
            k = k+arr.length;
        }
        reverse(arr , 0 ,arr.length-k-1);
        reverse(arr , arr.length-k , arr.length - 1);
        reverse(arr , 0 , arr.length-1);
    }
}
