package com.sda.java.advance.exercises;

public class Exercise24 {
    public static void main(String[] args) {
        Basket basket =  new Basket(5);
        try {
            basket.addToBasket(2);
            basket.addToBasket(4);
            basket.addToBasket(2);
            basket.addToBasket(4);
            basket.addToBasket(2);

            System.out.println("Basket: " + basket.getBasketList());

            basket.addToBasket(7);

            basket.removeFromBasket();
            basket.removeFromBasket();

            System.out.println("Basket: " + basket.getBasketList());

            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            System.out.println("Basket: " + basket.getBasketList());

//            basket.removeFromBasket();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
