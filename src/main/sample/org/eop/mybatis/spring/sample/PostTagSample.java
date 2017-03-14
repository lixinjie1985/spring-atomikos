package org.eop.mybatis.spring.sample;

import org.eop.mybatis.spring.bean.PostTag;
import org.eop.mybatis.spring.mapper.PostTagMapper;

/**
 * @author lixinjie
 */
public class PostTagSample {

	public static void main(String[] args) throws Exception {
		System.out.println(savePostTag());
	}
	
	public static PostTag savePostTag() throws Exception {
		PostTag posttag = new PostTag();
		posttag.setPostId(1);
		posttag.setTagId(3);
		int count = SqlHolder.getMapper(PostTagMapper.class).savePostTag(posttag);
		System.out.println(count);
		return posttag;
	}
	
	
}
