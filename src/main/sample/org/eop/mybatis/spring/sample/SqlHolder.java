package org.eop.mybatis.spring.sample;

import org.eop.mybatis.spring.mapper.BlogMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lixinjie
 */
public class SqlHolder {

	public static <T> T getMapper(Class<T> cls) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		return ac.getBean(cls);
	}
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(ac.getBean(BlogMapper.class).getBlogWithTags(1));
	}
}
