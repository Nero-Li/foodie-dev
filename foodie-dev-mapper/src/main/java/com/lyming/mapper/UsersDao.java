package com.lyming.mapper;

import com.lyming.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户表 (Users)表数据库访问层
 *
 * @author lyming
 * @since 2020-09-10 17:45:07
 */
public interface UsersDao {


    /**
     * 根据用户名查询用户数量
     *
     * @param username
     * @return
     */
    Integer queryUsernameIsExist(@Param("username") String username);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Users queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Users> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param users 实例对象
     * @return 对象列表
     */
    List<Users> queryAll(Users users);

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 影响行数
     */
    int insert(Users users);

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 影响行数
     */
    int update(Users users);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    /**
     * 检索用户名和密码是否匹配,用于登录
     *
     * @param username
     * @param password
     */
    Users queryUsersForLogin(@Param("username") String username, @Param("password") String password);
}