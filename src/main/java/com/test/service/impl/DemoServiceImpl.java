package com.test.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.dubbo.service.DemoDubboService;
import com.test.pojo.Menu;
import com.test.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: tl
 * @Date: 2019-06-28 11:29
 * @Version: 1.0
 */
@Service
public class DemoServiceImpl implements DemoService {
    // 注入服务接口对象
    @Reference
    private DemoDubboService demoDubboService;

    @Override
    public List<Menu> selAllMenu() {
        List<Menu> list = demoDubboService.selAllMenu();
        for (Menu menu : list){
            menu.setParent(demoDubboService.selMenuById(menu.getPid()));
        }
        return list;
    }

    @Override
    public Menu selMenuById(int id) {
        Menu menu = demoDubboService.selMenuById(id);
        menu.setParent(demoDubboService.selMenuById(menu.getPid()));
        return menu;
    }

    @Override
    public int updMenu(Menu menu) {
        return demoDubboService.updMenu(menu);
    }
}
