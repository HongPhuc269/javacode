
import java.util.Scanner;

public class Pytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a Value: ");
        double a = sc.nextDouble();
        System.out.println("Enter the b value: ");
        double b = sc.nextDouble();
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
        System.out.println(c);
        System.out.println("Enter the weight:");
        double weight = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("Chi so bmi cua ban la: %.2f",bmi);
        sc.close();
        if (bmi < 18.5) {
            System.out.println("Thieu can");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Can doi");
        }else{
            System.out.println("Thua can");
        }

        System.out.println("Nhap thang bat ky: ");
        int month = sc.nextInt();
        switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("Tháng có 31 ngày");
            break;
        case 2:
            System.out.println("Tháng có 28 hoặc 29 ngày");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("Tháng có 30 ngày");
            break;
        default:
            System.out.println("Không có tháng này");
            break;
        }
    }
}