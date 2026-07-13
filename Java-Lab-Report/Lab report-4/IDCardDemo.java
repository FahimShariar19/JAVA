class IDCard {
    String name;
    String id;
    String department;
    String institution;

    // Constructor
    IDCard(String name, String id, String department, String institution) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.institution = institution;
    }
    // Method to display ID information
    void showID() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Institution: " + institution);
        System.out.println("---------------------------");
    }
}
public class IDCardDemo {
    public static void main(String[] args) {
        IDCard student1 = new IDCard("Fahim Shariar", "E253071", "Computer and Communication Engineering", "International Islamic University Chattogram");
        IDCard student2 = new IDCard("Sharfuddin Faisal", "E253021", "Economics and Banking", "International Islamic University Chattogram");
        student1.showID();
        student2.showID();
    }
}
