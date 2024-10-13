package BTVN_B5.BTVNB5_mangvadoituong;

//Tạo một Class Animal: id(int) name, description, gender(boolean)
//Yêu cầu:
//
//Hỏi người dùng muốn nhập vào bao nhiêu loài vật
//Khởi tạo các loài vật dựa vào thông tin người dùng nhập từ bàn phím
//Lưu tất cả các loài vật đó vào array và in ra

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng loài vật");
        int n = Integer.parseInt(sc.nextLine());
        Animal[] animals = new Animal[n]; // Khai báo mảng animal có n phần tử
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào id loài vật thứ " + (i+1));
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào tên loài vật thứ " + (i+1));
            String name = sc.nextLine();
            System.out.println("Nhập vào mô tả loài vật thứ " + (i+1));
            String description = sc.nextLine();
            System.out.println("Nhập vào giới tính tính (true-male, false-female) loài vật thứ " + (i+1));
            boolean gender = Boolean.parseBoolean(sc.nextLine());
            // Gán các thông tin trên cho phần tử của mảng
            animals[i]= new Animal (id, name, description, gender);
        }
        // SD For- each để in ra thông tin của các đối tượng trong mảng
        System.out.println("Thông tin các loài vật:");
        for (Animal arr : animals) {
            arr.printAnimal();
        }
    }
}
