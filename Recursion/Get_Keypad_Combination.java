package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Keypad_Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
        sc.close();
    }
    static String[] codes = {".;" , "abc" , "def" ,"ghi","jkl","mno","pqrs","tu" ,"vwx","yz" };
    public static ArrayList<String> getKPC(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        // 573
        char ch = str.charAt(0); // 5
        String ros = str.substring(1); // 73

        ArrayList<String> rres = getKPC(ros); // words of 73
        ArrayList<String> mres = new ArrayList<>();
        String codeforch = codes[ch-'0'];

        for(int i =0; i < codeforch.length() ; i++ ){
            char chcode  = codeforch.charAt(i);
            for(String rstr : rres){
                mres.add(chcode + rstr);
            }
        }

        return mres;
    }
}
