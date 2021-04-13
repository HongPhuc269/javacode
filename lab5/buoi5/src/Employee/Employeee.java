package Employee;

import java.util.Scanner;

public abstract class Employeee{
    private int id;
    private String name;
    private int age;
    private String phone;
    private String email;
    private long basicSalary;
    Scanner sc = new Scanner(System.in);
    public Employeee(int id, String name, int age, String phone, String email, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.basicSalary = basicSalary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void input() {
        System.out.println("Enter the the id: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the phone: ");
        phone = sc.nextLine();
        System.out.println("Enter the email: ");
        email = sc.nextLine();
        System.out.println("Enter the basic salary: ");
        basicSalary = Long.valueOf(sc.nextLine());
    }

    public abstract long salaryCalculator();
    @Override
    public String toString() {
        return "Employeee [age=" + age + ", basicSalary=" + basicSalary + ", email=" + email + ", id=" + id + ", name="
                + name + ", phone=" + phone + "]";
    }
    
}
