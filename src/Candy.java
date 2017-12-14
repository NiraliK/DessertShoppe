/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niralikantaria
 */
public class Candy extends DessertItem {

    //variables intialized for the weight and the price of the candy 
    private double weight;
    private int pricePerLbs;

    //candy class stores the information about the candy 
    //the canadys name, weight and priceperlb 
    public Candy(String name, double weight, int pricePerLbs) {
        //super created to store the name of the candy 
        super(name);
        this.pricePerLbs = pricePerLbs;
        this.weight = weight;
    }

    //to string created to print out the prinal price of the candy on the recipt 
    @Override
    public String toString() {
        //the cost of the candy is converted to dollar fromc ents
        String costD = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // the correct number of spaces is determined 
        int spaces = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costD.length();
        //for loop created to print out the exact amount of calculated spaces
        for (int i = 0; i < spaces; i++) {
            costD = " " + costD;
        }
        //the cost, name of candy and the spaces to create a recipt is printed out 
        return this.weight + "@ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + "/lb" + "\n" + super.getName() + costD;
    }

    @Override
    //cost of the candy is calculated 
    public int getCost() {
        //the weight is multipled by the price per lb 
        double price = Math.round(weight * pricePerLbs);
        //final price is returned
        return (int) price;
    }
}
