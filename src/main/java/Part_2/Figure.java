package Part_2;

public class Figure {
    public double square;
    public double perimeter;
    public String borderColor;
    public String fillColor;
    public Figure (String borderColor, String fillColor){
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }
    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
