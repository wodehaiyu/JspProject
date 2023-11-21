package cn.li.mapper;

import java.util.List;

import cn.li.bean.Author;

public interface AuthorMapper {
	public int authorAdd();

	public int authorUpdate();

	public int authorDelete();

	public Author searchOneByUserNum();

	public List<Author> searchAll();
}
