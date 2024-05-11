import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter array elements -");
            int[] marks = new int[5];
            for (int i = 0; i <= 4; i++) {
                marks[i] = sc.nextInt();
            }
            // marks[0] = 34;
            // marks[1] = 44;
            // marks[2] = 54;
            // marks[3] = 64;
            // marks[4] = 74;
            System.out.print("array elements are-");
            for (int i = 0; i <= 4; i++) {
                System.out.print("\t" + marks[i]);
            }
        }
    }
}