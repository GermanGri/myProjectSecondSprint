package model;

public class Apple extends Food implements Discountable {
    String colour;
    private double discount;

    public Apple(int amount, double price, String colour){
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }

    @Override
    public double getDiscount(){
        if(colour == "red"){
            this.discount = 60.0;
        }else{
            this.discount = 0.0;
        }
        return discount;
    }
}
