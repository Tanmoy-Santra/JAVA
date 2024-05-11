import java.util.Scanner;

public class avarage {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("bengali");
            // int b = sc.nextInt();
            System.out.println("english");
            int e = sc.nextInt();
            float a = (float) (e / 600) * 100;
            // int p = (a / 600) * 100;
            System.out.println("avarage-" + a);
        }
    }
}