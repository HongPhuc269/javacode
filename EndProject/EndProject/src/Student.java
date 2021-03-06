import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
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

    public Student() {
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

    private Year inputYear() {
        Scanner sc = new Scanner(System.in);
        menuYear();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                year = Year.FRESHMAN;
                break;
            case 2:
                year = Year.SOPHONMORE;
                break;
            case 3:
                year = Year.JUNIOR;
                break;
            case 4:
                year = Year.SENIOR;
                break;
            case 5:
                year = Year.ALUMNI;
                break;
            default:
                break;
        }
        return year;
    }

    public void menuYear() {
        System.out.println("C??c th??? lo???i sinh vi??n : ");
        System.out.print("\n1. N??m th??? nh???t");
        System.out.print("\t2. N??m th??? hai");
        System.out.print("\t3. N??m th??? ba ");
        System.out.print("\t4. N??m th??? t??");
        System.out.print("\t5. C???u sinh vi??n");

        System.out.println("\nCh???n th??? lo???i sinh vien: ");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + " - " + name + " - " + year + " - " +GPA+ " - " + address + " - " +phone ;
    }
}