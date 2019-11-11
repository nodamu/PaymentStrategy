package app;

import app.controller.CreditCardAlgorithm;
import app.controller.ShoppingCart;
import app.model.Product;

public class App {
    public static void main(String[] args)  {
        ShoppingCart cart = new ShoppingCart();

        Product shirt = new Product(100, "212");
        Product laptop = new Product(5000, "213");

        cart.addProduct(shirt);
        cart.addProduct(laptop);

        // 

        cart.pay(new CreditCardAlgorithm("Nick", "123456TGD"));


    }
}