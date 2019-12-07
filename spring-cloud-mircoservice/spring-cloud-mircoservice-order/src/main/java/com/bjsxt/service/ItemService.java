package com.bjsxt.service;

import com.bjsxt.config.OrderProperties;
import com.bjsxt.feign.ItemFeignClient;
import com.bjsxt.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ItemService {
  @Autowired
  private ItemFeignClient itemFeignClient;
    // Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Autowired
    private RestTemplate restTemplate;
    //@Value("${myspcloud.item.url}")
    //private String itemUrl;
    @Autowired
    private OrderProperties orderProperties;

    public Item queryItemById(Long id) {
       // 该方法走eureka注册中心调用(去注册中心根据item-provider查找服务，这种方式必须先开启负载均衡@LoadBalanced
        //String itemUrl="http://item-provider/item/{id}";
        //Item item = restTemplate.getForObject(itemUrl, Item.class, id);
        Item item = itemFeignClient.queryItemById(id);
        System.out.println("订单系统调用商品服务，item:"+item);
        return item;
    }
}
