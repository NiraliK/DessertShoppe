/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niralikantaria
 */
public class Sundae extends IceCream {

    //varibles are intialized 
    private String toppingName;
    private int toppingCost;

    //the information aboout the sundae is stored 
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    //the cost of the ice cream is calculated and returned 
    public int getCost() {
        int price = (int) (super.getCost() + this.toppingCost);
        return price;
    }

    //to string created to printout the price of the sundae including the spaces 
    public String toString() {
        //the cost is converted from cents to dollars 
        String costD = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //the number of space is calculated 
        int spaces = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costD.length();
        //for loop created to print out the exact amount of calculated spaces
        for (int i = 0; i < spaces; i++) {
            costD = " " + costD;
        }
        //the final price and the name is printed out with the correct number of spaces 
        return this.toppingName + "Sundea with: " + "\n" + super.getName() + costD;

    }

}
