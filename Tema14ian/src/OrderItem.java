import java.time.LocalDate;

public class OrderItem {

    private LocalDate data;
    private int uniqueID;
    private int stock;
    private AnimalProduct product;


    public OrderItem(LocalDate data, int uniqueID, int stock) {
        this.data = data;
        this.uniqueID = uniqueID;
        this.stock = stock;
        this.product = product;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public AnimalProduct getProduct() {
        return product;
    }

    public void setProduct(AnimalProduct product) {
        this.product = product;
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
}