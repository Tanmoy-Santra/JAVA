class supperclass {
    int id;
    String name;

    void setid(int i) {
        this.id = i;
    }

    void setname(String s) {
        this.name = s;
    }

    int getid() {
        return id;
    }

    String getname() {
        return name;
    }
};

class subclass extends supperclass {
    int salary;

    int getsalary() {
        return salary;
    }

    void setsalary(int i) {
        this.salary = i;
    }

};

public class Inheritence {
    public static void main(String[] args) {
        subclass tom = new subclass();
        tom.setid(12);
        tom.setname("tanmoy");
        tom.setsalary(120000);
        System.out.println(tom.getid());
        System.out.println(tom.getname());
        System.out.println(tom.getsalary());

    }
}
