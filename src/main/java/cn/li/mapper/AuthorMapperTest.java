package cn.li.mapper;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.li.bean.Author;
import cn.li.utils.MybatisUtils;

public class AuthorMapperTest {
	private Author author = new Author();
	private ObjectMapper mapper = new ObjectMapper();

	public AuthorMapperTest() {
		author.setUserNum("00000002");
		author.setUsername("接话发");
		author.setMobile("15699890029");
		author.setEmail("57893009477@qq.com");
		author.setAddress("中国山东烟台");
		author.setIdCard("155777733333883888");
		author.setBank("招商银行-烟台路支行");
		author.setBankCard("ZS-7773889927");
	}

	@Test
	public void testAuthorAdd() {

		SqlSession sqlSession = MybatisUtils.openSqlSession();
		int count = sqlSession.insert("authorRegister", author);
		System.out.println("插入了 " + count + " 条记录");
		sqlSession.commit();
		sqlSession.close();

	}

	@Test
	public void testAuthorUpdate() {
		SqlSession sqlSession = MybatisUtils.openSqlSession();
		int count = sqlSession.update("authorInfoAdd", author);
		System.out.println("更新了 " + count + " 条记录");
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void testSearchOneByUserNum() throws JsonGenerationException, JsonMappingException, IOException {

		SqlSession sqlSession = MybatisUtils.openSqlSession();
		Author authors = sqlSession.selectOne("searchOneByUserNum", "00000002");
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(authors));
		sqlSession.close();
	}

	@Test
	public void testSearchAll() throws JsonGenerationException, JsonMappingException, IOException {

		SqlSession sqlSession = MybatisUtils.openSqlSession();
		List<Author> authors = sqlSession.selectList("searchAll");
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(authors));
		sqlSession.close();
	}

}
