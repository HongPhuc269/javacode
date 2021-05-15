import java.util.List;
import java.util.Scanner;

public class StudentManage extends Student{
    Scanner sc = new Scanner(System.in);
    private List<Student> listStudent;
    private StudentFile studentFile;

    public StudentManage() {
        studentFile = new StudentFile();
        listStudent = studentFile.read();
    }

    public void themStudent() {
        int num;
        try {
            do {
                System.out.println("Nhập số lượng học sinh muốn thêm: ");
                num = Integer.parseInt(sc.nextLine());

            } while (!(num > 0 || num < 100));

            for (int i = 0; i < num; i++) {
                System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ":");
                Student student = new Student();
                student.input();
                listStudent.add(student);
                studentFile.write(listStudent);
            }

        } catch (Exception e) {
            System.out.println("Kí tự không hợp lệ!!!");
        }
    }

    public void inThongTinStudent() {
        System.out.println("\nDanh sách các học sinh có trong trường: ");
        if (listStudent != null && listStudent.isEmpty()) {
            System.out.println(" Trường không có!!!");
        }
        listStudent.forEach(element -> System.out.println(element));
    }

  public void timKiemTheoTen() {
        Student student = null;
        System.out.println("Tìm kiếm theo: ");
        System.out.println(" 1. Tên học viên");
        System.out.println(" 2. Tên địa chỉ");
        System.out.print("Chọn: ");
        int n = Integer.parseInt(sc.nextLine());
        String name;
        if (n == 1) {
            System.out.println("Nhập tên sách muốn tìm: ");
            name = sc.nextLine();
            for (int i = 0; i < listStudent.size(); i++) {
                if (listStudent.get(i).getName().equalsIgnoreCase(name)) {
                    student = listStudent.get(i);
                }
            }
        } 
        if (n == 2) {
            System.out.println("Nhập tên tác giả muốn tìm: ");
            name = sc.nextLine();
            for (int i = 0; i < listStudent.size(); i++) {
                if (listStudent.get(i).getAddress().equalsIgnoreCase(name)) {
                    student = listStudent.get(i);
                }
            }
        }

        if (student != null) {
            System.out.println(student.toString());
        } else {
            System.out.println("Không tìm thấy sách này!");
        }
    }

    public void xoa() {
        Student student = null;
        int chon;
        System.out.println("Nhập tên học viên muốn xóa: ");
        String name = sc.nextLine();

        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getName().equalsIgnoreCase(name)) {
                student = listStudent.get(i);
            }
        }

        if (student != null) {
            System.out.println("Bạn có chắc chắn muốn xóa toàn bộ sách!(1. Yes OR 2. No)");
            chon = Integer.parseInt(sc.nextLine());
            if (chon == 1) {
                listStudent.remove(student);
                studentFile.write(listStudent);
                System.out.println("Xóa thành công!");
            }
        } else {
            System.out.println("Học sinh này không tồn tại!");
        }
    }

    public void suaThongTin() {
        System.out.println("Nhập tên sản phẩm muốn sửa: ");
        String name = sc.nextLine();
        boolean b = true;

        for (Student student : listStudent) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.input();
                studentFile.write(listStudent);
                b = false;
            }
        }
        if (b) {
            System.out.println("Không có sản phẩm này!");
        }
    }
    public void menuYear() {
        System.out.println("Các năm: ");
        System.out.print("\n1. Năm thứ nhất");
        System.out.print("\t2. Năm thứ hai");
        System.out.print("\t3. Năm thứ ba");
        System.out.print("\t4. Năm thứ tư");
        System.out.print("\t5. Cựu sinh viên");

        System.out.println("\nChọn các năm: ");
    }
    public void inThongTinTheoYear() {
        int chon;
        menuYear();
        chon = sc.nextInt();
        int size = listStudent.size();
        switch (chon) {
            case 1:
                kiemTraYear(Year.FRESHMAN);
                break;
            case 2:
                kiemTraYear(Year.FRESHMAN);
                break;
            case 3:
                kiemTraYear(Year.FRESHMAN);
                break;
            case 4:
               kiemTraYear(Year.FRESHMAN);
                break;
            case 5:
                kiemTraYear(Year.FRESHMAN);
                break;
            default:
                System.out.println("Không có lựa chọn này!");
                break;
        }

    }

    private void kiemTraYear(Year year) {
        for (Student student : listStudent) {
            if (student.getYear() == year) {
                System.out.println(student.toString());
            }
        }
    }
}