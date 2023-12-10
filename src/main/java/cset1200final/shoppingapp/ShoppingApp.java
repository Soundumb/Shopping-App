
package cset1200final.shoppingapp;

import java.util.ArrayList;
import java.util.Scanner;


public class ShoppingApp {
    
    

    public static void main(String[] args) {
        ArrayList<Merchandise> inventory = new ArrayList();
        ArrayList<Merchandise> shoppingCart = new ArrayList();
        
        Merchandise ball = new Merchandise(10.00, "baseball", "throw it");
        Merchandise shoes = new Merchandise(500.00, "jordans", "expensive as F");
        inventory.add(ball);
        inventory.add(shoes);
        
        System.out.println("1 - View inventory");
        System.out.println("2 - View Cart");
        System.out.println("3 - Add to cart");
        System.out.println("4 - Remove from cart");
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
                    Scanner addCart = new Scanner(System.in);
                    System.out.println("Enter the ID number of item to be added to cart");
                    int itemID = addCart.nextInt();
                    itemID -=1;
                    shoppingCart.add(inventory.get(itemID));
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
                    break;
            }
            
            
            
            
            
            
        } 
       
       /*Merchandise ball = new Merchandise(10.00, "baseball", "throw it");
       System.out.println(ball.getPrice());
       
       inventory.add(ball);
       System.out.println(inventory.get(0).getPrice());*/
       
    }
}
