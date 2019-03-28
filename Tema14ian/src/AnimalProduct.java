import java.time.LocalDate;

public class AnimalProduct extends Store{

    private String storageTemperature;
    public AnimalProduct(){
   /**     Scanner keyboard = new Scanner(System.in
        AnimalProduct animal = new AnimalProduct();

        System.out.println("Enter the uniqueID: \n");
        animal.setUniqueID(keyboard.nextInt());

        System.out.println("Enter the uniqueID: \n");
        animal.setName(keyboard.next());

        System.out.println("Enter the price: \n");
        animal.setPrice(keyboard.nextDouble());

        System.out.println(" Enter the validity for the product in format yyyy-mm-dd");
        animal.setValidity(LocalDate.parse(keyboard.next()));

        System.out.println("Enter the weight: \n");
        animal.setWeight(keyboard.nextDouble());

        System.out.println("Enter the  storage packaging:");
        animal.setStorageTemperature(keyboard.next());

        System.out.println("The product has been created ! \n " + animal.toString());
        System.out.println("Animal"+ animal);

  */
    }

    int numberOfAnimalProduct = 1;
    private long uniqueID;
    private double weight;
    private String name;
    private double price;
    private LocalDate validity;



    public AnimalProduct(long uniqueID, double weight, String name, double price, LocalDate validity) {
        this.uniqueID = uniqueID;
        this.weight = weight;
        this.name = name;
        this.price = price;
        this.validity = validity;

    }

    public String getStorageTemperature() {
        return storageTemperature;
    }

    public void setStorageTemperature(String storageTemperature) {
        this.storageTemperature = storageTemperature;
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

    public double getPrice() {
        return price;
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


}
