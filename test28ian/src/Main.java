import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<Shape>();
    /**    shapes.add(new Rectangle());
        shapes.add(new Circle(10.0));
        shapes.add(new Triangle(10.0,5 ,5));
        shapes.add(new Square(10.0,6));
     for (Shape shape : shapes) {
     System.out.println(shape.getPerimeter());
     System.out.println(shape.getArea());
     */

            char ch;
            do {
                System.out.println("\nWhat shape do yot choose?");
                System.out.println("1. Circle");
                System.out.println("2. Rectangle");
                System.out.println("3. Triangle");
                System.out.println("4. Square");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        try {
                            System.out.println("Circle radius: ");
                            double radius = scan.nextDouble();
                            Shape circle = new Circle(radius);
                            shapes.add(new Circle(10));
                            System.out.println(" " + "\nResulting Area: " + ((Circle) circle).getArea()
                                    + "\nResulting Perimeter: " + ((Circle) circle).getPerimeter() + "\n");

                        } catch (Exception e) {
                            System.out.println("Error : " + e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Rectangle width:");
                            double width = scan.nextDouble();
                            System.out.println("Rectangle lenght:");
                            double lenght = scan.nextDouble();
                            Shape rectangle = new Rectangle();
                            shapes.add(new Rectangle());
                            System.out.println("" + "\nResulting area: " + ((Rectangle) rectangle).getArea()
                                    + "\nResulting perimeter: " + ((Rectangle) rectangle).getPerimeter() + "\n");

                        } catch (Exception e) {
                            System.out.println("Error : " + e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Triangle lenght a : ");
                            double a = scan.nextDouble();
                            System.out.println("Triangle lenght b : ");
                            double b = scan.nextDouble();
                            System.out.println("Triangle lenght c : ");
                            double c = scan.nextDouble();
                            Shape triangle = new Triangle(a, b, c);
                            shapes.add(new Triangle(10.0,5 ,5));
                            System.out.println("" + "\nResulting Area: " + ((Triangle) triangle).getArea()
                                    + "\nResulting Perimeter: " + ((Triangle) triangle).getPerimeter() + "\n");
                        } catch (Exception e) {
                            System.out.println("Error : " + e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                        System.out.println("Square width:");
                        double wid = scan.nextDouble();
                        System.out.println("Square lenght:");
                        double len = scan.nextDouble();
                        Shape square = new Square(wid, len);
                        shapes.add(new Square(10.0,6));
                        System.out.println("" + "\nResulting area: " + ((Square) square).getArea()
                                + "\nResulting perimeter: " + ((Square) square).getPerimeter() + "\n");
                        } catch (Exception e) {
                            System.out.println("Error : " + e.getMessage());}
                    default:
                        System.out.println("Wrong Entry \n ");
                        break;
                }
                System.out.println("\nDo you want to continue (Type y or n) \n");
                ch = scan.next().charAt(0);

            } while (ch == 'Y' || ch == 'y');
        }
    }


