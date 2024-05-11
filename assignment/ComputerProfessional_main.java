class ComputerProfessional {
    String EName, Prospect;
    float DutyHour;

    ComputerProfessional(String n, String p, float d) {
        EName = n;
        Prospect = p;
        DutyHour = d;
    }

    void display() {
        System.out.println("Employee Name: " + EName);
        System.out.println("Prospect: " + Prospect);
        System.out.println("Duty Hour: " + DutyHour);
    }
}

class Developer extends ComputerProfessional {
    float StudyHour;

    Developer(String n, String p, float d, float s) {
        super(n, p, d);
        StudyHour = s;
    }

    void displaydata() {
        display();
        System.out.println("Study Hour: " + StudyHour);
    }
}

class NetworkAdmin extends ComputerProfessional {
    float PracticeHour;

    NetworkAdmin(String n, String p, float d, float ph) {
        super(n, p, d);
        PracticeHour = ph;
    }

    void displaydata() {
        display();
        System.out.println("Practice Hour: " + PracticeHour);
    }
}

class DataOperator extends ComputerProfessional {
    float TypingSpeed;

    DataOperator(String n, String p, float d, float s) {
        super(n, p, d);
        TypingSpeed = s;
    }

    void displaydata() {
        display();
        System.out.println("Typing Speed: " + TypingSpeed);
    }
}

class JavaProfessional extends Developer {
    String ProficiencyLevel;

    JavaProfessional(String n, String p, float d, float s,
            String pl) {
        super(n, p, d, s);
        ProficiencyLevel = pl;
    }

    void displaydata() {
        super.displaydata();
        System.out.println("Proficiency Level: " + ProficiencyLevel);
    }
}

class PythonProfessional extends Developer {
    String ProficiencyLevel;

    PythonProfessional(String n, String p, float d, float s, String pl) {
        super(n, p, d, s);
        ProficiencyLevel = pl;
    }

    void displaydata() {
        super.displaydata();
        System.out.println("Proficiency Level: " + ProficiencyLevel);
    }
}

public class ComputerProfessional_main {
    public static void main(String[] args) {
        System.out.println("-----------NetworkAdmin----------");
        NetworkAdmin ob3 = new NetworkAdmin("tom", "Excellent", 5, 6);
        ob3.displaydata();
        System.out.println("-------------DataOperator---------");
        DataOperator ob4 = new DataOperator("tom", "Excellent", 5, 6);
        ob4.displaydata();
        System.out.println("-------------JavaProfessional---------------");
        JavaProfessional ob1 = new JavaProfessional("tanmoy", "Excellent", 5, 10, "Pro");
        ob1.displaydata();
        System.out.println("-------------------pythonProfessional----------");
        PythonProfessional ob2 = new PythonProfessional("tanmoy", "Excellent", 5, 10, "Pro");
        ob2.displaydata();
    }
}
