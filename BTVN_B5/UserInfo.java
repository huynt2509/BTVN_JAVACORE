package BTVN_B5;

public class UserInfo {
    // Các thuộc tính
    private String userName;
    private String userPassword;
    private double balance;

    // Constructor
    public UserInfo() {
        this.userName = "taikhoan";
        this.userPassword = "matkhau";
        this.balance = 1000000;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Phương thức toString để hiển thị thông tin tài khoản
    @Override
    public String toString() {
        return "Tên tài khoản: " + userName + "\t" + "Số dư: " + balance;
    }

    // Phương thức kiểm tra thông tin đăng nhập
    public String checkInfor(String username, String password) {
        if (!this.userName.equals(username) || !this.userPassword.equals(password)) {
            return "Bạn đã nhập sai thông tin";
        }
        return "Đăng nhập thành công!";
    }
}
