import java.util.Scanner;

public class IputString {
    public static void main(String[] argsd) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter  a string");
            String st = sc.nextLine();
            System.out.println(st);
        }
    }
}
