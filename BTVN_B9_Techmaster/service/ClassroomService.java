package BTVN_B9_Techmaster.service;

import BTVN_B9_Techmaster.entities.Classroom;
import BTVN_B9_Techmaster.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomService {
    StudentService studentService = new StudentService();
    public Classroom inputInfor(Scanner scanner) {
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Mời bạn nhập thông tin môn học");
        String subject = scanner.nextLine();
        System.out.println("Mời bạn nhập thông tin học viên");
        while (true){
            Student student = studentService.inputInfor(scanner);
            students.add(student);
            System.out.println("Bạn có muốn tạo tiếp học sinh không?");
            String choose = scanner.nextLine();
            if (choose.equalsIgnoreCase("N"))
                break;
        }
        Classroom classroom = new Classroom(subject, students);
        return classroom;
    }
}
