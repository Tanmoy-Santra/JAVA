import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of matrix-(mxn)-");
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println("-matrix multiplication-");
            System.out.println("1st matrix");
            String[][] mat = new String[m][n];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    mat[i][j] = sc.nextLine();
                }
            }
            System.out.println("2nd matrix is-");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(" " + mat[i][j]);
                }
                System.out.println();
            }
            System.out.println("-matrix multiplication-");
            System.out.println("2st matrix");
            String[][] mat2 = new String[m][n];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    mat2[i][j] = sc.nextLine();
                }
            }
            System.out.println("2nd matrix is-");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(" " + mat2[i][j]);
                }
                System.out.println();
            }

        }
    }
}
