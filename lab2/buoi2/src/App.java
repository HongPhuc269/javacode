import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
        case 1:
            System.out.println("Nhap a vao : ");
            double a = sc.nextDouble();
            System.out.println("Nhap b vao : ");
            double b = sc.nextDouble();
            System.out.println("Nhap c vao : ");
            double c = sc.nextDouble();
            double delta = Math.pow(b, 2) - (4*a*c);
            while (a == 0) {
                System.out.println("Nhap lai");
            } 
            if (a != 0) {
                if (delta == 0) {
                    System.out.println("Phuong trinh co 1 nghiem: "+-b/a);
                }else if(delta > 0){
                    System.out.println("Phuong trinh co 2 nghiem phan biet: " + ((-b+Math.sqrt(delta))/2*a) + ((-b-Math.sqrt(delta))/2*a ));
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }    
            break;
        case 2:
            break;
        default:
            break;
        }
    sc.close();
    }
}
    

