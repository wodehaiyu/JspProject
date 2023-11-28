package cn.li.myfluter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingToUTF8 implements Filter {

	private String encoding;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// 从web.xml配置文件中读取字符编码配置
		encoding = filterConfig.getInitParameter("encoding");
		if (encoding == null) {
			encoding = "UTF-8"; // 默认编码为UTF-8
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 设置请求和响应的字符编码
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);

		// 继续处理请求
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// 在过滤器销毁时执行的清理操作
	}
}
