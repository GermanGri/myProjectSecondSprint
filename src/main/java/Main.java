import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100.00);
        Apple appleRed = new Apple(10, 50.00, Colour.RED);
        Apple appleGreen = new Apple(8, 60.00, Colour.GREEN);

        Food[] products = {meat, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: " + cart.getSumWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getSumWithDiscount());
        System.out.println("Общая сумма всех вегетарианских продуктов без скидки: " + cart.getSumVegetarianWithoutDiscount());

    }
}