class Time {
    int hr;
    int min;
    double sec;

    Time(int hr, int min, double sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    void showtime() {
        System.out.println("Time: " + hr + " hours " + min + " minutes " + sec + " seconds");
    }

    void add_time(int hours, int minutes) {
        hr += hours;
        min += minutes;

        if (min >= 60) {
            hr++;
            min -= 60;
        }
    }

    void add_time(int minutes) {
        min += minutes;
        if (min >= 60) {
            hr++;
            min -= 60;
        }
    }

    void add_time(double seconds) {
        sec += seconds;

        if (sec >= 60.0) {
            min++;
            sec -= 60.0;
        }
        if (min >= 60) {
            hr++;
            min -= 60;
        }

    }

    Time add_time(Time T) {
        Time T2 = new Time(0, 0, 0);
        T2.hr = T.hr + hr;
        T2.min = T.min + min;

        if (T2.min >= 60) {
            T2.hr = T2.hr + 1;
            T2.min = T2.min - 60;
        }
        T2.sec = T.sec + sec;
        if (T2.sec >= 60) {
            T2.min = T2.min + 1;
            T2.sec = T2.sec - 60;
        }

        return T2;
    }

    public static void main(String[] args) {

        Time t1 = new Time(1, 59, 56.4);
        Time t2 = new Time(4, 59, 58.2);
        System.out.println("Initial Time:");
        t1.showtime();
        System.out.println();
        t1.add_time(55);
        System.out.println("Time after adding minutes:");
        t1.showtime();
        System.out.println();
        t1.add_time(2, 59);
        System.out.println("Time after adding  hour and minuite:");
        t1.showtime();
        System.out.println();
        t1.add_time(58.5);
        System.out.println("Time after adding seconds:");
        t1.showtime();
        System.out.println();
        System.out.println("Time after Add with object reference:");
        Time t3 = t1.add_time(t2);
        t3.showtime();

    }

}
