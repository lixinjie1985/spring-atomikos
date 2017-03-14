package org.eop.mybatis.spring.sample;

import java.util.Date;

import org.eop.mybatis.spring.bean.Post;
import org.eop.mybatis.spring.mapper.PostMapper;

/**
 * @author lixinjie
 */
public class PostSample {

	public static void main(String[] args) throws Exception {
		System.out.println(savePost());
	}
	
	public static Post savePost() throws Exception {
		Post post = new Post();
		post.setSection("section");
		post.setSubject("我的主题_4");
		post.setBody("我的内容");
		post.setCreatedOn(new Date());
		post.setBlogId(1);
		post.setAuthorId(33);
		int count = SqlHolder.getMapper(PostMapper.class).savePost(post);
		System.out.println(count);
		return post;
	}
	
	
}
