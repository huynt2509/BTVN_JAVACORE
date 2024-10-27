package Test_OOP.view;

import Test_OOP.service.UserService;

import java.util.Scanner;

public class Menu {
    UserService userService = new UserService();
    // Phương thức đăng nhập
    public void login(Scanner scanner) {
        System.out.println("Nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Nhập password: ");
        String password = scanner.nextLine();

        if (userService.login(username, password)) {
            System.out.println("Đăng nhập thành công.");
            showUserMenu(scanner); // Hiển thị menu người dùng
        } else {
            System.out.println("Sai thông tin đăng nhập. Kiểm tra lại username hoặc password.");
            System.out.println("1 - Đăng nhập lại");
            System.out.println("2 - Quên mật khẩu");
            //nếu người dùng cố tình đăng nhập khi chưa có tài khoản sẽ bị kẹt ở b1 và b2
            //cần thêm lựa chọn thứ 3 để người dùng có thể đk mới tài khoản
            System.out.println("3 - Đăng ký tài khoản mới");
            int choice = Integer.parseInt(scanner.nextLine());


            switch (choice) {
                case 1:
                    login(scanner); // Đăng nhập lại
                    break;
                case 2:
                    System.out.print("Nhập email: ");
                    String email = scanner.nextLine();
                    System.out.print("Nhập mật khẩu mới: ");
                    String newPassword = scanner.nextLine();
                    if (userService.resetPassword(email, newPassword)) {
                        System.out.println("Đặt lại mật khẩu thành công. Bạn có thể đăng nhập lại.");
                    } else {
                        System.out.println("Email không tồn tại. Vui lòng kiểm tra lại.");
                    }
                    break;
                case 3:
                    register(scanner);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    // Hiển thị menu người dùng sau khi đăng nhập thành công
    private void showUserMenu(Scanner scanner) {
        while (true) {
            System.out.println("Chào mừng " + userService.getCurrentUser().getUsername() + ", bạn có thể thực hiện các công việc sau:");
            System.out.println("1 - Thay đổi username");
            System.out.println("2 - Thay đổi email");
            System.out.println("3 - Thay đổi mật khẩu");
            System.out.println("4 - Đăng xuất");
            System.out.println("0 - Thoát chương trình");
            System.out.print("Chọn một tùy chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên người dùng mới: ");
                    String newUsername = scanner.nextLine();
                    if (userService.changeUsername(newUsername)) {
                        System.out.println("Thay đổi tên người dùng thành công.");
                    }/*else {
                    System.out.println("Tên người dùng đã tồn tại. Vui lòng chọn tên khác.");
                    }*/ // đã có thông báo này ở Userervice
                    break;
                case 2:
                    System.out.print("Nhập tên người dùng mới: ");
                    String newEmail = scanner.nextLine();
                    if (userService.changeEmail(newEmail)) {
                        System.out.println("Thay đổi Email thành công.");
                    } //tương tự case 1, đã có thông báo ở UserService
                    break;
                case 3:
                    System.out.print("Nhập mật khẩu mới: ");
                    String newPassword = scanner.nextLine();
                    userService.changePassword(newPassword);
                    System.out.println("Thay đổi mật khẩu thành công.");
                    break;
                case 4:
                    userService.logout();
                    System.out.println("Đăng xuất thành công.");
                    return; // Quay lại menu chính
                case 0:
                    System.out.println("Thoát chương trình.");
                    System.exit(0); // Thoát chương trình
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    // Pt đăng ký mới
    public void register(Scanner scanner) {
        System.out.print("Nhập username: ");
        String username = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập password: ");
        String password = scanner.nextLine();

        if (userService.register(username, email, password)) {
            System.out.println("Đăng ký thành công.");
        } else {
            System.out.println("Không thể đăng ký. Vui lòng kiểm tra lại thông tin.");
        }
    }

//    // Pt thay đổi username
//    private void changeUsername(Scanner scanner) {
//        System.out.print("Nhập username mới: ");
//        String newUsername = scanner.nextLine();
//        if (userService.changeUsername(newUsername)) {
//            System.out.println("Thay đổi username thành công.");
//        } else {
//            System.out.println("Tên người dùng đã tồn tại. Vui lòng chọn tên khác.");
//        }
//    }

    // Pt thay đổi email
//    private void changeEmail(Scanner scanner) {
//        System.out.print("Nhập email mới: ");
//        String newEmail = scanner.nextLine();
//        if (userService.changeEmail(newEmail)) {
//            System.out.println("Thay đổi email thành công.");
//        } else {
//            System.out.println("Email đã tồn tại. Vui lòng chọn email khác.");
//        }
//    }

//    // Pt thay đổi mật khẩu
//    private void changePassword(Scanner scanner) {
//        System.out.print("Nhập mật khẩu mới: ");
//        String newPassword = scanner.nextLine();
//        userService.changePassword(newPassword);
//        System.out.println("Thay đổi mật khẩu thành công.");
//    }

//    // Pt quên mật khẩu
//    private void forgotPassword(Scanner scanner) {
//        System.out.print("Nhập email: ");
//        String email = scanner.nextLine();
//        System.out.print("Nhập mật khẩu mới: ");
//        String newPassword = scanner.nextLine();
//        if (userService.resetPassword(email, newPassword)) {
//            System.out.println("Đặt lại mật khẩu thành công. Bạn có thể đăng nhập lại.");
//        } else {
//            System.out.println("Email không tồn tại. Vui lòng kiểm tra lại.");
//        }
//    }
}
