package com.bjsxt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {
    private String orderId;

    private Item item = new Item();
}
