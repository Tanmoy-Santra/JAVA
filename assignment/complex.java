// public class complex {
//     public int real, imag;

//     complex(int r, int i) {
//         this.real = r;
//         this.imag = i;
//     }

//     public static complex add(complex n1, complex n2) {
//         complex res = new complex(0, 0);
//         res.real = n1.real + n2.real;
//         res.imag = n1.imag + n2.imag;
//         return res;
//     }

//     public static complex sub(complex n1, complex n2) {
//         complex res1 = new complex(0, 0);
//         res1.real = n1.real - n2.real;
//         res1.imag = n1.imag - n2.imag;
//         return res1;
//     }

//     void display() {
//         System.out.print("(" + real + " + " + imag + "i" + ")");
//     }

//     public static void main(String[] args) {
//         complex c1 = new complex(1, 2);
//         complex c2 = new complex(3, 2);
//         complex res = add(c1, c2);
//         complex res1 = sub(c1, c2);
//         res.display();
//         System.out.println();
//         res1.display();
//     }
// }
public class complex {
    int a, b;

    complex(int x, int y) {
        a = x;
        b = y;
    }

    complex add(complex c1) {
        complex com = new complex(1, 1);
        com.a = this.a + c1.a;
        com.b = this.b + c1.b;
        return com;
    }// by SRAJAN

    complex sub(complex c1) {
        complex com3 = new complex(1, 1);
        com3.a = this.a - c1.a;
        com3.b = this.b - c1.b;
        return com3;
    }

    void display() {
        System.out.println(a + "+" + b);
    }

    public static void main(String[] args) {
        complex ob1 = new complex(2, 3);
        complex ob2 = new complex(1, 4);
        complex sum = ob1.add(ob2);
        sum.display();
        complex dif = ob1.sub(ob2);
        dif.display();

    }
}