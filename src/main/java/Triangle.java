import java.util.Scanner;

public class Triangle extends  Shape{
    protected Point p1,p2,p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle() {
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    double distance(Point a, Point b)
    {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    @Override
    public double calculateArea() {
        double ab = distance(p1, p2);
        double bc = distance(p2, p3);
        double ca = distance(p1, p3);
        double s = (ab + bc + ca) / 2;
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
    }

    @Override
    public void fromConsole() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập tọa độ điểm 1");
        System.out.print("Nhập tọa độ x");
        this.p1.x = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tọa dộ y");
        this.p1.y = Integer.parseInt(input.nextLine());

        System.out.print("Nhập tọa độ điểm 2");
        System.out.print("Nhập tọa độ x");
        this.p2.x = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tọa dộ y");
        this.p2.y = Integer.parseInt(input.nextLine());

        System.out.print("Nhập tọa độ điểm 3");
        System.out.print("Nhập tọa độ x");
        this.p3.x = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tọa dộ y");
        this.p3.y = Integer.parseInt(input.nextLine());


    }
}
