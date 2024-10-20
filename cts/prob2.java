package cts;

import java.util.Scanner;

public class prob2 {
    static int f(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (f(n - 1) + 7 * f(n - 2) + f(n / 4)) % 1000000007;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}
