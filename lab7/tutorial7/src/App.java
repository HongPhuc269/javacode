package src;

import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
       

        String luachon;


        while (true) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        System.out.println("Y.Chon Doi hinh 4-4-2 :");
        System.out.println("X.Chon Option khác :");
        System.out.println("N.Để Thoát Chương Trình:");
        System.out.println("Nhập Lựa Chọn Của Bạn :");
        luachon = sc.nextLine();
        switch (luachon) {
        case "Y":
            Team team = new Team();
            team.getArrayList();
            team.buidTeam(4, 4, 2);
            team.showBuild();
            new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
            break;
        case "Q":
            Team team1 = new Team();
            team1.getArrayList();
            int x;
            System.out.println("Số Người Hàng Hậu Vệ :");
            x = Integer.parseInt(sc.nextLine());

           int y;
             System.out.println("Số Người Hàng Tiền Vệ :");
             y = Integer.parseInt(sc.nextLine());
           int z;

             System.out.println("Số Người Hàng Tiền Đạo ::");
            z = Integer.parseInt(sc.nextLine());
            team1.buidTeam(x, y, z);
            team1.showBuild();
            new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
            
            
            break;
            case "N":
                System.exit(0);
                break;

        }
         
            
        }

        
    }
}