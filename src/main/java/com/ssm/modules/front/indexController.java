package com.ssm.modules.front;


import com.ssm.core.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController extends BaseController{
    @RequestMapping("/")
    public String toIndex(){
        return "modules/front/login";
    }
}
