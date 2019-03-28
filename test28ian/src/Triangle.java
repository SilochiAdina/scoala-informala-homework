import static java.lang.Math.sqrt;

/**
 * You need to design an application that allows the possibility to calculate the surface and perimeter for multiple
 * types of shape: rectangle, square, circle and triangle.
 * The tool should allow the possibility to add multiple shapes and calculate the total sum for perimeter and for surface.
 * Also, the application should make sure that 2 similar shapes couldn’t be added to the drawing tool.
 * In case 2 similar shapes are added, an appropriate message should be printed to console.
 * Since you want to be sure that you provide a high quality implementation, simulations are needed to
 * prove the main functionalities described above, work correctly (add all types of shapes, add duplicates,
 * add single shape and pairs of shapes).
 * To deliver the work, just make a zip file and attached it to the answer.
 */

public class Triangle extends Shape{
    private double a, b, c; // sides


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c))
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        // P = a + b + c
        return a + b + c;
    }
}
