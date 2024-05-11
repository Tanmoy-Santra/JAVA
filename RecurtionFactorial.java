public class RecurtionFactorial {
    static int fact(int x) {
        if (x == 1 || x == 0) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int n1 = fact(n);
        System.out.println(n1);
    }
}
