package com.bjsxt.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 以myspcloud开头的配置被匹配到
 */
@Component
@ConfigurationProperties(prefix = "myspcloud")
@Setter
@Getter
public class OrderProperties {
    private ItemProperties item=new ItemProperties();

}
