package com.test.service;

import com.test.pojo.Menu;

import java.util.List;

/**
 * @Description:
 * @Author: tl
 * @Date: 2019-06-28 11:29
 * @Version: 1.0
 */
public interface DemoService {
    List<Menu> selAllMenu();

    Menu selMenuById(int id);

    int updMenu(Menu menu);
}
