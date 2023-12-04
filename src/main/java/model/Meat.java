package model;

import model.constants.Discount;

public class Meat extends Food implements Discountable {

    public Meat(int amount, double price){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }
    public double getDiscount() {
        return Discount.NO_DISCOUNT;
    }

}
