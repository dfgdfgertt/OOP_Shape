import java.util.Scanner;

public class Square extends Shape{
    protected Point topLeft;
    protected int width;

    @Override
    public String toString() {
        return "Square{" +
                "topLeft=" + topLeft +
                ", width=" + width +
                '}';
    }

    public Square(Point topLeft, int width) {
        this.topLeft = topLeft;
        this.width = width;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width*width;
    }

    @Override
    public void fromConsole() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tọa độ x");
        this.topLeft.x = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tọa dộ y");
        this.topLeft.y = Integer.parseInt(input.nextLine());
        System.out.print("Nhập chiều rộng");
        this.width = Integer.parseInt(input.nextLine());
    }
}
