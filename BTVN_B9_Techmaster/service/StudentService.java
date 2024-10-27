package BTVN_B9_Techmaster.service;

import BTVN_B9_Techmaster.entities.Student;
import BTVN_B9_Techmaster.entities.Techmaster;

import java.util.Scanner;

public class StudentService {
    public Student inputInfor(Scanner scanner){
        System.out.println("Mời b nhập tên học viên");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập xếp loại học lực");
        String classify = scanner.nextLine();
        return new Student(name, classify);
    }

    public void updateClassify(Scanner scanner, Techmaster techmaster){
         System.out.println("Mời b nhập id học viên muốn chỉnh sửa");
                int updateId = Integer.parseInt(scanner.nextLine());
                boolean checkExisted = false;
                for (Student st: techmaster.getClassroom().getStudents()) { //for-each duyệt mảng
                    if (updateId == st.getId()) { //đây chính là student cần update
                        checkExisted = true;
                        System.out.println("Mời b nhập loại học lực");
                        String newClassify = scanner.nextLine();
                        st.setClassify(newClassify);
                        break;
                    }
                }
                if (!checkExisted) {
                    System.out.println("không có học viên có id bằng" +updateId);
                }
    }

    public void removeStudent(Scanner scanner, Techmaster techmaster){
        System.out.println("Nhập vào id học viên muốn xóa");
        int removeId = Integer.parseInt(scanner.nextLine());
        boolean checkExisted = false;
        for (int i = techmaster.getClassroom().getStudents().size()-1; i>=0; i--){
           /* if (removeId == (i+1)) {
                techmaster.getClassroom().getStudents().remove(i); // Xóa phần tử
                System.out.println("Xóa học viên thành công");
                checkExisted = true;
                break;
            }*/

            // Lấy đối tượng Student từ danh sách
            Student student = techmaster.getClassroom().getStudents().get(i);

            // So sánh id của học viên với removeId
            if (student.getId() == removeId) {
                techmaster.getClassroom().getStudents().remove(i); // Xóa phần tử
                System.out.println("Xóa học viên thành công");
                checkExisted = true;
                break; // Dừng vòng lặp sau khi xóa thành công
            }
        }
        if (!checkExisted) {
            System.out.println("Không tìm thấy học viên có id bằng "+removeId);
        }

    }
}
