import java.util.Random;
import java.util.Scanner;

public class Program
    {


        public static void main(String[] args) {
            System.out.println(" Intruduceti alegerea ditre piatra, foarfeca, hartie:");
            Random rand = new Random();
            int Play = rand.nextInt(3);
            String[] variante = {"piatra", "foarfeca", "hartie"};
            joc(variante[Play]);
        }

        public static boolean isValid(String player1) {

            if ((player1.equalsIgnoreCase("piatra")) || (player1.equalsIgnoreCase("foarfeca")) || (player1.equalsIgnoreCase("hartie")))    return true;
            else  return false;
        }

        public static void joc(String player2){
            Scanner scan = new Scanner(System.in);
            String sc = scan.next();
            if (isValid(sc)) {
                System.out.println(sc.toLowerCase() + " vs. " + player2);
                if (sc.equalsIgnoreCase(player2)) System.out.println(" Egalitate!");
                else castigator(player2, sc);
            }

            else System.out.println("Va rugam introduceti piatra, foarfeca sau hartie!");

        }

        public static boolean castigator(String player2, String player1){

            if (((player1.equalsIgnoreCase("piatra")) && (player2 == "foarfeca")) ||
                    ((player1.equalsIgnoreCase("foarfeca")) && (player2 == "hartie")) ||
                    ((player1.equalsIgnoreCase("hartie")) && (player2 == "piatra"))) {
                System.out.println("Ai castigat !");
                return true;
            }

            else {
                System.out.println("Ai pierdut !");
                return false;
//                do{
//                    int choice = scan.nextInt();
//
//                    switch (final);
//                    case
//                        Thread.sleep(200);
//                        System.out.println("Terminating or closing java program");
//                        System.exit(1);
//                        break;
//                    default:
//                        System.out.println("Wrong Entry \n ");
//                        break;
//                    System.out.println("\nDo you want to continue (Type y or n) \n");
//                    ch = scan.next().charAt(0);
//
//                } while (ch == 'Y' || ch == 'y');
//                }
            }
        }
    }
