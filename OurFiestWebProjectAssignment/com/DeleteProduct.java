package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.pms.dao.ProductDAO;
import com.dxc.pms.dao.ProductDAOImpl;

/**
 * Servlet implementation class DeleteProduct
 */
public class DeleteProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("searchId"));
		
		//Product product=new Product();
		ProductDAO productDAO=new ProductDAOImpl();
		
		if (productDAO.isProductExists(id)) {
			productDAO.deleteProduct(id);
			response.getWriter().println("<span>product successfully deleted</span>");
		}
		else
		{
			response.getWriter().println("<span>product not deleted</span><br>");
		}
		response.getWriter().println("<a href='delete.html'>Delete again</a><br>");
		response.getWriter().println("<a href='Welcome'>Back</a>");
		
	}

}
