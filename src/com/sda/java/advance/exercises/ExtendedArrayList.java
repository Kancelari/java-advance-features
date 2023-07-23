package com.sda.java.advance.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class ExtendedArrayList<E> extends ArrayList<E> {


    public ExtendedArrayList(Collection<? extends E> c) {
        super(c);
    }

    public ExtendedArrayList() {
    }

    public ExtendedArrayList<E> getEveryNthElement(int startIndex, int skip){

        ExtendedArrayList<E> ls = new ExtendedArrayList<>();
        for (int i = startIndex; i< size() ; i+=skip+1){
            ls.add(get(i));
        }
        return  ls;
    }

    public String partOf(Predicate<E> predicate){
        int i = 0;
        for (E e : this){
            if(predicate.test(e)){
                i++;
            }
        }
        return String.format("%.2f%%",i/(double)size() *100);
    }
}
