package Recursion;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Permutation(s , "");
        sc.close();
    }
    public static void Permutation(String s , String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String total = left + right;
            Permutation(total, ans+ch);
        }
    }
}
