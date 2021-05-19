import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository {
    static List<Student> studentList;
    List<Student> listByYear;
    static String MYFILE = "student.txt";

    public StudentRepository() {
        studentList = new ArrayList<>();
        File myFile = new File(MYFILE);

        try {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String s = myReader.nextLine();
                String str[] = s.split(" - ");
                int id = Integer.parseInt(str[0]);
                String name = str[1];
                Year year = null;
                if (str[2].equals(Year.FRESHMAN)) {
                    year = Year.FRESHMAN;
                } else if (str[2].equals(Year.SOPHONMORE)) {
                    year = Year.SOPHONMORE;
                } else if (str[2].equals(Year.JUNIOR)) {
                    year = Year.JUNIOR;
                } else if (str[2].equals(Year.SENIOR)) {
                    year = Year.SENIOR;
                } else if (str[2].equals(Year.ALUMNI)) {
                    year = Year.ALUMNI;
                }
                double GPA = Double.parseDouble(str[3]);
                String address = str[4];
                String phone = str[5];
                studentList.add(new Student(id, name, year, GPA, address, phone));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        studentList.forEach(System.out::println);
        

    }
     public static void search(String name){
        int count = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(name)) {
                System.out.println(studentList.get(i).toString());
                count++;
            }
        }
        System.out.println((count == 0) ? "Không có sản phẩm này" : "");

    }
     public List<Student> getStudentByYear(Year year){
        listByYear = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getYear().equals(year)){
                listByYear.add( studentList.get(i));
            }
        }
        return listByYear;
    }
    public void getListByYear(){
        listByYear.forEach(System.out::println);
    }
    public void addStudent(Year year) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        
    }
    public void editStudent(String nameStudent) {
        int count = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(nameStudent)) {
                System.out.println(studentList.get(i).toString());
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập id mới : ");
                int id = Integer.parseInt(sc.nextLine());
                studentList.get(i).setId(id);
                System.out.println("Nhập tên mới: ");
                String name = sc.nextLine();
                studentList.get(i).setName(name);
                System.out.println("Nhập GPA mới: ");
                double GPA = Double.parseDouble(sc.nextLine());
                studentList.get(i).setGPA(GPA);
                System.out.println("Nhập địa chỉ mới : ");
                String address = sc.nextLine();
                studentList.get(i).setAddress(address);
                System.out.println("Nhập số điện thoại mới : ");
                String phone = sc.nextLine();
                studentList.get(i).setPhone(phone);
                count++;
                System.out.println("Học viên sau khi sửa");
                System.out.println(studentList.get(i).toString());

            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy học viên");
        }
        writeFile();
    }
    public void deleteStudent(String name){
        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getName().contains(name)){
                System.out.println(studentList.get(i).toString());
                studentList.remove(studentList.get(i));
            }
        }
        System.out.println("Xóa thành công!!!");
        System.out.println("Danh sách sau khi xóa: ");
        studentList.forEach(System.out::println);
        writeFile();
    }


        public void writeFile(){
            try {
                FileWriter fileWriter = new FileWriter(MYFILE);
                for (Student s:  studentList) {
                fileWriter.write(s.toString()+"\n");
                }
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
        }

    }

}

