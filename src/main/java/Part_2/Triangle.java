package Part_2;

public class Triangle extends Figure{
    private double sideA;
    private double sideB;
    private double sideC;
    private double heightTriangle;
    public  Triangle(String borderColor, String fillColor, double sideA, double sideB, double sideC, double heightTriangle) {
        super(borderColor,fillColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightTriangle = heightTriangle;
    }

    @Override
    public double getSquare() {
        square = (sideA / 2) * heightTriangle;
        return square;
    }
    @Override
    public double getPerimeter() {
        perimeter = sideA + sideB + sideC;
        return perimeter;
    }

}
