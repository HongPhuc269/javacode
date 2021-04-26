import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private int id;
    private String address;
    public Person(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public static int compareByAge(Person p1,Person p2) {
        return p1.getAge() - p2.getAge();
    }
   @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", id=" + id + ", name=" + name + "]";
    }
public static void main(String[] args) {
    ArrayList<Person> list = new ArrayList<Person>();
    //     
}
}