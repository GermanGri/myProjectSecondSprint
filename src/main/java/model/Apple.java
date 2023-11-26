package model;
import model.constants.Colour;
import model.constants.Discount;
public class Apple extends Food implements Discountable {
    private final String colour;
    public Apple(int amount, double price, String colour){
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }
    @Override
    public double getDiscount(){
        if(colour.equals(Colour.RED)){
            return Discount.RED_APPLE_DISCOUNT;
        }else{
            return Discount.NO_DISCOUNT;
        }
    }
}
