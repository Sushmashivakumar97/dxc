package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	int counter=0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("userName");
	counter++;
	response.getWriter().println("<h1>Welcome to DXC,"+uname+ "</h1>");
	response.getWriter().println("<h1>you are user number: " +counter+ "</h1>");
	response.getWriter().println("<a href='tc.html'>Terms and Condition</a></br>");
	response.getWriter().println("<a href='productForm.html'>ADD Product</a></br>");
	response.getWriter().println("<a href='getId.html'>GET Product</a><br>");
	response.getWriter().println("<a href='ShowAll'>Show all</a><br>");
	response.getWriter().println("<a href='delete.html'>Delete Product</a><br>");
	response.getWriter().println("<a href='UpdateProduct.html'>Update Product</a>");	
	}

}
