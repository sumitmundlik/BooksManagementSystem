package com.bms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bms.server.IRecordServer;
import com.bms.server.impl.RecordServerImpl;

/**
 *  date : 2018年3月29日	
 * author: jiangjiamin
 * 
 */
@WebServlet("/BorrowBookListController")
public class BorrowBookListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BorrowBookListController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer uid = (Integer)request.getSession().getAttribute("uid");
		IRecordServer recordServer = new RecordServerImpl();
		List<Object[]> recordlist =  recordServer.getRecordByUserId(uid);
		
		request.setAttribute("recordlist", recordlist);
		request.getRequestDispatcher("user/showBorrowList.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
