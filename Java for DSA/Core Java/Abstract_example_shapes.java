abstract class Shape {
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape {
    public double radius;
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    } 
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    public double length;
    public double bredth;
    @Override
    public double perimeter() {
        return 2 * (length + bredth);
    }
    @Override
    public double area() {
        return length * bredth;
    }
}
public class Abstract_example_shapes {
    public static void main(String[] args) {

        Circle ci = new Circle();
        ci.radius = 90.87;

        Shape cs = ci; //shape is used as a refernce for its abstract class
        System.out.println("Perimeter of Circle: " + cs.perimeter());
        System.out.println("Area of Circle: " + cs.area());

        Rectangle re = new Rectangle();
        re.length = 78.76;
        re.bredth = 56.98;

        Shape rs = re; //shape is used as a refernce for its abstract class
        System.out.println("Perimeter of Rectangle: " + rs.perimeter());
        System.out.println("Area of Rectangle: " + rs.area());
    }
}