import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[][] s1 = new String[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    s1[i][j] = sc.nextLine();
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(s1[i][j]);
                    System.out.print("\n");
                }
            }
        }
    }
}