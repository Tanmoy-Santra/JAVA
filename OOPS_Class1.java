class employee {
    int id;
    String name;
    int salary;

    public void details() {
        System.out.println("Id-" + id);
        System.out.println("Name-" + name);
        System.out.println("Salary-" + salary);
    }
};

public class OOPS_Class1 {
    public static void main(String[] args) {
        System.out.println("--employee details--");
        employee tom = new employee();
        employee jerry = new employee();
        employee bob = new employee();

        tom.id = 10;
        tom.name = "Tom Benton";
        tom.salary = 50000;

        jerry.id = 21;
        jerry.name = "Jerry brook";
        jerry.salary = 55000;

        bob.id = 19;
        bob.name = "Bob root";
        bob.salary = 60000;

        tom.details();
        jerry.details();
        bob.details();
    }
}
