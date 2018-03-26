package com.bms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bms.bean.Book;
import com.bms.server.impl.BookServerImpl;

/**
 *  date : 2018��3��25��	
 * author: jiangjiamin
 */
@WebServlet("/BookSearchUpateInfoController")
public class BookSearchUpateInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BookServerImpl bookServerImpl = new BookServerImpl();   
   
    public BookSearchUpateInfoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//��ȡͼ���
		Integer bid = Integer.parseInt(request.getParameter("bid"));
		Book book = bookServerImpl.getBookById(bid);
		request.setAttribute("book", book);
		
		request.getRequestDispatcher("/book/updateBookInfo.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}