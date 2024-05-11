import java.util.Scanner;

public class HasNextInt {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number-");
            System.out.println(sc.hasNextInt());
        }
    }
}
