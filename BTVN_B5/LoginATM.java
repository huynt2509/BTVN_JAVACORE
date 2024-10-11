package BTVN_B5;

import java.time.LocalDateTime;
import java.util.Scanner;

public class LoginATM {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        Scanner sc = new Scanner(System.in);
        UserInfo user = new UserInfo();
        String relogin = "";
        String choice = "";
        do {
            System.out.println("Nhập ID của bạn");
            String username = sc.nextLine();
            System.out.println("Nhập mật khẩu của bạn");
            String password = sc.nextLine();

            // Gọi phương thức checkinfor và gán kết quả vào loginResult
            String loginResult = user.checkInfor(username, password);

            // Nếu loginResult là "Đăng nhập thành công", thoát vòng lặp
            if (loginResult.equals("Đăng nhập thành công!")){
                System.out.println(loginResult);
                do {
                    System.out.println("Lựa chọn tính năng");
                    System.out.println("1-Xem thông tin tài khoản" + "\t" + "2-Rút tiền mặt");
                    int funtion = Integer.parseInt(sc.nextLine());
                    switch (funtion) {
                        case 1:
                            System.out.println(user);
                            break;
                        case 2:
                            System.out.println("Nhập số tiền bạn muốn rút");
                            double money = Double.parseDouble(sc.nextLine());
                            if (money > user.getBalance()) {
                                System.out.println("Số dư của bạn không đủ");
                            } else {
                                System.out.println("Bạn đã rút: " + money +" VND"+ "vào lúc: " + time);
                            }
                            break;
                    }
                    //Hỏi người dùng bạn có muốn tiếp tục không
                    System.out.println("Bạn có muốn tiếp tục không? (Y/N)");
                    choice = sc.nextLine();
                    if (choice.equalsIgnoreCase("n")) {
                        System.out.println("Cảm ơn bạn đã sử dụng dịch vụ!");
                        System.exit(0);
                    }
                }while (choice.equalsIgnoreCase("y"));
            }else{
                System.out.println(loginResult);
                System.out.println("Bạn có muốn đăng nhập lại không? (Enter or Not)");
                relogin = sc.nextLine();
            }
        }while (relogin.equalsIgnoreCase("enter"));
    }
}
