package com.careerdevs.JavaAdvance.Collections;

public class GenericList<T> {
    public T [] items = (T[]) new Object[10] ;
    private int count;

    public void add (T item){ items [count ++]= item;}
    public T get (int index){ return  items[index];}

    public static void main(String[] args) {

    }

}
