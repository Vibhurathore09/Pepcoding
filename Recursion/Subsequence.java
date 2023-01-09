package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> res = GetSubsequence(s);
        System.out.println(res);
        sc.close();
    }
    public static ArrayList<String> GetSubsequence(String s){
        if(s.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = s.charAt(0);
        String res = s.substring(1);
        ArrayList<String> rres = GetSubsequence(res);
        ArrayList<String> mres = new ArrayList<>();
        for(String str : rres){
            mres.add(""+str);
            mres.add(ch+str);
        }
        return mres;
    }
}
