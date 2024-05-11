class Employee {
    private String Ecode, Ename, ContactNo, Dept;
    private double BasicSal, GrossSal, HRA, MA, DA, BP, B = 0.0;

    Employee(String ecode, String ename, String contactNo, String dept, double bs, double bp) {
        this.Ecode = ecode;
        this.Ename = ename;
        this.ContactNo = contactNo;
        this.Dept = dept;
        this.BasicSal = bs;
        this.BP = bp;

    }

    void TotSal() {
        DA = (0.75 * BasicSal);
        HRA = (0.15 * BasicSal);
        MA = (0.1 * BasicSal);
        GrossSal = (BasicSal + DA + HRA + MA);

    }

    void CalcBonus() {
        B = GrossSal * (BP / 100.0);

    }

    void show_data() {
        System.out.println("Ecode :" + Ecode);
        System.out.println("Ename : " + Ename);
        System.out.println("contactNo : " + ContactNo);
        System.out.println("department :" + Dept);
        System.out.println("BasicSalary : " + BasicSal);
        System.out.println("GrossSalary : " + GrossSal);
        System.out.println("bonus :" + BP);
        System.out.println("total bonus: " + B);
        System.out.println("total salary :" + (B + GrossSal));
    }
}

class Manager extends Employee {

    Manager(String ecode, String ename, String contactNo, String dept, double bs) {
        super(ecode, ename, contactNo, dept, bs, 0.0);
    }

    void show() {
        TotSal();
        show_data();
    }

}

class Engineer extends Employee {

    Engineer(String ecode, String ename, String contactNo, String dept, double bs) {
        super(ecode, ename, contactNo, dept, bs, 5.0);
    }

    void show() {
        TotSal();
        CalcBonus();
        show_data();
    }

}

class Clerk extends Employee {

    Clerk(String ecode, String ename, String contactNo, String dept, double bs) {
        super(ecode, ename, contactNo, dept, bs, 10.0);
    }

    void show() {
        TotSal();
        CalcBonus();
        show_data();
    }

}

public class employee_main {
    public static void main(String[] args) {
        Manager man = new Manager("man01", "tom", "9876543456", "manager", 50000.0);
        Engineer eng = new Engineer("eng01", "bob", "9876543212", "engineer", 40000.0);
        Clerk cle = new Clerk("cle01", "joy", "9876567898", "clerk", 30000.0);
        man.show();
        System.out.println();
        eng.show();
        System.out.println();
        cle.show();
    }
}
