import java.util.Scanner;

public class SortingALL {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("--MENU--");
                System.out.println(
                        " 1.BUBBLE_SORT \n 2.INSERTION_SORT \n 3.SELECTOIN_SORT \n 4.MARGE_SORT \n 4.QUICK_SORT \n 5.HEAP_SORT");
                System.out.println("enter your choice-");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("\n--Insertion Sort--");
                        Insertion_Sort(arr, n);
                        break;
                    case 2:
                        System.out.println("\n--Selection Sort--");
                        Selection_Sort(arr, n);
                        break;
                    case 3:
                        System.out.println("\n--Bubble Sort--");
                        Bubble_Sort(arr, n);
                        break;
                    case 4:
                        System.out.println("\n--Merge Sort--");
                        Merge_Sort(arr, 0, n - 1);
                        break;
                    case 5:
                        System.out.println("--Quick Sort--");
                        Quick_Sort(arr, 0, n - 1);
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\ninvalid choise");
                }

            }
        }
    }

}
