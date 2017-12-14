/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niralikantaria
 */
public class Cookie extends DessertItem {

    //variables are iniliazed 
    private int number;
    private int pricePer12;

    //information of the cookie stored 
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    @Override
    //the cost of cook is calculated 
    public int getCost() {
        //the number of cookies bought out of a douzen multipied by the price of a dozen 
        double price = Math.round((number / 12.0) * this.pricePer12);
        //the price is returned 
        return (int)price;
    }

    @Override
    //to string created to print out the final price on the recpeipt 
    public String toString() {
        //the cost is determined 
        String costD = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //the number of spaces between the name and the cost is calculated 
        int spaces = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costD.length();
        //for loop created to print out the exact amount of calculated spaces
        for (int i = 0; i < spaces; i++) {
            costD = " " + costD;
        }
        //the final price with the spaces on the receipt is printed out 
        return this.number + "@ $" + this.pricePer12 * 0.01 + " /dz" + "\n" + super.getName() + costD;
    }

}
