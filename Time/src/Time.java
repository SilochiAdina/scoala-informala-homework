
import java.util.Scanner;

/**
 * @author Silochi Adina
 *
 * You must enter two numers:one for hours and one for minutes,
 * if your data represents a valid data for clock, the program must out put the message
 * " The time now is: hour:min " if not must print  " Incorrect time!".
 */

public class Time {
    public static void main(String[] args) {
        System.out.println("What time is it?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Number for hour is:");
        int hour = sc.nextInt();
        System.out.println("Number for minute is:");
        int min = sc.nextInt();
        Time(hour,min);

    }

    public static void Time(int hour, int min){
            if (hour <= 24 && min <= 60 ) {
            System.out.println(" The time now is: " + hour +":"+ min );
        } else {
            System.out.println(" Incorrect time!");
        }
    }

}