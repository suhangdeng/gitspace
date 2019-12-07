package com.bjsxt.feign;

import com.bjsxt.pojo.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//声明这是一个feign客户端
@FeignClient(value = "item-provider",fallback =ItemServiceFallback.class)
@RequestMapping("/item")
public interface ItemFeignClient {
    /**
     * 这里定义了类似于springmvc的
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    Item queryItemById(@PathVariable("id") Long id);
}

