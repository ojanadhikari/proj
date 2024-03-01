package Unit3and4OOP.inheritance.hasa;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-17
 **/
public class Student {
    private int id;
    private String name;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Student student = new Student();
        Address address1 = new Address();
        address1.setLatitude(1.22);
        address1.setLatitude(2.22);
        student.setAddress(address1);
    }
}
