/**
 * @author: Silochi Adina
 * Using a method getMAx(), the program read three numbers from the console and prints the biggest of them.
 *
 */

import java.util.Scanner;

public class Maxim {


        public  static int maxim;

    public static void main(String[] args) {
        System.out.println("Introduceti primul numar a=");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Introduceti al doilea numar b=");
        int b = sc.nextInt();
        System.out.println("Introduceti al treilea numar c=");
        int c = sc.nextInt();
        getMax(a,b);
        getMax(a,c);
        System.out.println("Numarul cel mai mare este:" + maxim);
    }

        public static void getMax(int first, int second) {


            if (first > second) {
                maxim = first;

            } else {
                maxim = second;
            }

        }

    }
