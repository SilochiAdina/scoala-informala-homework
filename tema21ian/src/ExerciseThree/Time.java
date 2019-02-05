package ExerciseThree;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        System.out.println("What time is it?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Number for hour is:");
        int hour = sc.nextInt();
        System.out.println("Number for minute is:");
        int min = sc.nextInt();
        displayTime(hour,min);

    }

    public static void displayTime(int hour, int min){
        if (hour <= 24 && min <= 60 ) {
            System.out.println(" The time now is: " + hour +":"+ min );
        } else {
            System.out.println(" Incorrect time!");
        }

    }

}