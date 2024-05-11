import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter total no of subject--");
            sc.nextInt();
            System.out.println("enter marks");
            System.out.println("bengali");
            float bengali = sc.nextFloat();
            System.out.println("english");
            float english = sc.nextFloat();
            System.out.println("history");
            float history = sc.nextFloat();
            System.out.println("math");
            float math = sc.nextFloat();
            System.out.println("science");
            float science = sc.nextFloat();
            System.out.println("geography");
            float geography = sc.nextInt();
            float TotalMarks = bengali + english + history + geography + science + math;
            System.out.print("total marks--");
            System.out.print(TotalMarks);
            System.out.println(" out of 600");
            System.out.println("percentage-");
            double percentage = (double) (TotalMarks / 600) * 100;
            System.out.print(percentage);
        }
    }
}
