package com.bjsxt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Item {
    private Long id;
    private String title;
    private String pic;
    private String desc;
    private Long price;
}
