import java.util.Date;
import java.util.Scanner;


public class Employee {
    private int id;
    private String name;
    public String address;
    public String position;
    public double basicSalary;
    public Date dob;
    public Employee(int id, String name, String address, String position, double basicSalary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.position = position;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double SalaryCalculator() {
        Scanner sc = new Scanner(System.in);
        double hours = sc.nextDouble();
        if (hours > 0) {
            return (basicSalary +  (100.000*hours));
        } else {
            return 0;
        }
    }
    
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }

    
}
