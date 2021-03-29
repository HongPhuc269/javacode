import java.util.Scanner;

public class loopexample {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }
        }
        for (int k = 1; k <= 100; k++) {
            if (k % 3 == 0 && k % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (k % 3 == 0 && k % 5 != 0) {
                System.out.println("Fizz");
            } else if (k % 5 == 0 && k % 3 != 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(k);
            }

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so bat ky");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tong la:" + sum);
        sc.close();
        //Kiểm tra n số nguyên tố
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isChecked(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
    //Kiểm tra số nguyên tố    
    public static boolean isChecked(int k){
            if (k < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(k); i++) {
                if (k % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


