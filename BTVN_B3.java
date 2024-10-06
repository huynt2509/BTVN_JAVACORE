package BTVN_B3;

import java.util.Scanner;

public class BTVN_B3 {
    public static void main(String[] args) {

        // Tính tích các số nguyên từ 0 đến n

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n (0 <= n <= 65) ");
        long n = sc.nextInt();
        long tich = 1;
        if (n == 0) {
            tich = 0;
        } else {
            for (long i = 2; i <= n; i++) {
                tich = tich * i;  // hoặc tich *=i;
            }
        }
        System.out.println("kết quả phép toán là: " +tich);
    }
}