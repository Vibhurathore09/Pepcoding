package Arrays;

import java.util.Scanner;

public class SubsetsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int limit = (int) Math.pow(2, n);
        for (int i = 0; i < limit; i++) {
            String set = "";
            int temp =i;
            for (int j = arr.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;
                if (r == 0) {
                    set = "-"+set;
                } else {
                    set = arr[j]+set;
                }
            }
            System.out.println(set);
        }
        sc.close();
    }
}
