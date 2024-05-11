public class Birdmain {
    public static void main(String Args[]) {
        Flying_Bird fb = new Flying_Bird("Parrot", "Green");
        fb.Fly();
        NonFlying_Bird nfb = new NonFlying_Bird("Hen", "White");
        nfb.Fly();
    }
}

abstract class Bird {
    String n,c;
    Bird( String name, String colour){
        n=name;
        c=colour;
    }
    abstract void Fly();
}

class Flying_Bird extends Bird {
    Flying_Bird(String n, String c){
        super(n,c);
    }

    void Fly(){
        System.out.println("My name : "+n);
        System.out.println("My colour : "+c);
        System.out.println("I can fly");
    }
}

class NonFlying_Bird extends Bird {
    NonFlying_Bird(String n, String c){
        super(n,c);
    }

    void Fly(){
        System.out.println("\nMy name : "+n);
        System.out.println("My colour : "+c);
        System.out.println("I can't fly");
    }
}