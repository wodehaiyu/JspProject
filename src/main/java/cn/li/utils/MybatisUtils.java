package cn.li.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	private MybatisUtils() {
	}

	private static SqlSessionFactory sqlSessionFactory;
	static {
		// InputStream inputStream =
		// ClassLoader.getSystemClassLoader().getResourceAsStream("mybatis_config.xml");
		// 类加载器可以加载类路径下的资源，本项目的类路径为：JspProject/WebRoot/WEB-INF/classes。
		// eclipse在打包时会将设置时source文件夹内容output到JspProject/WebRoot/WEB-INF/classes。
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis_config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 上面的这个Resource为mybatis封装的类，里面实际上就是类加载器加载的。
	}

	public static SqlSession openSqlSession() {
		return sqlSessionFactory.openSession();
	}
}
