import java.util.Objects;
public class Product {
    private String id;
    private String name;
    private float price;
    private int quantity;

    private static int counter=0;

    public Product(String name, float price, int quantity){
        this.id= String.format("%03d",++counter);
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public Product(String name, float price){
        this (name, price, 0);
    }
    public Product(String name){
        this(name, 0);
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product= (Product)o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name);

    }
    @Override
    public String toString() {
        return String.format("Product Id: %s \n Product name: %s \n Product price: %f \n Product quantity: %d", id, name, price, quantity);
    }


    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Product.counter = counter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
