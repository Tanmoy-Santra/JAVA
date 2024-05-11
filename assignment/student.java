/**
 * student//ass1
 */
public class student {
    public double roll;
    public String name, dept, contact;

    student(double Roll, String Name, String Dept, String Contact) {
        this.roll = Roll;
        this.name = Name;
        this.dept = Dept;
        this.contact = Contact;

    }

    void display() {
        System.out.println("roll : " + roll);
        System.out.println("name : " + name);
        System.out.println("depatment : " + dept);
        System.out.println("contact : " + contact);
    }

    public static void main(String[] args) {
        student st = new student(1111, "tanmoy", "cse", "7865467890");
        st.display();
    }
}