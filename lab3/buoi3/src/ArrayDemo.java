
import java.util.Scanner;

/**
 * ArrayDemo
 */
public class ArrayDemo {
   public int Min(int a[]){
  int min = a[0];
  for(int i =0 ;i<a.length;i++){
   if(min > a[i]){
    min = a[i];
   }
  }
  return min;
 }

 public int Max(int a[]) {
     int max = a[0];
     for (int i = 0; i < a.length; i++) {
         if (max < a[i]) {
             max = a[i];
         }
     }
     return max;
 }
 

 public static void main(String args[]) {
     ArrayDemo sln = new ArrayDemo();
     System.out.println("Tim Min and Max trong mang mot chieu");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     sc.nextLine();
     int a[] = new int[n];
     for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu" + i);
            a[i] = sc.nextInt();
        }
        //Xuat mang
        System.out.println("Mảng a: ");
    
     for (int i = 0; i < a.length; i++) {
         System.out.print(" " + a[i]);
     }
     System.out.println("");
     System.out.println("Min  = " + sln.Min(a));
     System.out.println("Max  = " + sln.Max(a));
     sc.close();
    }
 
}
