package com.lu.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author weigang.lu
 * @project spring-framework
 * @package com.lu.biz
 * @date 18/12/12
 */
@Component
public class LoginImpl implements ILogin{
	String id = "";

	@Autowired(required = false)
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String loginCheck(String userName, String password) {
		System.out.println(String.format("[%s]登录...密码:[%s]",userName,password));
		return "success";
	}

}
