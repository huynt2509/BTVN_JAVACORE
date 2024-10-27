package Test_OOP;

import Test_OOP.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        while (true) {
            System.out.println("Xin mời lựa chọn: ");
            System.out.println("1 - Đăng nhập");
            System.out.println("2 - Đăng ký");
            System.out.println("0 - Thoát chương trình");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    menu.login(scanner);
                    break;
                case 2:
                    menu.register(scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}
