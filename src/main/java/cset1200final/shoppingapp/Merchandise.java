
package cset1200final.shoppingapp;


public class Merchandise {
    protected double price = 0;
    protected String name = "";
    protected String description = "";
    
    Merchandise(double price, String name, String description){
        this.price = price;
        this.name = name;
        description = this.description;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        return this.name +", "+ this.description +", "+ this.price;
    }
}
