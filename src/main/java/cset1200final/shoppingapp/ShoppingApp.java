
package cset1200final.shoppingapp;

import java.util.ArrayList;
import java.util.Scanner;


public class ShoppingApp {
    
    

    public static void main(String[] args) {
        ArrayList inventory = new ArrayList();
        ArrayList shoppingCart = new ArrayList();
        
        
        
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
                    System.out.println("1 was chosen");
                    break;
                    
                case 2:
                    System.out.println("2 was chosen");
                    break;
            }
            
            
            
            
            
            /*if (selection == 0){
                cease = selection;
            }*/
        } 
       
       
       
    }
}
