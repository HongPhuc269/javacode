import java.util.Scanner;

public class App {
    static StudentRepository studentRepository;

    public static void main(String[] args) throws Exception {
        studentRepository = new StudentRepository();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Bạn có muốn tiếp tục chương trình: \nY để tiếp tục \nQ để thoát chương trình");
            System.out.print("Lựa chọn của bạn: ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                Menu.choose();
                System.out.print("Lựa chọn của bạn: ");
                int i = sc.nextInt();
                sc.nextLine();
                switch (i) {
                    case 1:
                        Menu.chooseYear();
                        System.out.print("Lựa chọn của bạn: ");
                        int chooseYear = sc.nextInt();
                        sc.nextLine();
                        getListByYear(chooseYear);
                        break;
                    case 2:
                        System.out.print("Nhập tên sinh viên muốn tìm kiếm: ");
                        String name = sc.nextLine();
                        StudentRepository.search(name);
                        break;
                    case 3:
                        Menu.chooseYear();
                        System.out.print("Lựa chọn của bạn: ");
                        chooseYear = sc.nextInt();
                        sc.nextLine();
                        addStudent(chooseYear);
                        break;
                    case 4:
                        System.out.print("Nhập tên học viên muốn sửa: ");
                        name = sc.nextLine();
                        studentRepository.editStudent(name);
                        break;
                    case 5:
                        System.out.print("Nhập tên học viên muốn xóa: ");
                        name = sc.nextLine();
                        studentRepository.deleteStudent(name);
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                }
            
            }else if (choice.equalsIgnoreCase("q")) {
                System.exit(0);
            }
        }
    }

    public static void getListByYear(int choose) {
        switch (choose) {
            case 1:
                studentRepository.getStudentByYear(Year.FRESHMAN);
                studentRepository.getListByYear();
                break;
            case 2:
                studentRepository.getStudentByYear(Year.SOPHONMORE);
                studentRepository.getListByYear();
                break;
            case 3:
                studentRepository.getStudentByYear(Year.JUNIOR);
                studentRepository.getListByYear();
                break;
            case 4:
                studentRepository.getStudentByYear(Year.SENIOR);
                studentRepository.getListByYear();
                break;
            case 5:
                studentRepository.getStudentByYear(Year.ALUMNI);
                studentRepository.getListByYear();
                break;
        }
    }
    public static void addStudent(int choose) {
        switch (choose) {
            case 1:
                studentRepository.addStudent(Year.FRESHMAN);
                break;
            case 2:
                studentRepository.addStudent(Year.SOPHONMORE);
                break;
            case 3:
                studentRepository.addStudent(Year.JUNIOR);
                break;
            case 4:
                studentRepository.addStudent(Year.SENIOR);
                break;
            case 5:
                studentRepository.addStudent(Year.ALUMNI);
                break;
        }
    }
}