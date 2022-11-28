package Functions;

import java.util.Scanner;

public class AnyBase_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        System.out.println(Anybase_to_decimal(n, base));
        sc.close();
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
}
