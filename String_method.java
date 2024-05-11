import java.util.Scanner;

//import javax.print.DocFlavor.STRING;

public class String_method {
    public static void main(String[] args) {
        System.out.println("enter a line");
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine();
            System.out.println(s1);
            int val = s1.length();
            System.out.println("length of the string-" + val);
            String sUpper = s1.toUpperCase();
            System.out.println("sUpper-" + sUpper);
            String sLower = s1.toLowerCase();
            System.out.println("sLower-" + sLower);
            String nonTrimString = "       tanmoy       ";
            String TrimmedString = nonTrimString.trim();
            System.out.println("Trimmed string is-" + TrimmedString);
            String s2 = "gangadharpur";
            System.out.println(s2.substring(0));
            System.out.println(s2.substring(2, 11));
            System.out.println(s2.replace('g', 't'));
            System.out.println(s2.startsWith("gan"));
            System.out.println(s2.endsWith("pup"));
            System.out.println(s2.indexOf('g'));
            System.out.println(s2.charAt(11));
            System.out.println(s2.lastIndexOf('g', 1));
            System.out.println(s2.lastIndexOf('g', 10));
            System.out.println(s2.equals("gangadharpur"));
            System.out.println(s2.equalsIgnoreCase("GAnGaDharPur"));
            System.out.println("i am back slas sequence charecter \\ \"");
            System.out.println("i am back slas sequence charecter \t tanmoy santra \n anish sangtra");

        }
    }

}
