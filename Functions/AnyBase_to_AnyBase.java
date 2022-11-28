package Functions;

import java.util.Scanner;

public class AnyBase_to_AnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int d =getValue(n , b1, b2);
        System.out.println(d);
        sc.close();
    }
    public static int getValue(int n , int b1 , int b2){
        int dec = Anybase_to_decimal(n, b1);
        int d = Decimal_to_anybase(dec, b2);
        return d;
    }
    public static int Anybase_to_decimal(int n , int base){
        int rv = 0;
        int p = 1;
        while(n>0){
            int dig = n%10;
            n = n/10;
            rv += dig*p;
            p = p*base;
        }
        return rv;
    }
    public static int Decimal_to_anybase(int n , int base){
        int rv = 0;
        int p = 1;
        while(n > 0){
            int dig = n%base;
            n = n/base;
            rv += dig*p;
            p = p*10;
        }
        return rv;
    }
}
