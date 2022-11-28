package Functions;

import java.util.Scanner;

public class AnyBase_Substraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        // N2 should be greater no
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(getDifference(b , n1 ,n2));
        sc.close();
    }
    public static int getDifference(int b ,int n1 ,int n2){
        int rv = 0;
        int c =0;
        int p = 1;
        while(n2 > 0){
            int rem1 = n1%10;
            int rem2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;

            int d = 0;
            rem2 = rem2 + c;
            if(rem2 >= rem1){
                c = 0;
                d = rem2 - rem1;
            }else{
                c = -1;
                d = rem2 + b - rem1;
            }

            rv = rv + d * p;
            p *= 10;
        }
        return rv;
    }
}
