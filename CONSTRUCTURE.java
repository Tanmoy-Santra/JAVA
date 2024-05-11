class newname {
    int id;
    String name;

    public newname(int n, String t) {
        id = n;
        name = t;
    }

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

public class CONSTRUCTURE {
    public static void main(String[] args) {
        int id = 33;
        String name = "tanmoy santra";
        newname tom = new newname(id, name);
        System.out.println("id-" + tom.getid());
        System.out.println("name-" + tom.getname());
    }
}
