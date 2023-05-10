//package controller;
//
//import java.io.IOException;
//
//import javax.servlet.GenericServlet;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//
//import dao.DaoClass;
//import dto.DtoClass;
//
//public class CreateClass extends GenericServlet
//{
//
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		String name=req.getParameter("name");
//		String email=req.getParameter("email");
//		String phone=req.getParameter("phone");
//		
//		DtoClass dt= new DtoClass();
//		dt.setName(name);
//		dt.setEmail(email);
//		dt.setPhone(phone);
//		
//		new DaoClass().Create(dt);
//		
//	}
//
//}