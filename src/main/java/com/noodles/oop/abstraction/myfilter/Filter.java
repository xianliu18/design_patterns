package com.noodles.oop.abstraction.myfilter;

/**
 * @Description
 * @Author liuxian
 * @Date 2023/10/20 14:01
 **/
public interface Filter {
    void doFilter(RpcRequest req) throws RpcException;
}
