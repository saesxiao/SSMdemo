package com.ssm.modules.front.mapper;

import com.ssm.modules.front.entity.Emp;

import java.util.List;


public interface EmpMapper {

    Emp getById(int id);

    List<Emp> findList(Emp emp);

    int insert(Emp emp);

    int update(Emp emp);

    int delete(int id);


}
