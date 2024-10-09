package BTVN_B4;

//Tạo class Account: username, password, balance
//Khởi tạo 1 account với username : techmaster, password: hoclacoviec, balance: 1000000
//Khi start chương trình hiển thị yêu cầu người dùng login (nhập username, password)
//- Nếu login thất bại -> Thông báo lỗi -> Hỏi người dung có muốn thử lại không?
//- Nếu login thành công -> Hiển thị menu cho người dung lựa chọn các tính năng sau:
//1. Xem thông tin tài khoản (hiển thị username, password, balance)
//2. Rút tiền (cho người dùng nhập vào số tiền muốn rút sau đó in ra biên lai ”Bạn đã rút … vnđ vào lúc …”)
//- Mỗi khi người dùng thực hiện xong 1 chức năng sẽ hiển thị câu thông báo “Do you want to continue? (Y/N)
// + Nếu người dùng chọn “Y” -> Hiển thị lại danh sách tính năng cho người dùng chọn
//+ Nếu chọn “N” -> Thoát chương trình (System.exit() )
//Note: Thực hiện code tách hàm, không được viết hết vào main()

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class BTVN_B4_ATM {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        Scanner sc = new Scanner(System.in);
        String login = "";
        String choice="";

        do {
            System.out.println("Mời bạn nhập ID");
            String username = sc.nextLine();
            System.out.println("Mời bạn nhập mật khẩu");
            String password = sc.nextLine();
            if(username.equals("techmaster") && password.equals("hoclacoviec")) {
                do {
                    System.out.println("Đăng nhập thành công! \nLựa chọn tính năng sau:\n1-Xem thông tin tài khoản \t 2-Rút tiền");
                    int function = Integer.parseInt(sc.nextLine());
                    switch (function){
                        case 1:
                            System.out.println("ID: techaster - mật khẩu: hoclacoviec");
                            break;
                        case 2:
                            System.out.println("Nhập số tiền bạn muốn rút");
                            int money = Integer.parseInt(sc.nextLine());
                            System.out.println("Bạn đã rút "+money+ " vào lúc "+ time);
                            break;
                    }
                    // Hỏi nguời dùng có muốn tiếp tục hay không
                    System.out.println("Do you want to continue (Y/N)");
                    choice = sc.nextLine();
                    if(choice.equals("N")) {
                        System.out.println(" Cảm ơn bạn đã sử dụng dịch vụ!");
                        System.exit(0);
                    }
                }while(choice.equals("Y"));


            }else{
                System.out.println("Sai thông tin. Thử đăng nhập lại? (Enter or Not)");
                login = sc.nextLine();
            }
        }while(login.equals("Enter"));
    }
}
