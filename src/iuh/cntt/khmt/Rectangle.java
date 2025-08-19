package iuh.cntt.khmt;

/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  Truong Viet Khai
 * @version: 1.0
 * @created: 19-Aug-2024 9:30:00 PM
 */
public class Rectangle {
    private double length;
    private double width;

    /**
     * Constructor mặc định, gán chiều dài và chiều rộng bằng 1.
     */
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    /**
     * Constructor có tham số.
     * 
     * @param length Chiều dài
     * @param width  Chiều rộng
     * @throws IllegalArgumentException nếu length <= 0 hoặc width <= 0
     */
    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Lấy chiều dài.
     * 
     * @return chiều dài
     */
    public double getLength() {
        return length;
    }

    /**
     * Lấy chiều rộng.
     * 
     * @return chiều rộng
     */
    public double getWidth() {
        return width;
    }

    /**
     * Thiết lập chiều dài mới.
     * 
     * @param newVal chiều dài mới
     * @throws IllegalArgumentException nếu newVal <= 0
     */
    public void setLength(double newVal) {
        if (newVal <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = newVal;
    }

    /**
     * Thiết lập chiều rộng mới.
     * 
     * @param newVal chiều rộng mới
     * @throws IllegalArgumentException nếu newVal <= 0
     */
    public void setWidth(double newVal) {
        if (newVal <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = newVal;
    }

    /**
     * Tính diện tích hình chữ nhật.
     * 
     * @return diện tích
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Tính chu vi hình chữ nhật.
     * 
     * @return chu vi
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Trả về chuỗi mô tả hình chữ nhật.
     * 
     * @return chuỗi thông tin
     */
    @Override
    public String toString() {
        return String.format(
            "Rectangle[length=%.2f, width=%.2f, area=%.2f, perimeter=%.2f]",
            length, width, getArea(), getPerimeter()
        );
    }
}
