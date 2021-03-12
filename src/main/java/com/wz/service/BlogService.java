package com.wz.service;

import com.wz.po.Blog;
import com.wz.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {

    Blog getBlog(Long id);

    Blog getAndConvert(Long id);  //展示

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Blog saveBlog(Blog blog);

    Page<Blog> listBlog(Long id, Pageable pageable);  //tagid 查询

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(String query, Pageable pageable);//搜索

    List<Blog> listRecommendBlogTop(Integer size);

    Map<String,List<Blog>> archiveBlog();  //归档博客

    Long countBlog();  //数目

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);
}
