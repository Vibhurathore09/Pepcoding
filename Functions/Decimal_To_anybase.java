package Functions;

import java.util.Scanner;

public class Decimal_To_anybase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        System.out.println(Decimal_to_anybase(n, base));
        sc.close();
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