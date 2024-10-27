package BTVN_B9_Techmaster.service;

import BTVN_B9_Techmaster.entities.Classroom;
import BTVN_B9_Techmaster.entities.Techmaster;

import java.util.Scanner;

public class TechmasterService {
    ClassroomService classroomService = new ClassroomService();
    public Techmaster inputInfor(Scanner scanner) {
        System.out.println("Mời bạn nhập thông tin quản lý lớp");
        String manager = scanner.nextLine();
        System.out.println("Mời bạn nhập thông tin giáo viên");
        String teacher = scanner.nextLine();
        System.out.println("Mời bạn nhập thông tin lớp học");
        Classroom classroom = classroomService.inputInfor(scanner);
        return new Techmaster(manager, teacher, classroom);
    }
}
