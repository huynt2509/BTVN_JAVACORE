package BTVN_B4;
//Mời người dùng nhập vào số dòng và số cột của ma trận A, B (số dòng và số cột của 2 ma trận bằng nhau)
//Kiểm tra nếu số dòng và số cột của 2 ma trận k bằng nhau -> hiển thị thông báo k thể thực hiện
//Nhập giá trị cho các hàng, các cột (Sử dụng for)
//Tính tổng 2 ma trận

import java.util.Scanner;

public class BTVN_B4_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận A");
        int rowA = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột của ma trận A");
        int colA = Integer.parseInt(sc.nextLine());
        int[][] matrixA = new int[rowA][colA]; // Khai báo ma trận A
        System.out.println("Nhập vào số dòng của ma trận B");
        int rowB = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột của ma trận B");
        int colB = Integer.parseInt(sc.nextLine()); // Khai báo ma trận B
        int[][] matrixB = new int[rowB][colB];
        if (rowA == rowB && colA == colB) {
            // Nhập vào phần tử ma trận A
            for (int i = 0; i < rowA; i++) {     //i tăng khi vòng lặp j chạy hêt
                for (int j = 0; j < colA; j++) {
                    System.out.println("Mời bạn nhập ví trí thứ a["+i+"]["+j+"] của A");
                    matrixA[i][j] = sc.nextInt();
                    System.out.println(matrixA[i][j]);
                }
            }
            System.out.println("Ma trận A là: ");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < colA; j++) {
                    System.out.print(matrixA[i][j] + "\t");
                }
                System.out.println();
            }

            // Nhập vào phần tử ma trận B
            for (int i = 0; i < rowB; i++) {     //i tăng khi vòng lặp j chạy hêt
                for (int j = 0; j < colB; j++) {
                    System.out.println("Mời bạn nhập ví trí thứ b["+i+"]["+j+"] của B");
                    matrixB[i][j] = sc.nextInt();
                    System.out.println(matrixB[i][j]);
                }
            }
            System.out.println("Ma trận B là: ");
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < colB; j++) {
                    System.out.print(matrixB[i][j] + "\t");
                }
                System.out.println();
            }
            // Khai báo ma trận C
//            int rowC = Integer.parseInt(sc.nextLine()); // Không cần khai báo vì số dòng và cột C phải bằng A và B
//            int colC = Integer.parseInt(sc.nextLine());
            int [][] matrixC= new int [rowA][colA];
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < colA; j++) {
                    matrixC[i][j] = matrixA[i][j]+matrixB[i][j];
                }
            }
            // Tổng C = A+B
//            System.out.println("Ma trận C=A+B");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < colA; j++) {
                    System.out.print(matrixC[i][j] + "\t");
                }
                System.out.println();
            }
        }else{
            System.out.println("Không thể thực hiện");
        }
    }
}
