import java.time.LocalDate;

public class OrderItem extends Store {

    private LocalDate data;
    private int uniqueID;
    private int stock;
    private AnimalProduct animalproduct;
    private VegetableProduct vegetableproduct;


    public OrderItem(LocalDate data, int uniqueID, int stock) {
        this.data = data;
        this.uniqueID = uniqueID;
        this.stock = stock;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public AnimalProduct getAnimalproduct() {
        return animalproduct;
    }

    public void setAnimalproduct(AnimalProduct animalproduct) {
        this.animalproduct = animalproduct;
    }

    public VegetableProduct getVegetableproduct() {
        return vegetableproduct;
    }

    public void setVegetableproduct(VegetableProduct vegetableproduct) {
        this.vegetableproduct = vegetableproduct;
    }
}