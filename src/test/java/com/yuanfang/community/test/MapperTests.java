package com.yuanfang.community.test;

import com.yuanfang.community.mapper.DiscussPostMapper;
import com.yuanfang.community.mapper.UserMapper;
import com.yuanfang.community.pojo.DiscussPost;
import com.yuanfang.community.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class MapperTests {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetDiscussPosts(){
//        System.out.println(discussPostMapper);
        List<DiscussPost> list = discussPostMapper.getDiscussPosts(149, 0, 5);
        list.forEach(System.out::println);
    }

    @Test
    public void testGetDiscussPostCount(){
        int count = discussPostMapper.getDiscussPostCount(149);
        System.out.println(count);
    }

    /**
     *     User getUserById(int id);
     *
     *     User getUserByName(String username);
     *
     *     User getUserByEmail(String email);
     *
     *     int insertUser(User user);
     *
     *     int updateStatus(int id, int status);
     *
     *     int updateHeader(int id, String headerUrl);
     *
     *     int updatePassword(int id, String password);
     */

    @Test
    public void testGetUserById(){
        User user = userMapper.getUserById(11);
        System.out.println(user);
    }

    @Test
    public void testGetUserByName(){
        User user = userMapper.getUserByName("zhangfei");
        System.out.println(user);
    }

    @Test
    public void testGetUserByEmail(){
        User user = userMapper.getUserByEmail("nowcoder115@sina.com");
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        User user = new User(
                "xiaonian","shihanhan","123321",
                "xiaonian@qq.com",1,1,"123456789","www.xiaonian.com",new Date());
        int result = userMapper.insertUser(user);
        System.out.println(result);
    }

    @Test
    public void testUpdateStatus(){

        int result = userMapper.updateStatus(150, 0);
        System.out.println(result);

    }

    @Test
    public void testUpdateHeaderUrl(){
        int i = userMapper.updateHeader(150, "www.mreorange.com");
        System.out.println(i);
    }

    @Test
    public void testUpdatePassword(){
        int yuanfang = userMapper.updatePassword(150, "yuanfang");
        System.out.println(yuanfang);
    }

}
