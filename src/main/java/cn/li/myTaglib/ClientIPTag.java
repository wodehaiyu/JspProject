package cn.li.myTaglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ClientIPTag extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		PageContext ps =(PageContext)this.getJspContext();
		String clientIPString = ps.getRequest().getRemoteAddr();
		ps.getOut().write(clientIPString);
	}
}
