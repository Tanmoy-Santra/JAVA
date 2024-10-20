package cts;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        System.out.println("enter the size of array :  ");
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr;
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("enter the array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the elements of the array : ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }

        int[] res = new int[2];
        int mul = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] + arr[j] == 18) {
                    if (arr[i] * arr[j] > mul && arr[i] > arr[j]) {
                        mul = arr[i] * arr[j];
                        res[0] = arr[i];
                        res[1] = arr[j];
                    }
                }
            }
        }
        System.out.println("res :");
        for (int i = 0; i < 2; i++) {
            System.out.print(res[i] + " ");
        }
    }

}