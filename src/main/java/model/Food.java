package model;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected  boolean isVegetarian;

    public int getAmount(){
        return amount;
    }
    public double getPrice(){
        return price;
    }
    public boolean isVegetarian(){
        return isVegetarian;
    }
    public double getDiscount(){
        return 0.0;
    };
}


