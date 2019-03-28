public class Main {

    public static void main(String[] args) {
        try {

            int ageInMonths = ageInMonths(Integer.parseInt(args[0]));
            System.out.println("Your age in months is:" + ageInMonths);
        } catch (NumberFormatException e) {
            System.out.println("first program argument needs to be an int");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds");
        } finally {
            System.out.println("Error");
        }
    }


    static int ageInMonths(int age) {
        try {

            if (age < 0) {
                throw new IllegalArgumentException("age should be >= 0");
            }
            return age * 12;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    return 0;
    }

}