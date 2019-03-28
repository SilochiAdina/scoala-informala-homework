import java.util.Scanner;

public class Max {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exerciseOne();
    }

    /**
     * method to get the max number out of two
     *
     * @param a first number to compare
     * @param b second number to compare
     * @return the biggest number
     */
    public static String getMax(String a, String b) {
        try {
            if (Integer.parseInt(a) >= Integer.parseInt(b)) {
                return a;
            } else {
                return b;
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Arguments should be numbers:	" + e.getMessage());
        }
    }

    /**
     * method  to find the max from three given numbers, using getMax() method
     */
    private static void exerciseOne() {
        System.out.println("Enter the number for a: ");
        String first = scanner.nextLine();
        System.out.println("Enter the number for b: ");
        String second = scanner.nextLine();
        System.out.println("Enter the number for c: ");
        String third = scanner.nextLine();
        try {
            System.out.println("The biggest from " + first + ", " + second + ", " + third +
                    " is: " + getMax(getMax(getMax(first, second), getMax(first, third)), getMax(second, third)));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid	arguments:	" + e.getMessage());
        }

    }
}