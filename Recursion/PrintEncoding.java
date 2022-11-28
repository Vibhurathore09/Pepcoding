package Recursion;

import java.util.Scanner;

public class PrintEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncoding(str , "");
        sc.close();
    }
    public static void printEncoding(String ques , String asf){
        if(ques.length() == 0){
            System.out.println(asf);
            return;
        }
        else if(ques.length() == 1){
            char ch = ques.charAt(0);
            if(ch == '0'){
                return;
            }
            else{
                int chv = ch - '0';
                asf = asf+ (char)(chv+'a'-1);
                System.out.println(asf);
            }

        }
        else {
            char ch = ques.charAt(0);
            String roq = ques.substring(1);
            if(ch == '0'){
                return;
            }
            else{
                int chv = ch - '0';
                asf = asf+ (char)(chv+'a'-1);
                printEncoding(roq, asf);
            }
            String ch12 = ques.substring(0,2);
            roq = ques.substring(2);
            int ch12v = Integer.parseInt(ch12);
            if(ch12v <= 26){
                
                asf = asf+ (char)(ch12v+'a'-1);
                printEncoding(roq, asf);
            }
        }
    }
}
