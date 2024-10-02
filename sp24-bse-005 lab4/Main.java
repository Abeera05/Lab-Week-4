import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Shop shop= new Shop(new Person("Abeera Rehman","SP24-BSE-005"),"Emporium Mall");
        Shop shop1= new Shop("KFC-Khalil Food Corner");
        System.out.println("Restaurant Name: "+shop1.getShopName());
        shop.OwnerDetails();
        shop.Address();

        Scanner scan= new Scanner(System.in);
        while(true){
            System.out.println("..........................................MENU OF THE SHOP..................................");
            System.out.println("Press 1 to Add Products");
            System.out.println("Press 2 to Sell Products");
            System.out.println("Press 3 to Remove Products");
            System.out.println("Press 4 to Modify Products");
            System.out.println("Press 5 to Search Products");
            System.out.println("Press 6 to Display Products");
            System.out.println("Press 7 to Display Revenue");
            System.out.println("............................................................................................");
            System.out.println("");
            System.out.println("Enter number from menu: ");
            int choice=  scan.nextInt();
            switch(choice){
                case 1:
                    shop.addProduct();
                    break;
                case 2:
                    shop.saleProduct();
                    break;
                case 3:
                    shop.removeProduct();
                    break;
                case 4:
                    shop.modifyProduct();
                    break;
                case 5:
                    shop.searchProduct();
                    break;
                case 6:
                    shop.displayProduct();
                    break;
                case 7:
                    shop.showRevenue();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
            }
        }
        }

    }
