import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the 1st number-");
            int a = sc.nextInt();
            System.out.println("enter the 2st number-");
            int b = sc.nextInt();
            System.out.println("enter the 3Rd number-");
            int c = sc.nextInt();
            int res = a + b + c;
            System.out.println("result is-");
            System.out.println(res);
        }
    }

}
