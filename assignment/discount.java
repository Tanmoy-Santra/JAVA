public class discount {
    public double dis;
    public double amount;

    discount(double Amount) {
        this.amount = Amount;
    }

    void compute1() {
        if (amount > 40000) {
            dis = amount / 10;
        } else if (amount > 20000) {
            dis = amount / 20;
        } else if (amount > 10000) {
            dis = (amount * 3) / 100;
        } else {
            dis = 0;
        }
    }

    void compute2() {
        dis = amount <= 10000 ? (0)
                : amount <= 20000 ? (0.03 * amount) : amount <= 40000 ? (0.05 * amount) : (0.1 * amount);
    }

    void display() {
        System.out.println(dis);
    }

    public static void main(String[] args) {
        discount d = new discount(20000);
        d.compute1();
        System.out.println("with compute1()");
        d.display();
        d.compute2();
        System.out.println("with compute2()");
        d.display();
    }
}
