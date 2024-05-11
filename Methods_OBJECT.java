public class Methods_OBJECT {
    int sum(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 4;
        Methods_OBJECT obj = new Methods_OBJECT();
        c = obj.sum(a, b);
        System.out.println(c);
    }
}
