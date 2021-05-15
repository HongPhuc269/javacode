import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String choose = null;
        boolean exit = false;
        Student student = new Student();
        StudentManage studentManage = new StudentManage();

        showMenu();
        while (true) {
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    studentManage.themStudent();
                    break;
                case "2":
                    studentManage.inThongTinStudent();
                    break;
                case "3":
                    studentManage.inThongTinTheoYear();
                    break;
                case "4":
                    studentManage.timKiemTheoTen();
                    break;
                case "5":
                    studentManage.suaThongTin();
                    break;
                case "6":
                    studentManage.xoa();
                    break;
                case "7":
                    
                    break;
                case "8":
                    
                    break;
                case "0":
                    exit = true;
                    break;

                default:
                    System.out.println("Không hợp lệ! Chọn lại:");
                    break;
            }

            if (exit) {
                break;
            }
            showMenu();
        }

    }

    
public static void showMenu() {
        System.out.println();
        System.out.println("-----------menu------------");
        System.out.println("1. Thêm học viên");
        System.out.println("2. Hiển thị tất cả học viên có trong thư viện ");
        System.out.println("3. Hiển thị học viên theo năm ");
        System.out.println("4. Tìm kiếm ");
        System.out.println("5. Sửa thông tin học viên");
        System.out.println("6. Xóa sách theo học viên");
        System.out.println("7. Sắp xếp theo id");
        System.out.println("8. Sắp xếp theo tên");

        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Chọn: ");
    }
}
