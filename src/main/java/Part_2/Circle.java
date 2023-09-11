package Part_2;

public class Circle extends Figure{
    private double r;

    public  Circle(String borderColor, String fillColor, double r) {
        super(borderColor,fillColor);
        this.r = r;
    }
    @Override
    public double getSquare() {
        square = Math.PI * r * r;
        return square;
    }
    @Override
    public double getPerimeter() {
        perimeter = Math.PI * 2 * r;
        return perimeter;
    }
}
