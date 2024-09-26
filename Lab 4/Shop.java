import java.util.Scanner;
public class Shop{

	private Product productList[]= new Product[500];
	private Person owner;
	private String address;
	private static int productCount=0;

    public Shop(Person owner, String address) {
        this.owner = owner;
        this.address = address;
        this.productList = new Product[100];
    }

	public void addProduct(){
		Scanner input =new Scanner(System.in);
		System.out.println("Enter product details:");

		System.out.print("Name: ");
  	      String name = input.nextLine();
       	 	System.out.print("Price: ");
        	double price = input.nextDouble();
        	System.out.print("Quantity: ");
        	int quantity = input.nextInt();
		
		Product product= new Product(name, price,quantity);
		productList[productCount++]=product;
     		System.out.println("Product added");

	}

	
	public void displayProduct(){
		System.out.println("Product List: ");

        	for (int i=0; i<productCount; i++) {
                	System.out.println(productList[i]);
        	}
        }
	
	
	
	
}