class employee1 {
    private int id;
    private String name;

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

public class GetNameSetName {
    public static void main(String[] args) {
        employee1 harry = new employee1();
        harry.setname("Harry");
        harry.setid(77);
        System.out.println("id-" + harry.getid());
        System.out.println("name-" + harry.getname());
    }
}
