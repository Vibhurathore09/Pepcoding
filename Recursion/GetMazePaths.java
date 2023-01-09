package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> list = getPaths(n, m, 1, 1);
        System.out.println(list);
        sc.close();
    }
    public static ArrayList<String> getPaths(int n , int m , int n1 , int m1){
        if(n == n1 && m1 == m){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        if(m1 < m){
            hpaths = getPaths(n, m, n1, m1+1);
        }
        ArrayList<String> vpaths = new ArrayList<>();
        if(n1 < n){
            vpaths = getPaths(n, m, n1+1, m1);
        }
        ArrayList<String> paths = new ArrayList<>();
        for(String p : vpaths){
            paths.add("v"+p);
        }
        for(String p : hpaths){
            paths.add("h"+p);
        }
        return paths;
    }
}
