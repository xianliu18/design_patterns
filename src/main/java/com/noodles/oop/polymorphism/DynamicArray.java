package com.noodles.oop.polymorphism;

/**
 * @Description 多态示例
 * @Author noodles
 * @Date 2023/10/19 18:07
 **/
public class DynamicArray {

    private static final int DEFAULT_CAPACITY = 10;

    protected int size = 0;

    private int capacity = DEFAULT_CAPACITY;

    protected Integer[] elements = new Integer[DEFAULT_CAPACITY];

    public int size() {
        return this.size;
    }
    
    public Integer get(int index) {
        return elements[index];
    }

    public void add(Integer e) {
        ensureCapacity();
        elements[size++] = e;
    }

    protected void ensureCapacity() {

    }

}
