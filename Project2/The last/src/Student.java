import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private Year year;
    private double GPA;
    private String address;
    private String phone;
    Scanner sc = new Scanner(System.in);

    public Student(int id, String name, Year year, double gPA, String address, String phone) {
        this.id = id;
        this.name = name;
        this.year = year;
        GPA = gPA;
        this.address = address;
        this.phone = phone;
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
    public Year getYear() {
        return year;
    }
    public void setYear(Year year) {
        this.year = year;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double gPA) {
        GPA = gPA;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
     @Override
     public String toString() {
         // TODO Auto-generated method stub
         return id + " - " + name + " - " + year + " - " + GPA + " - " + address + " - " + phone;
     }

     public void input() {
         System.out.println("Enter the id: ");
         id = Integer.parseInt(sc.nextLine());
         System.out.println("Enter the name: ");
         name = sc.nextLine();
         System.out.println("Enter the GPA: ");
         GPA = Double.parseDouble(sc.nextLine());
         System.out.println("Enter the address: ");
         address = sc.nextLine();
         System.out.println("Enter the phone number: ");
         phone = sc.nextLine();
        }
}
