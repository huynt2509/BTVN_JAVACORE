package BTVN_B9_Techmaster.view;

import BTVN_B9_Techmaster.entities.Student;
import BTVN_B9_Techmaster.entities.Techmaster;
import BTVN_B9_Techmaster.service.StudentService;

import java.util.Scanner;

public class Menu {
    StudentService studentService = new StudentService();
    public void displayMenu(Scanner scanner, Techmaster techmaster) {
        System.out.println("1- Hiển thị thông tin chi tiết của trung tâm");
        System.out.println("2- Thêm học viên vào lớp hiện tại");
        System.out.println("3- Cập nhật học lực ");
        System.out.println("4- Xóa học viên");
        System.out.println("5- Thoát");
        System.out.println("Mời bạn lựa chọn");
        selectMenu(scanner, techmaster);

    }

    public void selectMenu(Scanner scanner, Techmaster techmaster){
        int choose = Integer.parseInt(scanner.nextLine());
        switch(choose){
            case 1:// hiển thị thông tin trung tâm
                System.out.println(techmaster);
                break;
            case 2://thêm học viên
                Student newStudent = studentService.inputInfor(scanner);
                techmaster.getClassroom().getStudents().add(newStudent);
                break;
            case 3://cập nhật học lực
                /*System.out.println("Mời b nhập id học viên muốn chỉnh sửa");
                int updateId = Integer.parseInt(scanner.nextLine());
                boolean checkExisted = false;
                for (Student st: techmaster.getClassroom().getStudents()) {
                    if (updateId == st.getId()) { //đây chính là student cần update
                        checkExisted = true;
                        System.out.println("Mời b nhập loại học lực");
                        String classify = scanner.nextLine();
                        st.setClassify(classify);
                        break;
                    }
                }
                if (!checkExisted) {
                    System.out.println("không có học viên có id bằng" +id);
                }*/ //đoạn code này dài, nên đưa vào StudentService
                studentService.updateClassify(scanner, techmaster);

                break;
            case 4://xóa học viên
                studentService.removeStudent(scanner, techmaster);
                break;
            default:
                System.exit(0);
        }
    }
}
