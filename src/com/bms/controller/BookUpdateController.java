package com.bms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bms.bean.Book;
import com.bms.server.impl.BookServerImpl;
import com.utils.RequestUtil;

/**
 *  date : 2018年3月25日	
 * author: jiangjiamin
 */

@WebServlet("/BookUpdateController")
public class BookUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BookServerImpl bookServerImpl = new BookServerImpl(); 
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		Book book = (Book)RequestUtil.getParamsInjectObj(request, Book.class);
		//Integer bid =Integer.parseInt(request.getParameter("bid"));
		//book.setBid(bid);
		
		
		if(bookServerImpl.updateBook(book)) {
			response.sendRedirect("");
		}else {
			//携带错误信息，转发进入页面
			request.getRequestDispatcher("").forward(request, response);
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
