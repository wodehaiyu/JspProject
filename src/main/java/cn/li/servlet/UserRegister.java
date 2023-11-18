package cn.li.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.li.bean.Student;
import cn.li.service.IStudentCheckService;
import cn.li.service.StudentCheckServiceImpl;

/**
 * Servlet implementation class UserRegister
 */
@WebServlet("/userRegister")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String studentNum = request.getParameter("studentnum");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		IStudentCheckService stuCheckService = new StudentCheckServiceImpl();
		
		Student student = stuCheckService.checkStudentByNum(studentNum);
		if(student == null) {
			System.out.println(studentNum+" "+username+" "+password);
		}
		
	}

}
