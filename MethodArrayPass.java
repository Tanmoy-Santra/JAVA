public class MethodArrayPass {
    static void change1(int[] brr) {
        brr[0] = 555;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 45, 65, 77, 70 };
        System.out.println("before arr[0]-" + arr[0]);
        change1(arr);
        System.out.println("after arr[0]-" + arr[0]);
    }
}
