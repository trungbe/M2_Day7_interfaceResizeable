public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        System.out.println(circle.getArea());
        circle.resize(100);
        System.out.println(circle.getArea());

        System.out.println("-------------------");

        Square square = new Square("black",true,5.8);
        System.out.println(square);
        square.resize(40);
        System.out.println(square);
    }
}
