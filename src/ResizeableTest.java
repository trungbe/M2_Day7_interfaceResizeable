public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        System.out.println(circle.getArea());
        circle.resize(100);
        System.out.println(circle.getArea());

        System.out.println("-------------------");

        Square square = new Square("black",true,5.8);
        System.out.println(square.getArea());
        square.resize(40);
        System.out.println(square.getArea());

        System.out.println("-------------------");

        Rectangle rectangle =new Rectangle(8,2);
        System.out.println(rectangle.getArea());
        rectangle.resize(60);
        System.out.println(rectangle.getArea());
    }
}
