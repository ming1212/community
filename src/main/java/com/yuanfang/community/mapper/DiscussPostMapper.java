package com.yuanfang.community.mapper;

import com.yuanfang.community.pojo.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    /**
     * 查询所有的帖子
     * 当查询某个用户的发布过的帖子就需要传入用户的id：userId
     * 当用来展示首页帖子数据时即需要查询所有的帖子时，可以不传用户的id，则默认为0
     * 在写sql语句时需要动态拼接用户的id
     * @param userId  用户的id
     * @param offset  分页的起始行号
     * @param limit  每页最多显示的条数
     * @return
     */
    List<DiscussPost> getDiscussPosts(int userId, int offset, int limit);

    /**
     * 查询所有帖子的数量  当传入userId时，则查询对应用户发布的帖子数量，不传时则是所有的帖子数量
     * @param userId  用户的id
     * @return
     */
    //@Param注解用于给参数取别名
    //如果只有一个参数，并且需要在<if>中使用，则必须取别名
    int getDiscussPostCount(@Param("userId") int userId);



}
