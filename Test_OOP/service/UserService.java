package Test_OOP.service;

import Test_OOP.entities.User;

import java.util.ArrayList;

public class UserService {
    ArrayList<User> users = new ArrayList<>();
    User currentUser = null;

    // Đăng ký người dùng mới
    public boolean register(String username, String email, String password) {
        // Kiểm tra xem username đã tồn tại chưa
        if (isUsernameExists(username)) {
            System.out.println("Tên người dùng đã tồn tại. Vui lòg chọn tên khác.");
            return false; //username đã tồn tại
        }

        // Kiểm tra xem email đã tồn tại chưa
        if (isEmailExists(email)) {
            System.out.println("Email đã tồn tại. Vui lòng chọn email khác.");
            return false;
        }

        users.add(new User(username, email, password)); // Thêm người dùng vào arrlist
        return true; // Đăng ký thành công
    }
    // Kiểm tra username đã tồn tại chưa
    private boolean isUsernameExists(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    // Kiểm tra email đã tồn tại chưa
    private boolean isEmailExists(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    // Đăng nhập
    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    currentUser = user; // Đăng nhập thành công
                    return true; // Trả về true nếu đăng nhập thành công
                }
                return false; // Sai mật khẩu
            }
        }
        return false; // Sai username
    }

    public User getCurrentUser() {
        return currentUser; // Trả về người dùng hiện tại
    }

    public void logout() {
        currentUser = null;
    }

    public boolean changeUsername(String newUsername) {
        if (isUsernameExists(newUsername)) {
            return false; // Không thay đổi được nếu username đã tồn tại
        }
        currentUser.setUsername(newUsername); // Cập nhật username
        return true; // Thay đổi thành công
    }

    public boolean changeEmail(String newEmail) {
        if (isEmailExists(newEmail)) {
            return false; // Không thay đổi được nếu email đã tồn tại
        }
        currentUser.setEmail(newEmail); // Cập nhật email
        return true;
    }

    public void changePassword(String newPassword) {
        currentUser.setPassword(newPassword); // Cập nhật mật khẩu
    }

    public boolean resetPassword(String email, String newPassword) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                user.setPassword(newPassword); // Đặt lại mật khẩu
                return true;
            }
        }
        return false; // Không tìm thấy email
    }
}
