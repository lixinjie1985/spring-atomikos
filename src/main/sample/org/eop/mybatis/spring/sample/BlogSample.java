package org.eop.mybatis.spring.sample;

import org.eop.mybatis.spring.bean.Blog;
import org.eop.mybatis.spring.mapper.BlogMapper;

/**
 * @author lixinjie
 */
public class BlogSample {

	public static void main(String[] args) throws Exception {
		System.out.println(getBlogWithAuthorPosts());
	}
	
	public static Blog saveAuthor() throws Exception {
		Blog blog = new Blog(null);
		blog.setTitle("我的博客_2");
		blog.setAuthorId(33);
		int count = SqlHolder.getMapper(BlogMapper.class).saveBlog(blog);
		System.out.println(count);
		return blog;
	}
	
	public static Blog getBlogWithTags() throws Exception {
		Blog blog = SqlHolder.getMapper(BlogMapper.class).getBlogWithTags(1);
		return blog;
	}
	
	public static Blog getBlogWithAuthorPosts() throws Exception {
		Blog blog = SqlHolder.getMapper(BlogMapper.class).getBlogWithAuthorPosts(1);
		return blog;
	}
}
