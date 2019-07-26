package com.test.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.test.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: tl
 * @Date: 2019-06-28 11:34
 * @Version: 1.0
 */
@Controller
public class DemoController {
    @Resource
    private DemoService demoServiceImpl;

    @RequestMapping("/show")
    public String show(Model model){
        model.addAttribute("list", demoServiceImpl.selAllMenu());
        return "/list.jsp";
    }

    @RequestMapping("/update")
    public String updata(int id, Model model){
        model.addAttribute("menu", demoServiceImpl.selMenuById(id));
        return "/update.jsp";
    }
}
