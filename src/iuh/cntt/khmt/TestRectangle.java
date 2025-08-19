package iuh.cntt.khmt;

import java.util.Scanner;

/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  Truong Viet Khai
 * @version: 1.0
 * @created: 19-Aug-2024 9:30:00 PM
 */
public class TestRectangle {
    /**
     * Phương thức main để chạy chương trình kiểm thử.
     * 
     * @param args không sử dụng
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập chiều dài: ");
            double length = scanner.nextDouble();

            System.out.print("Nhập chiều rộng: ");
            double width = scanner.nextDouble();

            Rectangle rect = new Rectangle(length, width);
            System.out.println(rect.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

