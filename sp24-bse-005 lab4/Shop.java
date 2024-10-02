import java.util.Scanner;
public class Shop {
    private String shopName;
    private Person owner;
    private Product[] productList= new Product[500];
    private String address;
    private static int productCounter=0;
    private static float revenue=0;

    public Shop(String shopName, Person owner, Product[] productList, String address) {
        this.shopName = shopName;
        owner = owner;
        this.productList = productList;
        this.address = address;
    }
    public Shop(Person owner) {
        this.owner = owner;
    }
    public Shop(Person owner, String address) {
        this.owner = owner;
        this.address = address;
    }
    public Shop(String shopName) {
        this.shopName = shopName;
    }


    public void addProduct(){
        Scanner s1= new Scanner(System.in);
        System.out.println("ADD 1MENU");
        System.out.println("Enter Product Name: ");
        String name= s1.nextLine();
        System.out.println("Enter Price: ");
        float price= s1.nextFloat();
        System.out.println("Enter quantity: ");
        int quantity= s1.nextInt();
        Product products= new Product(name, price, quantity);
        productList[productCounter++]= products;
        System.out.println("...........................Product Added.......................");
    }

    public void saleProduct(){
        Scanner s2= new Scanner(System.in);
        System.out.println("SALE MENU");
        System.out.println("Enter Product ID you want to Sell: ");
        String id1= s2.nextLine();

        for(int i=0; i<productCounter; i++){
            if(productList[i]!= null && productList[i].getId().equals(id1))
                if(productList[i].getQuantity()>0){
                    productList[i].setQuantity(productList[i].getQuantity()-1);
                    revenue+=productList[i].getPrice();
                    System.out.println("......................Product Sold Successfully......................");
                }
            else{
                    System.out.println("...Product Not Founded...");
                }
        }
    }

    public void removeProduct(){
        Scanner s3= new Scanner(System.in);
        System.out.println("REMOVE MENU");
        System.out.println("Enter product ID you want to be Removed: ");
        String id2= s3.nextLine();

        for(int i=0; i<productCounter; i++){
            if(productList[i] !=null && productList[i].getId().equals(id2)){
                productList[i]= null;
                System.out.println("....................Product Removed.....................");
                return;
            }
            else{
                System.out.println("Product Not founded");
            }
        }
    }

    public void modifyProduct(){
        Scanner s4= new Scanner(System.in);
        System.out.println("MODIFYING PRODUCTS MENU");
        System.out.println("Enter Product Id you wanna modify:");
        String id3= s4.nextLine();

        for(int i=0; i<productCounter; i++){
            if(productList[i]!= null && productList[i].getId().equals(id3)){
                System.out.println("Enter new Name: ");
                productList[i].setName(s4.nextLine());
                System.out.println("Enter new Price: ");
                productList[i].setPrice(s4.nextFloat());
                System.out.println("Enter new Quantity: ");
                productList[i].setQuantity(s4.nextInt());

                System.out.println(".................Product Modified Successfully..................");
            }
            else {
                System.out.println("Product Not Found");
            }
        }
    }

    public void searchProduct() {
        Scanner s5 = new Scanner(System.in);
        System.out.println("Following is the menu for searching: Press 1 for name, Press 2 for ID ");
        int choice = s5.nextInt();
        s5.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter the name of the product to be searched: ");
                String name = s5.nextLine();
                for (int i = 0; i < productCounter; i++) {
                    if (productList[i] != null && productList[i].getName().equalsIgnoreCase(name)) {
                        System.out.println("...Product successfully searched by name...");
                    } else {
                        System.out.println("Product not found by name");
                    }
                }
                break;
            case 2:
                System.out.println("Enter the Id you wanna search: ");
                String id = s5.nextLine();
                for (int i = 0; i < productCounter; i++) {
                    if (productList[i] != null && productList[i].getId().equals(id)) {
                        System.out.println("...product successfully searched by Id...");
                    } else {
                        System.out.println("Product not found by ID");
                    }
                }
                break;
            default:
                System.out.println(".............INVALID INPUT...........");
        };
    }

    public void displayProduct(){
        System.out.println("..............DISPLAY MENU...........");
        for (int i = 0; i < productCounter; i++) {
            if (productList[i] != null) {
                System.out.println(productList[i]);
                System.out.println("__________________");
            }
        }
    }

    public void showRevenue(){
        System.out.println("Total Revenue : "+revenue);
    }
    public void OwnerDetails(){
        System.out.println("Owner Details | "+ new Person(owner.getName(), owner.getEmail()));
    }

    public void Address(){
        System.out.println("Address : "+ getAddress());
    }


    public static int getProductCounter() {
        return productCounter;
    }

    public static void setProductCounter(int productCounter) {
        Shop.productCounter = productCounter;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
