package com.noodles.oop.polymorphism.byinterface;

/**
 * @Description
 * @Author liuxian
 * @Date 2023/10/20 11:21
 **/
public class LinkedList implements Iterator {

    @Override
    public Boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }

    @Override
    public String remove() {
        return null;
    }
}
