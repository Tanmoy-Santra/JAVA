class Student {
    private String roll, name, batch;

    Student(String Roll, String Name, String Batch) {
        this.roll = Roll;
        this.name = Name;
        this.batch = Batch;
    }

    void display1() {
        System.out.println("roll :" + roll);
        System.out.println("name :" + name);
        System.out.println("batch :" + batch);
    }
}

class Result extends Student {
    double marks1, marks2, marks3, percentage;
    String grade;

    Result(String Roll, String Name, String Batch, double Marks1, double Marks2, double Marks3) {
        super(Roll, Name, Batch);
        this.marks1 = Marks1;
        this.marks2 = Marks2;
        this.marks3 = Marks3;
    }

    void calculate() {
        percentage = ((marks1 + marks2 + marks3) * 100) / 300;
        if (percentage >= 90) {
            grade = "o";
        } else if (percentage >= 80 && percentage < 90) {
            grade = "E";
        } else if (percentage >= 70 && percentage < 80) {
            grade = "A";
        } else if (percentage >= 60 && percentage < 50) {
            grade = "B";
        } else if (percentage >= 50 && percentage <= 40) {
            grade = "C";
        } else if (percentage < 40) {
            grade = "D";
        }
    }

    void display2() {
        System.out.println("marks1 : " + marks1);
        System.out.println("marks2 : " + marks2);
        System.out.println("marks3 : " + marks3);
        System.out.println("percentage : " + percentage);
        System.out.println("grade : " + grade);
    }

}

public class extra_student {
    public static void main(String[] args) {
        Student ob1 = new Student("cse/2021/45", "Tanmoy santra", "cse-2021");
        ob1.display1();
        Result ob2 = new Result(null, null, null, 78, 88, 67);
        ob2.calculate();
        ob2.display2();
    }
}
