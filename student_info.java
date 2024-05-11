public class student_info{
private String name;
    private double roll_no;
    private String batch;
    private String department;
    private String reg_no;
    private double m1, m2, m3;
    private double aggPer;

    public student_info(String Name, double RollNo, String Batch, String Department, String RegNo, double M1, double M2,double M3) {
        this.name = Name;
        this.roll_no = RollNo;
        this.batch = Batch;
        this.department = Department;
        this.reg_no = RegNo;
        this.m1 = M1;
        this.m2 = M2;
        this.m3 = M3;

    }

    public void calavg() {
        aggPer = ((m1 + m2 + m3) / 3) * 100;
    }

    public void display() {
        System.out.println("Name : " + name + "\n" + "Roll No : " + roll_no + "\n" + "Batch : " + batch + "\n"
                + "Dept : " + department + "\n" + "Reg No : " + reg_no + "\n" + "Agg Percentage : " + aggPer);

    }
}