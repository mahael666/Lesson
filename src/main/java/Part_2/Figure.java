package Part_2;

public class Figure implements HasPerimeter, HasSquare {
    public double square;
    public double perimeter;
    public String borderColor;
    public String fillColor;

    public Figure(String borderColor, String fillColor) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public double getSquare() {
        return square;
    }
}
