package com.bjsxt.feign;

import com.bjsxt.pojo.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 此类中的方法专门用于服务降级，该类一般要实现调用远程服务的接口(这样保证方法名一致)
 */
@Component("b")
@RequestMapping("fallback/item/")
public class ItemServiceFallback implements ItemFeignClient {
    /**
     * 服务降级的方法要和原方法一直(名称、)
     * @param id
     * @return
     */
    @Override
    public Item queryItemById(Long id) {
        return new Item(null,"服务降级方法queryItemByid",null,"服务降级方法queryItemByid",null);
    }
}
