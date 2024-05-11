class Arithmatic {
    int a;
    float b;
    char c;
    double d;

    Arithmatic(int A, float B, char C, double D) {
        a = A;
        b = B;
        c = C;
        d = D;
    }

    void add(int x, double y) {
        a = a + x;
        d = d + y;
    }

    void add(float x, int y, double z) {
        b = b + x;
        a = a + y;
        d = d + z;
    }

    void add(int x, float y, double z) {
        a = a + x;
        b = b + y;
        d = d + z;
    }

    Arithmatic add(Arithmatic ar) {
        Arithmatic arr = new Arithmatic(0, 0, ' ', 0);
        arr.a = ar.a + a;
        arr.b = ar.b + b;
        arr.d = ar.d + d;
        arr.c = (char) (ar.c + c);

        
        return arr;

    }

    void display() {
        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
    }

    public static void main(String[] args) {
        Arithmatic Ar = new Arithmatic(1, 1.1f, 's', 2.2323232);
        Arithmatic Ar1 = new Arithmatic(12, 6.5f, 'a', 10.7);
        System.out.println("initial value:");
        Ar.display();
        Ar.add(2, 3.3);
        System.out.println();
        System.out.println("after adding int & double:");
        Ar.display();
        System.out.println();
        Ar.add(2, 2f, 2.1211212);
        System.out.println("after adding int ,float & double:");
        Ar.display();
        System.out.println();
        Ar.add(1.1f, 12, 4.5);
        System.out.println("after adding float,int &double:");
        Ar.display();
        System.out.println();

        System.out.println("Add function passing object");
        Ar.add(Ar1);
        Ar.display();

    }
}
