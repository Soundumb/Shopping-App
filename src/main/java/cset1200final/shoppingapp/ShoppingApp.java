
package cset1200final.shoppingapp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class ShoppingApp {
    
    

    public static void main(String[] args) {
       
        ArrayList<Date> purchaseLog = new ArrayList();
        ArrayList<Merchandise> inventory = new ArrayList();
        ArrayList<Merchandise> shoppingCart = new ArrayList();
        ArrayList<Merchandise> productsSold = new ArrayList();
        
        
        Merchandise ball = new Merchandise(10.00, "Baseball", "Throw it", "Bob");
        Merchandise shoes = new Merchandise(500.00, "Jordans", "Expensive as F", "Jeff");
        inventory.add(ball);
        inventory.add(shoes);
        
        System.out.println("1 - View inventory");
        System.out.println("2 - Products sold (View Cart)");
        System.out.println("3 - Customer Purchase (Add to cart)");
        System.out.println("4 - Remove from cart");
        System.out.println("5 - Add to inventory");
        System.out.println("6 - Clear inventory");
        System.out.println("7 - Logged dates");
        System.out.println("0 - Exit");
        
        int cease = 1;
        while (cease != 0){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            
            int selection = input.nextInt();
            switch(selection){
                case 0:
                    return;
                    
                case 1:
                    System.out.println("Displaying inventory");
                    for (int i = 0; i < inventory.size(); i++){
                        System.out.println(inventory.get(i));
                    }
                    break;
                    
                case 2:
                    System.out.println("Dispalying Cart");
                    for(int i = 0; i < shoppingCart.size(); i++){
                        System.out.println(shoppingCart.get(i));
                    }
                    break;
                
                case 3:
                    for(int i = 0; i < inventory.size(); i++){
                        System.out.print(i + 1 + ". ");
                        System.out.println(inventory.get(i));
                    }
                    Scanner addCart = new Scanner(System.in);
                    System.out.println("Enter the ID number of item to be added to cart");
                    int itemID = addCart.nextInt();
                    itemID -=1;
                    shoppingCart.add(inventory.get(itemID));
                    inventory.remove(itemID);
                    productsSold.add(inventory.get(itemID));
                    purchaseLog.add(new Date());
                    break;
                    
                case 4:
                    for(int i = 0; i < shoppingCart.size(); i++){
                        System.out.print(i + 1 + ". ");
                        System.out.println(shoppingCart.get(i));
                    }
                    Scanner removeCart = new Scanner(System.in);
                    System.out.println("Enter the cart number of the item to be removed from the cart");
                    int cartID = removeCart.nextInt();
                    cartID-=1;
                    shoppingCart.remove(cartID);
                    purchaseLog.add(new Date());
                    break;
                    
                case 5:
                    Scanner addInventoryPrice = new Scanner(System.in);
                    System.out.println("Enter item price: ");
                    double addPrice = addInventoryPrice.nextDouble();
                    
                    Scanner addInventoryName = new Scanner(System.in);
                    System.out.println("Enter item name: ");
                    String addName = addInventoryName.nextLine();
                    
                    Scanner addInventoryDescription = new Scanner(System.in);
                    System.out.println("Enter a description for the item: ");
                    String addDesc = addInventoryDescription.nextLine();
                    
                    Scanner addInventorySeller = new Scanner(System.in);
                    System.out.println("Enter the name of the seller: ");
                    String addSeller = addInventorySeller.nextLine();
                    
                    Merchandise merch = new Merchandise(addPrice, addName, addDesc, addSeller);
                    inventory.add(merch);
                    purchaseLog.add(new Date());
                    break;
                
                case 6:
                    inventory.clear();
                    System.out.println("Inventory cleared.");
                    purchaseLog.add(new Date());
                    break;
                    
                case 7:
                    // Dates
                    for (int i = 0; i < purchaseLog.size(); i++){
                        System.out.println(purchaseLog.get(i));
                    }
                    
                    break;
            }
            
            
            
            
            
            
        } 
       
       
    }
}
