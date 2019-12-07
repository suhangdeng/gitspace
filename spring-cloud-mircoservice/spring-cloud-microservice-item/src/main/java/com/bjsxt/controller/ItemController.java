package com.bjsxt.controller;

import com.bjsxt.pojo.Item;
import com.bjsxt.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     * 对外提供接口服务，查询商品信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public Item queryItemById(@PathVariable("id") Long id) {
        return this.itemService.queryItemById(id);
    }
}
