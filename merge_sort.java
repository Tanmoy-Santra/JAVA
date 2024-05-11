import java.util.Scanner;

public class merge_sort {
    static int[] brr = new int[20];
    static int[] arr = new int[20];
    static int n;

    static void mergeSort(int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(l, mid);
            mergeSort(mid + 1, h);
            merge(l, h, mid);
        }
    }

    static void merge(int l, int h, int mid) {

        int i = l;
        int k = l;
        int j = mid + 1;
        while ((i <= mid) && (j <= h)) {
            if (arr[i] < arr[j])
                brr[k++] = arr[i++];
            if (arr[i] > arr[j])
                brr[k++] = arr[j++];
        }
        while (i <= mid) {
            brr[k++] = arr[i++];
        }
        while (j <= h) {
            brr[k++] = arr[j++];
        }
        for (int j2 = l; j2 <= h; j2++) {
            arr[j2] = brr[j2];
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the array size:");
            n = sc.nextInt();
            System.out.println("enter the elements :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("array element before sorting :");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            mergeSort(0, n - 1);
            System.out.println("array elementafter sorting :");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

        }

    }
}
