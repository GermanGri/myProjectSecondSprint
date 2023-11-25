package model;

public class Meat extends Food implements Discountable {
    private double discount;
    public Meat(int amount, double price){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }
    public double getDiscount() {
        return discount;
    }

}
