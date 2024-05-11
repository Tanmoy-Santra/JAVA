import static java.lang.Math.pow;

class account {
    private String account_no, c_name, contact;

    account(String Ac_no, String C_name, String Contact) {
        this.account_no = Ac_no;
        this.c_name = C_name;
        this.contact = Contact;
    }

    void show() {
        System.out.println();
        System.out.println("account_no : " + account_no);
        System.out.println("c_name : " + c_name);
        System.out.println("contact : " + contact);
    }
}

class savings_ac extends account {
    private float ROI;
    private float ac_balance;

    savings_ac(String Ac_no, String C_name, String Contact, float ROI1, float Ac_balance) {
        super(Ac_no, C_name, Contact);
        this.ROI = ROI1;
        this.ac_balance = Ac_balance;
    }

    void compute() {
        ac_balance = ac_balance + (ac_balance * ROI) / 100;
    }

    void show_data() {
        System.out.println();
        System.out.println("Savings account details");
        System.out.println("----------------------------------");
        show();
        System.out.println("ac_balance: $" + ac_balance);
        System.out.println("ROI : " + ROI);
    }

}

class current_ac extends account {
    private float min_balance, Ac_Balance;

    current_ac(String Ac_no, String C_name, String Contact, float Min_balance, float Ac_bal) {
        super(Ac_no, C_name, Contact);
        this.min_balance = Min_balance;
        this.Ac_Balance = Ac_bal;
    }

    void show_data() {
        System.out.println();
        System.out.println("current_Ac detailes");
        System.out.println("---------------------------------");
        show();
        System.out.println("account balance : $" + Ac_Balance);
        System.out.println("Min_balance :$" + min_balance);
    }

}

class TD_ac extends account {

    private float principle, maturity_amount, ROI, term;

    TD_ac(String Ac_no, String C_name, String Contact, float Principle, float Terms, float ROI1) {
        super(Ac_no, C_name, Contact);
        this.principle = Principle;
        this.term = Terms;
        this.ROI = ROI1;
        maturity_amount = 0;
    }

    void compute() {
        maturity_amount = (float) (principle * pow((1.0 + ROI / 100), term * 4));

    }

    void show_data() {
        System.out.println();
        System.out.println("TD_Ac details");
        System.out.println("----------------------------------");
        show();
        System.out.println("principle : &" + principle);
        System.out.println("Terms : " + term);
        System.out.println("maturity amount : $" + maturity_amount);
    }

}

class account_main {
    public static void main(String[] args) {
        savings_ac ob1 = new savings_ac("12345678", "tanmoy", "kolkata,12345566", 5, 1000);
        ob1.show_data();
        current_ac ob2 = new current_ac("12345678", "tanmoy", "kolkata,12345566", 1000, 20000);
        ob2.show_data();
        TD_ac ob3 = new TD_ac("12345678", "tanmoy", "kolkata,12345566", 1000.0f, 1.0f, 5.0f);
        ob3.compute();
        ob3.show_data();
    }
}
