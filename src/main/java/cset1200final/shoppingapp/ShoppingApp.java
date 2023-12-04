
package cset1200final.shoppingapp;

import java.util.ArrayList;
import java.util.Scanner;


public class ShoppingApp {
    
    protected double price = 0;
    protected String name = "";
    protected String description = "";
    
    protected void merchandise(double price, String name, String description){
        price = this.price;
        name = this.name;
        description = this.description;
    }

    public static void main(String[] args) {
        ArrayList inventory = new ArrayList();
        ArrayList shoppingCart = new ArrayList();
        
        int cease = 1;
        while (cease != 0){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            
            int selection = input.nextInt();
            
            
            
            
            
            
            if (selection == 0){
                cease = selection;
            }
        }
    }
}
