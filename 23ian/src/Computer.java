/**
 * Design a class hierarchy that models a shop.
 *        1. Customer – holds name, age and balance
 *        2.  Product – base class for all products, holds name, price, quantity and age restriction (can be None, Teenager or Adult). Implements the Buyable interface.
 *                a) FoodProduct – implements the Expirable interface. Returns 70% of the price if the product expires in 15 days time.
 *                b) ElectonicsProduct – base class for electronics, holds guarantee period
 *                    i) Computer – has a guarantee period of 24 months. Returns 95% of the price if the quantity is over 1000.
 *                    ii) Appliance – has a guarantee period of 6 months. Returns 105% of the price if the quantity is less than 50
 *     Define properties (getters and setters) for each class. Validate the data and print messages.
 *     Define the following interfaces:
 *        1. Buyable – holds double getPrice()
 *        2. Expirable – holds Date getExpirationDate()
 *     Create a static class PurchaseManager. The class should hold the processPurchase(Product product, Customer customer) method that handles purchases (takes money from customer, reduces product quantity by 1).The PurchaseManager should print descriptive messages in the following situations:
 *         •    If the product is out of stock (i.e. no quantity)
 *         •    If the product has expired
 *         •    If the buyer does not have enough money
 *         •    If the buyer does not have permission to purchase the given product
 *     Create several products of different types and add them to a list.
 */

public class Computer  extends ElectronicProduct {
    public static final int DEFAULT_Quarantee = 24;
    public Computer(String name, double price, int quantity) {
        super(DEFAULT_Quarantee, name, price, quantity);
    }

    public Computer(String name, double price, int quantity, String ageRestriction) {
        super(DEFAULT_Quarantee,name, price, quantity, ageRestriction);

    }

    public double getPrice() {
        if (this.getQuantity() > 1000) {
            return super.getPrice() * 0.95;
        }
        return super.getPrice();
    }
}

