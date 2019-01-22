import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        List<OrderItem> savedOrder = new ArrayList<OrderItem>();
        Store sto = new Store();
        char ch;
        do {
            System.out.println("\nStore Operations");
            System.out.println("1. Create product and add it to stock");
            System.out.println("2. Sell product");
            System.out.println("3. Display daily sales report");
            System.out.println("4. Exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Product type (1 - animal; 2 - vegetable):");
                    int product = scan.nextInt();
                    if (product == 1) {
                        System.out.println("You want to creat a new product. Please input:");
                    } else if (product == 2) {
                        System.out.println("You want to creat a new vegetable product. Please input:");
                    }
                    else
                        System.out.println("This not exist!");
                    try {
                        String input = new String();
                    } catch (Exception e) {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Table = " );
                    } catch (Exception e) {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Enter a date  = " + sto.date());
                    } catch (Exception e) {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 4:
                    Thread.sleep(200);
                    System.out.println("Terminating or closing java program");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            sto.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');


    }



    private void display() {
    }

    private String table() {
        return String.valueOf(0);
    }

    private String date() {
        return date();
    }



    }



