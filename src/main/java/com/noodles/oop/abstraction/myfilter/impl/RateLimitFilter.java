package com.noodles.oop.abstraction.myfilter.impl;

import com.noodles.oop.abstraction.myfilter.Filter;
import com.noodles.oop.abstraction.myfilter.RpcException;
import com.noodles.oop.abstraction.myfilter.RpcRequest;

/**
 * @Description 限流过滤器
 * @Author liuxian
 * @Date 2023/10/20 14:02
 **/
public class RateLimitFilter implements Filter {
    @Override
    public void doFilter(RpcRequest req) throws RpcException {
        System.out.println("限流逻辑...");
    }
}
