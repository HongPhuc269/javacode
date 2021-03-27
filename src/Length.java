import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scanner.nextLine();
        System.out.println("Enter another string: ");
        String s1 = scanner.nextLine();
        System.out.println(s.length());
        System.out.println(s1.length());
        scanner.close();
    }
    
}
