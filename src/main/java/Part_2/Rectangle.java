package Part_2;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(String borderColor, String fillColor, double sideA, double sideB) {
        super(borderColor, fillColor);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getSquare() {
        square = sideA * sideB;
        return square;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (sideA + sideB);
        return perimeter;
    }

    @Override
    public String toString() {
        return "[" +
                " " + perimeter +
                ", " + square +
                ", " + fillColor +
                ", " + borderColor +
                " ]";
    }
}
