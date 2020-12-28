package com.obtk.mp.po;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 *  员工实体类
 *
 * @author 小麦爱吃草莓
 * @date 2020-12-25 16:46:14
 */
public class Employee {
    // 如果对象id的属性名和表中id字段名不对应,会报 reflectionException
    //
    @TableId
    private Integer id;
    private String e_name;
    private String e_gender;
    private Integer e_age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_gender() {
        return e_gender;
    }

    public void setE_gender(String e_gender) {
        this.e_gender = e_gender;
    }

    public Integer getE_age() {
        return e_age;
    }

    public void setE_age(Integer e_age) {
        this.e_age = e_age;
    }
}
