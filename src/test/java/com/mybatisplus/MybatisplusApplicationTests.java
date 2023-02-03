package com.mybatisplus;

import com.mybatisplus.entity.Admin;
import com.mybatisplus.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Resource
    AdminService adminService;

    @Test
    void contextLoads() {
        List<Admin> list =
                adminService.list();
        System.out.println(list);
    }

}
