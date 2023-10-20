package com.noodles.oop.abstraction.myfilter;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author liuxian
 * @Date 2023/10/20 14:03
 **/
public class FilterApplication {

    private List<Filter> filters = new ArrayList<>();
//    filters.add(new AuthencationFilter());
//    filters.add(new RateLimitFilter());


    public void handleRpcRequest(RpcRequest req) {
        try {
            for (Filter filter : filters) {
                filter.doFilter(req);
            }
        } catch (RpcException e) {
            System.out.println("出现异常...");
        }
    }
}
