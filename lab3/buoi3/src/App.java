public class App {
    public static void main(String[] args) throws Exception {
        int[] a;
        a = new int[5];

        int[] b = new int[10];
        // for (int i = 0; i < b.length; i++) {
        //     b[i] = i;

        // }
        // int sum = 0;
        // System.out.println("mang b:");
        // for (int i = 0; i < b.length; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(b[i]);
        //     }
        //     sum += b[i];
        //     System.out.println("sum"+sum);
        // }

        a[0] = 2 ;
        a[1] = 3;
        a[2] = 6;
        a[3] = 1 ;
        a[4] = 9;
        
        System.out.println("Mang a:");
        show(a);
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }
        // String arr[] = new String[3];
        // arr[0] = "Java";
        // arr[1] = "HTML";
        // arr[2] = "PHP";
        // for (int k = 0; k < arr.length; k++) {
        //     System.out.println(arr[k]);
        
        //Sap xep mang tang dan 
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; i++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep");
        show (a);
    }
        //phuong thuc clone int[]c = b.clone();

    private static void show(int[] a) {
    }
    }

