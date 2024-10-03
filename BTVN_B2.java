package BTVN_B2;

import java.util.Scanner;

public class BTVN_B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập forn đăng ký lớp học Java 29:");
        // Tên
        System.out.println("Xin mời nhập tên của bạn");
        String name = sc.nextLine();
        System.out.println("Tên của bạn là: " + name);

        // Tuổi - sd toán tử 3 ngôi để đặt điều kiện
        System.out.println("Xin mời nhập tuổi của bạn");
        int age = Integer.parseInt(sc.nextLine());
        String resultAge = (age>=0 && age<=100)? "Tuổi của bạn là: " + age : "Tuổi này còn học hành gì nữa ???";
        System.out.println(resultAge);

        // Môn học
        System.out.println("Xin mời nhập tên môn học");
        String subject = sc.nextLine();
        System.out.println("Môn học bạn đăng ký: " + subject);

        // Email - sd toán tử 3 ngôi
        System.out.println("Xin mời bạn nhập email");
        String mail = sc.nextLine();
        // Sd method constains để ktra giá trị của biến 'mail' có chứa chuỗi cần tìm (ở đây là ký tự @) hay không
        String resultEmail = mail.contains("@") ? "Email của bạn là: " + mail : "Thưa ngài, thiếu cmn @ rồi :v";
        System.out.println(resultEmail);

    }
}
