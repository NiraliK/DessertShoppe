/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niralikantaria
 */
public class IceCream extends DessertItem {

    //variable intialized 
    private int cost;

    // the name and price of the ice scream is stored 
    public IceCream(String name, int cost) {
        //the name of the ice cream is super
        super(name);
        //the cast is set  
        this.cost = cost;
    }

    @Override
    //there is no extra cost so the cost of the ice cream is returned 
    public int getCost() {
        return cost;
    }

    @Override
    //tostring method created to print out the cost with the appropiate spacing 
    public String toString() {
        //cost is determined using getcost 
        String costD = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //the spaces between the recipt and name is calculated 
        int spaces = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        //for loop created to print out the exact amount of calculated spaces
        for (int i = 0; i < spaces; i++) {
            costD = "" + costD;
        }
        //return the name and the cost of the icecream
        return super.getName() + costD;
    }
}
