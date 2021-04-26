import java.util.ArrayList;

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Waiter> list = new ArrayList<Waiter>();
        list.add(new Waiter(1, "NG",34, 2000000L, 1000000L));
        list.add(new Waiter(3, "PG",22, 2000000L, 1000000L));
        list.add(new Waiter(5, "NHG",23, 2000000L, 1000000L));
        list.add(new Waiter(2, "Phuc",25, 3000000L, 1500000L));
        list.add(new Waiter(4, "Tuan",27, 5000000L, 3000000L));
        list.add(new Waiter(8, "Trang",29, 6500000L, 3500000L));
        list.add(new Waiter(6, "Quynh",30, 2300000L, 1100000L));
        list.add(new Waiter(7, "Hoa", 34, 2000000L, 1000000L));
        System.out.println("Sử dụng lambda");
        list.forEach(n->System.out.println(n));
    }
}
