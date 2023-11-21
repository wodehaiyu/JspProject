package cn.li.mybatisTest;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.li.bean.Author;
import cn.li.utils.MybatisUtils;

public class MyBatisIntoductionTest {

	@Test
	public void test(String[] args) {

		SqlSession sqlSession = MybatisUtils.openSqlSession();

		Author author = new Author();
		author.setUserNum("00000002");
		author.setUsername("接话发");
		author.setMobile("15699890029");
		author.setEmail("57893009477@qq.com");

		int count = sqlSession.insert("authorRegister", author);

//		int count = sqlSession.update("authorInfoAdd");
//		System.out.println("更新了 "+count+" 条记录");
		System.out.println("插入了 " + count + " 条记录");
		sqlSession.commit();
		sqlSession.close();

	}

}
