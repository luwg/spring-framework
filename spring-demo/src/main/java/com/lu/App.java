package com.lu;

import com.lu.biz.ILogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
		String XMLPath = "//Users/luweigang/gitfile/spring-framework/spring-demo/src/main/resources/spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(XMLPath);
		ILogin login = (ILogin) applicationContext.getBean("loginService");
		login.loginCheck("weigang.lu", "123");
    }
}
