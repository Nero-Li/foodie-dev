package com.lyming.controller;

import com.lyming.pojo.Stu;
import com.lyming.service.StuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;

/**
 * (Stu)表控制层
 *
 * @author lyming
 * @since 2020-09-10 23:27:08
 */
@RestController
@RequestMapping("stu")
@ApiIgnore
public class StuController {
    /**
     * 服务对象
     */
    @Resource
    private StuService stuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Stu selectOne(Integer id) {
        return this.stuService.queryById(id);
    }

}