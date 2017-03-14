package org.eop.mybatis.spring.sample;

import org.eop.mybatis.spring.bean.Comment;
import org.eop.mybatis.spring.mapper.CommentMapper;

/**
 * @author lixinjie
 */
public class CommentSample {

	public static void main(String[] args) throws Exception {
		System.out.println(saveComment());
	}
	
	public static Comment saveComment() throws Exception {
		Comment comment = new Comment();
		comment.setName("我的评论_5");
		comment.setComment("评论内容");
		comment.setPostId(1);
		int count = SqlHolder.getMapper(CommentMapper.class).saveComment(comment);
		System.out.println(count);
		return comment;
	}
	
	
}
