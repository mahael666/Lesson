package Part_2;

public class FigureApp {
    public static void main(String[] args) {
        Circle circle = new Circle("Green", "Blue", 5);
        circle.getPerimeter();
        circle.getSquare();
        System.out.println(circle);

        Rectangle rectangle = new Rectangle("Black", "White", 25, 27);
        rectangle.getPerimeter();
        rectangle.getSquare();
        System.out.println(rectangle);

        Triangle triangle = new Triangle("Orange", "Yellow", 25, 30, 25, 10);
        triangle.getPerimeter();
        triangle.getSquare();
        System.out.println(triangle);
    }
}
