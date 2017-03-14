package org.eop.mybatis.spring.mapper;

import org.eop.mybatis.spring.bean.Blog;

/**
 * @author lixinjie
 */
public interface BlogMapper {

	public int saveBlog(Blog blog);
	
	public Blog getBlogWithTags(Integer id);
	
	public Blog getBlogWithAuthorPosts(Integer id);
}
