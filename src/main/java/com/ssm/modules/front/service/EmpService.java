package com.ssm.modules.front.service;

import com.ssm.modules.front.entity.Emp;
import com.ssm.modules.front.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpMapper empMapper;

    public Emp getById(int id){
        return empMapper.getById(id);
    }

    public List<Emp> findList(Emp emp){
        return empMapper.findList(emp);
    }

    public void saveEmp(Emp emp){
        empMapper.insert(emp);
    }

    public void deleteEmp(int id){
        empMapper.delete(id);
    }

    public void updateEmp(Emp emp){
        empMapper.update(emp);
    }



}
