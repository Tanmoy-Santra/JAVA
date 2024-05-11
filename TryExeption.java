public class TryExeption {
    public static void main(String[] args) {
        int a = 40;
        int b = 0;
        try {
            float c = a / b;
            System.out.println("result is-" + c);
        } catch (Exception e) {
            System.out.println("invalid operation!");
            System.out.println("cause-" + e);

        }

    }
}
