package model.service;
import model.Food;
public class ShoppingCart {
    Food[] foods;
    public ShoppingCart(Food[] foods){
        this.foods = foods;
    }

    public double getSumWithoutDiscount(){
        double sumPrice = 0;
        for (int i = 0; i < foods.length; i++){
            if(foods[i] != null && foods[i].getAmount() > 0.0 && foods[i].getPrice() >= 0){
                sumPrice = sumPrice + foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return sumPrice;
    }
    public double getSumWithDiscount(){
        double sumPrice = 0;
        for (int i = 0; i < foods.length; i++){
            if(foods[i] != null && foods[i].getAmount() > 0.0 && foods[i].getPrice() >= 0){
                sumPrice = sumPrice + foods[i].getAmount() * foods[i].getPrice() * (1 - foods[i].getDiscount()/100.00);
            }
        }
        return sumPrice;
    }
    public double getSumVegetarianWithoutDiscount(){
        double sumPrice = 0;
        for (int i = 0; i < foods.length; i++){
            if(foods[i].isVegetarian() && foods[i] != null && foods[i].getAmount() > 0.0 && foods[i].getPrice() >= 0){
                sumPrice = sumPrice + foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return sumPrice;
    }

}
