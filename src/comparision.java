import java.util.Scanner;

public class comparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :");
        String a = scanner.nextLine();
        System.out.println("Enter the string: ");
        String b = scanner.nextLine();
        System.out.println(a.equals(b));
        scanner.close();
    }
}
