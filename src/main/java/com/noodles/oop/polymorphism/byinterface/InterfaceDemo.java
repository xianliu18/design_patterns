package com.noodles.oop.polymorphism.byinterface;

/**
 * @Description
 * @Author liuxian
 * @Date 2023/10/20 11:21
 **/
public class InterfaceDemo {

    public static void main(String[] args) {
        Iterator arrayIterator = new Array();
        print(arrayIterator);

        Iterator linkedlistIterator = new LinkedList();
        print(linkedlistIterator);
    }

    private static void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
