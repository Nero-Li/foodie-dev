package com.lyming.pojo;

import java.io.Serializable;

/**
 * (Stu)实体类
 *
 * @author lyming
 * @since 2020-09-10 17:27:16
 */
public class Stu implements Serializable {
    private static final long serialVersionUID = 955123904506307887L;

    private Integer id;

    private String name;

    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}