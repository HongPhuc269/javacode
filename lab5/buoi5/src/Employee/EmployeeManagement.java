package Employee;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so luong nhan vien: ");
            int n = sc.nextInt();
            Employeee[] employeees = new Employeee[n];
            for (int i = 0; i < employeees.length; i++) {
                System.out.println("Lua chon nhan vien:(1-Programmer,2-Tester): ");
                int selection = sc.nextInt();
                if (selection == 1) {
                    employeees[i] = new Programmer();
                } else if (selection == 2) {
                    employeees[i] = new Tester();
                }
                employeees[i].input();
            }
            System.out.println("Employee information: ");
                for (int i = 0; i < employeees.length; i++) {
                    System.out.println(employeees[i].toString());
                }
            sc.close();
            ;
        }
    }
