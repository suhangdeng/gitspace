package com.bjsxt.controller;

import cn.hutool.crypto.SecureUtil;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UserService userService;

    /**
     * 跳转到添加页面
     * 解决异常的方式。可以在跳转页面的方法中注入一个User对象
     * 注意：由于Springmvc会将该对象放入到Model中传递。key的名称会使用该对象的驼峰式的名宁规则来作为key
     * 参数的变量名需要与对象的名称相同、将首字母小写
     * 可以通过ModelAttribute注解给user起个别名，那么前台接收对象时也必须保持一致
     * @return
     */
    @RequestMapping("/addUser")
    public String showPage(User user) {
        return "add";
    }

    /**
     * 完成用户添加
     * @param user
     * @param result
     * @Valid 开启对User对象的数据校验
     * BindingResult:封装了校验的结果 会将不合法的对象复制一份，以驼峰命名该对象变量传回前台
     * 因为又要跳转到add页面，因为校验不通过，所以此时add页面不存在user对象，必须借助ModelAttribute注解
     * 并且名称也要和前台保持一致
     * @return
     */
    @PostMapping("/save")
    public String insert(@ModelAttribute("user") @Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("nihao");
            return "add";
        }
        user.setPassword(SecureUtil.md5(user.getPassword()));
         userService.insert(user);
        System.out.println("添加成功");
        return "ok";
    }
}
