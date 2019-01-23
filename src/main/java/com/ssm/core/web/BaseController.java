/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.ssm.core.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 控制器支持类
 */
public abstract class BaseController {

	/**
	 * 日志对象
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 管理基础路径
	 */
	@Value("${adminPath}")
	protected String adminPath;
	
	/**
	 * 前端基础路径
	 */
	@Value("${frontPath}")
	protected String frontPath;
	
	/**
	 * 前端URL后缀
	 */
	@Value("${urlSuffix}")
	protected String urlSuffix;

	/**
	 * 支付完成证书平台回调路径
	 */
	@Value("${cert.notity.url}")
	protected String certNotityUrl;
	
	/**
	 * 添加Model消息
	 */
	protected void addMessage(Model model, String... messages) {
		StringBuilder sb = new StringBuilder();
		for (String message : messages){
			sb.append(message).append(messages.length>1?"<br/>":"");
		}
		model.addAttribute("message", sb.toString());
	}
	
	/**
	 * 添加Flash消息
	 */
	protected void addMessage(RedirectAttributes redirectAttributes, String... messages) {
		StringBuilder sb = new StringBuilder();
		for (String message : messages){
			sb.append(message).append(messages.length>1?"<br/>":"");
		}
		redirectAttributes.addFlashAttribute("message", sb.toString());
	}

	/**
	 * 参数绑定异常
	 */
	@ExceptionHandler(BindException.class)
    public String bindException() {  
        return "error/400";
    }
	

	
	/**
	 *系统登录异常
	 */
	@ExceptionHandler({Exception.class})
    public String exception() {  
        return "error/500";
    }
	

	
	
}
