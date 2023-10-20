package com.noodles.oop.abstraction.myfilter.impl;

import com.noodles.oop.abstraction.myfilter.Filter;
import com.noodles.oop.abstraction.myfilter.RpcException;
import com.noodles.oop.abstraction.myfilter.RpcRequest;

/**
 * @Description
 * @Author liuxian
 * @Date 2023/10/20 14:03
 **/
public class AuthencationFilter implements Filter {
    @Override
    public void doFilter(RpcRequest req) throws RpcException {
        System.out.println("鉴权逻辑...");
    }
}
