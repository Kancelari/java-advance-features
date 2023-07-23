package com.sda.java.advance.exercises;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final  int maxSize;

    private int size ;
    private List<Integer> basketList ;

    public void addToBasket(Integer el){

        if(size==maxSize){
            throw new BasketFullException("Basket is full");
        }

        basketList.add(el);
        size++;
    }


    public void removeFromBasket() throws  Exception{
        if(size==0){
            throw new BasketEmptyException("Basket is empty");
        }
        basketList.remove(size-1);
        size--;
    }

    public Basket(int maxSize) {
        this.maxSize = maxSize;
        size = 0 ;
        basketList =  new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Integer> getBasketList() {
        return basketList;
    }

    public void setBasketList(List<Integer> basketList) {
        this.basketList = basketList;
    }
}
