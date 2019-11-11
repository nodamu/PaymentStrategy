package app.controller;

/**
 * PayPalAlgorithm
 */
public class PayPalAlgorithm implements Payment{

    private String email;
    private String password;

    public PayPalAlgorithm(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        // TODO Auto-generated method stub
        System.out.println(amount + " Payed with paypal");

    }

    
}