
/**
 * @author: Silochi Adina
 * Using a method getMAx(), the program read three numbers from the console and prints the biggest of them.
 *
 */
package Exercise1;
import java.util.Scanner;

public class Maxim {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        exerciseOne();
    }


    private static int getMax(int first, int second) {


        if (first >= second) {
            return first;

        } else {
            return second;
        }
    }
        private static void exerciseOne() {
            System.out.print("Introduceti primul numar a=");
            int a = sc.nextInt();
            System.out.print("Introduceti al doilea numar b=");
            int b = sc.nextInt();
            System.out.print("Introduceti al treilea numar c=");
            int c = sc.nextInt();

            System.out.print("the biggest from " + a + ", " + b + ", " + c +
                    " is: " + getMax(getMax(getMax(a, b), getMax(a, c)), getMax(b, c)));


        }
    }

