import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        System.out.println("Enter Fahrenheit value:");
        Scanner sc = new Scanner(System.in);
        double fah = sc.nextDouble();
        convert(fah);
    }

    public static double convert(double fah) {
        double cel = (fah - 32) / 1.8;
        if (cel > 37) {
            System.out.println("You are ill!");
        } else if (cel <= 37) {
            System.out.println("Your body temperature in Celsius degrees is:" + cel);
        }
        return cel;

    }


}


