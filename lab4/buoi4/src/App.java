import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        p1.name = "Phuc";
        p1.age = 20;
        

        Person p2 = new Person();
        p2.name = "Huy";
        p2.age = 20;
        
        // Dog[] d = new Dog[2];
        // for (int i = 0; i < d.length; i++) {
        //System.out.println("Nhap thong tin");
        //dog[i] = new Dog();
        //dog[i].input();
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        Car car[] = new Car[n];
        for (int i = 0; i < car.length; i++) {
            System.out.println("Nhap cac du lieu: ");
            car[i] = new Car();
            car[i].input();
        }
        for (int i = 0; i < car.length; i++) {
        System.out.println(car[i].toString());
    }
    }
}
