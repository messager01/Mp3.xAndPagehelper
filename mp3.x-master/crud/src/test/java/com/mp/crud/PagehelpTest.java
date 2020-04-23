package com.mp.crud;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mp.crud.dao.UserMapper;
import com.mp.crud.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * create by Shipeixin on 2020/4/23 11:16
 */

@SpringBootTest
public class PagehelpTest {


    @Autowired
    UserMapper userMapper;
    @Test
    public void test(){
        Page<Object> page = PageHelper.startPage(1, 3);
        List<User> all = userMapper.getAll();
        System.out.println(all);
    }
}
