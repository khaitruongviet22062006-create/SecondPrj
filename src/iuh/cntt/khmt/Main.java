package iuh.cntt.khmt;
/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  Truong Viet Khai
 * @version: 1.0
 * @created: 19-Aug-2024 9:30:00 PM
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double length = sc.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double width = sc.nextDouble();

        try {
            Rectangle rect = new Rectangle(length, width);
            System.out.println("Chu vi: " + rect.getPerimeter());
            System.out.println("Diện tích: " + rect.getArea());
            System.out.println("Thông tin: " + rect);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        sc.close();
    }
}