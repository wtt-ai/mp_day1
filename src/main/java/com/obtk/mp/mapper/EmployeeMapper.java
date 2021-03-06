package com.obtk.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.obtk.mp.po.Employee;

/**
 *  基于MyBatis：在Mapper接口中编写CRUD相关的方法 提供Mapper接口所对应的SQL映射文件 以及方法对应的SQL语句
 *
 *  基于MP： 让xxxMapper接口继承BaseMapper接口即可
 *           BaseMapper<T> 泛型指定的就是当前Mapper接口所操作的实体类类型
 */
public interface EmployeeMapper extends BaseMapper<Employee> {
}
