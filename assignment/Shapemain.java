import java.util.Scanner;

public class Shapemain{
    public static void main(String Args[]){

        System.out.println("\nShape : Square");
        Square obj = new Square();
        obj.get();
        obj.put();
        obj.cal_area();

        System.out.println("\nShape : Rectangle");
        Rectangle obj2 = new Rectangle();
        obj2.get();
        obj2.put();
        obj2.cal_area();

        System.out.println("\nShape : Triangle");
        Triangle obj3 = new Triangle();
        obj3.get();
        obj3.put();
        obj3.cal_area();

    }
}

abstract class Shape{
    int a,b;
    abstract void cal_area();
    void get() {}
}

class Square extends Shape {

    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side : ");
        a = sc.nextInt();
    }

    void put(){
        System.out.println("Side = "+a);

    }

    void cal_area(){
        System.out.println("Area : "+a*a);
    }
}

class Rectangle extends Shape {

    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        a = sc.nextInt();
        System.out.print("Enter breadth : ");
        b = sc.nextInt();
    }

    void put(){
        System.out.println("Length = "+a+"\nBreadth = "+b);
    }

    void cal_area(){
        System.out.println("Area : "+a*b);
    }

}


class Triangle extends Shape {

    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height : ");
        a = sc.nextInt();
        System.out.print("Enter base : ");
        b = sc.nextInt();
    }

    void put(){
        System.out.println("Height = "+a+"\nBase = "+b);
    }

    void cal_area(){
        System.out.println("Area : "+(a*b)/2);
    }

}