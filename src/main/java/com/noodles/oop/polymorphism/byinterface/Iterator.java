package com.noodles.oop.polymorphism.byinterface;

/**
 * @Description 利用接口来实现多态特性
 * @Author liuxian
 * @Date 2023/10/20 11:19
 **/
public interface Iterator {
    Boolean hasNext();
    String next();
    String remove();
}
