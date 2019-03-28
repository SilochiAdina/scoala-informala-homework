import java.util.Scanner;

    /**
     * @author: Silochi Adina
     * In this code was created a method to convert tempereture from Fahrenheit to Celsius.
     *Then was writed a program to print body temperature, measured in Celsius.
     * You need to write the temperature in Fahrenheit degrees.
     */

    public class Temperature {

        public static void main(String[] args) {

            System.out.println("Enter Fahrenheit value:");
            Scanner sc = new Scanner(System.in);
            double fah = sc.nextDouble();
            convert(fah);
        }

        public static double convert(double fah) {
            double cel = (fah - 32) / 1.8;
            try {
                if (cel > 37) {
                    System.out.println("You are ill!");
                } else if (cel <= 37) {
                    System.out.println("Your body temperature in Celsius degrees is:" + cel);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }

            return cel;
        }
    }


