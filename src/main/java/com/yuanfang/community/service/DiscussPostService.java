package com.yuanfang.community.service;

import com.yuanfang.community.mapper.DiscussPostMapper;
import com.yuanfang.community.pojo.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> getDiscussPosts(int userId, int offset, int limit){
        return discussPostMapper.getDiscussPosts(userId,offset,limit);
    }

    public int getDiscussPostCount(int userId){
        return discussPostMapper.getDiscussPostCount(userId);
    }

}
