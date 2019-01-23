package com.ssm.modules.front.web;

import com.ssm.core.web.BaseController;
import com.ssm.modules.front.entity.Emp;
import com.ssm.modules.front.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "{frontPath}")
public class EmpController extends BaseController{

    private static final String PATH = "modules/front/";
    @Autowired
    private EmpService empService;


    @RequestMapping({"","/list"})
    public String toListPage(Model model){
        List<Emp>  list = empService.findList(new Emp());
        model.addAttribute("empList",list);
        return PATH+"list";
    }

}
