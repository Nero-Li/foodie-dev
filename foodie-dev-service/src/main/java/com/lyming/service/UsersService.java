package com.lyming.service;


import com.lyming.bo.UserBO;
import com.lyming.pojo.Users;

import java.util.List;

/**
 * 用户表 (Users)表服务接口
 *
 * @author lyming
 * @since 2020-09-11 14:52:03
 */
public interface UsersService {

    /**
     * 判断用户名是否已经存在
     * @param username
     * @return
     */
    boolean queryUsernameIsExist(String username);


    /**
     * 创建用户
     * @param userBO
     * @return
     */
    public Users createUser(UserBO userBO);

    /**
     * 检索用户名和密码是否匹配,用于登录
     * @param username
     * @param password
     * @return
     */
    public Users queryUsersForLogin(String username, String password);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Users queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Users> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Users insert(Users users);

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Users update(Users users);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}