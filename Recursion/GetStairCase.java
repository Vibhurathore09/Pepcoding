package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ress = getStairPaths(n);
        System.out.println(ress);
        sc.close();
    }
    public static ArrayList<String> getStairPaths(int n){

        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n < 0){
            ArrayList<String> bres = new ArrayList<>();
            // bres.add();
            return bres;
        }
        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);

        ArrayList<String> paths = new ArrayList<>();

        for(String path : paths1){
            paths.add(1 + path);
        }
        for(String path : paths2){
            paths.add(2 + path);
        }
        for(String path : paths3){
            paths.add(3 + path);
        }
        return paths;
    }
}
