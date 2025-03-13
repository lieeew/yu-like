package com.yuyuan.thumb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuyuan.thumb.model.entity.Blog;
import com.yuyuan.thumb.service.BlogService;
import com.yuyuan.thumb.mapper.BlogMapper;
import org.springframework.stereotype.Service;

/**
 * @author pine
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog>
        implements BlogService {

}




