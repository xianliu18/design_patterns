package com.noodles.oop.polymorphism;

/**
 * @Description
 * @Author liuxian
 * @Date 2023/10/19 18:09
 **/
public class SortedDynamicArray extends DynamicArray {

    @Override
    public void add(Integer e) {
        ensureCapacity();
        for (int i = size - 1; i>= -1; --i) {
            if (i != -1 && elements[i] > e) {
                elements[i+1] = elements[i];
            } else {
                elements[i+1] = e;
                break;
            }
        }
        ++size;
    }
}
