import java.util.Scanner;

public class Rectangle extends Shape{

    protected int width,height;
    protected Point topLeft;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Rectangle(int width, int height, Point topLeft) {
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;
    }
    public Rectangle() {
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", topLeft=" + topLeft +
                '}';
    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public  void fromConsole() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tọa độ x");
        this.topLeft.x = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tọa dộ y");
        this.topLeft.y = Integer.parseInt(input.nextLine());
        System.out.print("Nhập chiều dài");
        this.height = Integer.parseInt(input.nextLine());
        System.out.print("Nhập chiều rộng");
        this.width = Integer.parseInt(input.nextLine());
    }
}
