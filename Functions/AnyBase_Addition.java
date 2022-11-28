package Functions;

import java.util.Scanner;

public class AnyBase_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(getSum(b, n1, n2));
        sc.close();
    }
    public static int getSum(int b , int n1 , int n2){

        int c = 0;
        int num = 0;
        int p = 1;
        while(n1 >0 || n2 > 0 || c>0){
            int rem1 = n1%10;
            int rem2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;
            int d =  (rem1+rem2) +c;
            c = d/b;
            d = d%b;
            num += d * p;
            p =p * 10;
        }
        

        return num;
    }
}
