package com.yuyuan.thumb;

import com.yuyuan.thumb.service.BlogService;
import com.yuyuan.thumb.service.ThumbService;
import com.yuyuan.thumb.service.UserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ThumbBackendApplicationTests {

    @Resource
    private ThumbService thumbService;

    @Resource
    private UserService userService;

    @Resource
    private BlogService blogService;

    @Test
    void contextLoads() {
        System.out.println(thumbService.list());
        System.out.println(userService.list());
        System.out.println(blogService.list());
    }

}
