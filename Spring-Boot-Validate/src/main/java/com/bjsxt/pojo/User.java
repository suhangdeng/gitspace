package com.bjsxt.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private String userid;
    @NotBlank(message = "用户名不能为空") //用户名非空校验
    @Length(min = 2,max = 6,message = "最小长度为2位，最大长度为6位")
    private String realname;
    @NotBlank(message = "密码不能为空")  //密码非空校验
    private String password;
    @Min(15)
    private Integer age;

    private String hobby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")//将前台字符串转换成date
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")//后台转到前台转换成String
    private Date hiredate;

    private static final long serialVersionUID = 1L;
}