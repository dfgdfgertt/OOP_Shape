import java.util.Scanner;

public class Circle extends Shape{
    protected Point topLeft;
    protected int radius;

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(Point topLeft, int radius) {
        this.topLeft = topLeft;
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public String toString() {
        return "Circle{" +
                "topLeft=" + topLeft +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double calculateArea() {
        return  3.14 * radius * radius;
    }

    @Override
    public void fromConsole() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tọa độ x");
        this.topLeft.x = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tọa dộ y");
        this.topLeft.y = Integer.parseInt(input.nextLine());
        System.out.print("Nhập bán kính");
        this.radius = Integer.parseInt(input.nextLine());
    }
}
