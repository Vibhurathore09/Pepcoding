package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class KPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> list = kpc(str);
        System.out.println(list);
        sc.close();
    }
    static String[] codes = {".;" , "abc" , "def" ,"ghi","jkl","mno","pqrs","tu" ,"vwx","yz" };
    public static ArrayList<String> kpc(String s){
        if(s.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char c = s.charAt(0);
        String rres = s.substring(1);
        ArrayList<String> result = kpc(rres);
        ArrayList<String> mres = new ArrayList<>();
        String ch = codes[c-'0'];
        for(int i = 0 ; i < ch.length() ; i++){
            char ch1 = ch.charAt(i);
            for(String str : result){
                mres.add(str+ch1);
            }
        }

        return mres;
    }
}
