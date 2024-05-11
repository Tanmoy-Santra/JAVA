import java.util.Scanner;

public class Calc_TryException {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("--WELLCOME TO MY CALCULATOR--");
            System.out.println("ENTER 2 NUMBER FOR CALCULATION-");
            try {
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println("enter your choise[1:+  ,2: - ,3: * ,4: / ,5: ^]");
                try {
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            int result = num1 + num2;
                            System.out.print(num1 + "+" + num2 + "=" + result);
                            break;

                        case 2:
                            int result2 = num1 - num2;
                            System.out.print(num1 + "-" + num2 + "=" + result2);
                            break;

                        case 3:
                            int result3 = num1 * num2;
                            System.out.print(num1 + "*" + num2 + "=" + result3);
                            break;

                        case 4:
                            try {
                                int result4 = num1 / num2;
                                System.out.print(num1 + "/" + num2 + "=" + result4);
                                break;
                            } catch (Exception e) {
                                System.out.println("invalid input!!");
                                System.out.println("reason-" + e);
                            }

                        case 5:
                            int result5 = (int) Math.pow(num1, num2);
                            System.out.print(num1 + "^" + num2 + "=" + result5);
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("invalid input!!");
                    System.out.println("reason-" + e);
                }
            } catch (Exception e) {
                System.out.println("invalid input!!");
                System.out.println("reason-" + e);
            }
        }
    }
}
