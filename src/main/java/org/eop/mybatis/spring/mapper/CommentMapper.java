package org.eop.mybatis.spring.mapper;

import org.eop.mybatis.spring.bean.Comment;

/**
 * @author lixinjie
 */
public interface CommentMapper {

	public int saveComment(Comment comment);
}
