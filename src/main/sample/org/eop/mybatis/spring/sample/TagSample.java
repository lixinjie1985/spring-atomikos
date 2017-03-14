package org.eop.mybatis.spring.sample;

import org.eop.mybatis.spring.bean.Tag;
import org.eop.mybatis.spring.mapper.TagMapper;

/**
 * @author lixinjie
 */
public class TagSample {

	public static void main(String[] args) throws Exception {
		System.out.println(saveTag());
	}
	
	public static Tag saveTag() throws Exception {
		Tag tag = new Tag();
		tag.setName("容错性");
		tag.setBlogId(1);
		int count = SqlHolder.getMapper(TagMapper.class).saveTag(tag);
		System.out.println(count);
		return tag;
	}
	
	
}
