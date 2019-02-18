import java.time.LocalDate;
import java.util.Scanner;
public class VegetableProduct {

    private String packagingDescribe;

    public VegetableProduct() {
        Scanner keyboard = new Scanner(System.in);
        VegetableProduct vegetable = new VegetableProduct();

        System.out.println("Enter the uniqueID: \n");
        vegetable.setUniqueID(keyboard.nextInt());

        System.out.println("Enter the uniqueID: \n");
        vegetable.setName(keyboard.next());

        System.out.println("Enter the price: \n");
        vegetable.setPrice(keyboard.nextDouble());

        System.out.println(" Enter the validity for the product in format yyyy-mm-dd");
        vegetable.setValidity(LocalDate.parse(keyboard.next()));

        System.out.println("Enter the weight: \n");
        vegetable.setWeight(keyboard.nextDouble());

        System.out.println("Enter the  storage packaging:");
        vegetable.setPackagingDescribe(keyboard.next());

        System.out.println("The product has been created ! \n " + vegetable.toString());
        System.out.println("Vegetable"+ vegetable);
    }

    int numberOfVegetableProduct = 1;
    private long uniqueID;
    private double weight;
    private String name;
    private double price;
    private LocalDate validity;
    private int stock;


    public VegetableProduct(long uniqueID, double weight, String name, double price, LocalDate validity, int stock) {
        this.packagingDescribe = packagingDescribe;
        this.uniqueID = uniqueID;
        this.weight = weight;
        this.name = name;
        this.price = price;
        this.validity = validity;
        this.stock = stock;
    }


    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: " + this.uniqueID);
    }

    public void setUniqueID() {

        long minNumber = 1;

        long maxNumber = 1000000;
        this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
        String stringNumber = Long.toString(maxNumber);
        int numberString = Integer.parseInt(stringNumber);
        System.out.println("Unique ID set to: " + this.uniqueID);

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double Price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getValidity() {
        return validity;
    }

    public void setValidity(LocalDate validity) {
        this.validity = validity;
    }

    public String getPackagingDescribe() {
        return packagingDescribe;
    }

    public void setPackagingDescribe(String packagingDescribe) {
        this.packagingDescribe = packagingDescribe;
    }

    @Override
    public String toString() {
        return "VegetableProduct{" +
                "packagingDescribe='" + packagingDescribe + '\'' +
                ", numberOfVegetableProduct=" + numberOfVegetableProduct +
                ", uniqueID=" + uniqueID +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", validity=" + validity +
                ", stock=" + stock +
                ", Price=" + Price +
                '}';
    }
}


