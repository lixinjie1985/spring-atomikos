package org.eop.mybatis.spring.sample;

import java.util.ArrayList;
import java.util.List;

import org.eop.mybatis.spring.bean.Author;
import org.eop.mybatis.spring.mapper.AuthorMapper;

/**
 * @author lixinjie
 */
public class AuthorSample {

	public static void main(String[] args) throws Exception {
		System.out.println(removeAuthor());
	}
	
	public static Author saveAuthor() throws Exception {
		Author author = new Author();
		author.setUsername("李新杰");
		author.setPassword("123456");
		author.setEmail("lixinjie1985@126.com");
		author.setBio("bio");
		int count = SqlHolder.getMapper(AuthorMapper.class).saveAuthor(author);
		System.out.println(count);
		return author;
	}
	
	public static List<Author> saveAuthors() throws Exception {
		List<Author> authors = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			Author author = new Author();
			author.setUsername("李新杰_" + i);
			author.setPassword("123456");
			author.setEmail("lixinjie1985@126.com");
			author.setBio("bio");
			authors.add(author);
		}
		int count = SqlHolder.getMapper(AuthorMapper.class).saveAuthors(authors);
		System.out.println(count);
		return authors;
	}
	
	public static Author updateAuthor() throws Exception {
		Author author = new Author();
		author.setId(32);
		author.setUsername("李新杰");
		author.setBio("biobio");
		int count = SqlHolder.getMapper(AuthorMapper.class).updateAuthor(author);
		System.out.println(count);
		return author;
	}
	
	public static Author getAuthor() throws Exception {
		Author author = SqlHolder.getMapper(AuthorMapper.class).getAuthor(32);
		return author;
	}
	
	public static int removeAuthor() throws Exception {
		int count = SqlHolder.getMapper(AuthorMapper.class).removeAuthor(32);
		return count;
	}
}
