package cn.li.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leon.create.userinfo.CreateIdString;
import com.leon.create.userinfo.CreateUsernameTool;

@WebServlet("/getUserInfo")
public class GetUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetUserInfo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append("姓名: ").append(CreateUsernameTool.getUsername(false)).append("<br>");
		response.getWriter().append("性别: ").append("女").append("<br>");
		response.getWriter().append("生日号码: ").append(CreateIdString.getBirthday("/")).append("<br>");
		response.getWriter().append("手机号码: ").append(CreateIdString.getMobileNum(1)).append("<br>");
		response.getWriter().append("座机号码: ").append(CreateIdString.getTelNum("-")).append("<br>");
		response.getWriter().append("邮箱: ").append(CreateIdString.getEmail()).append("<br>");
		response.getWriter().append("会员号码: ").append(CreateIdString.getIdByTemplate("JD0000-AA0000000")).append("<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
