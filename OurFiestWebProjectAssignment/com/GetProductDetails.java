package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.pms.dao.ProductDAO;
import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.model.Product;

/**
 * Servlet implementation class GetProductDetails
 */
public class GetProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productId=Integer.parseInt(request.getParameter("searchId"));
		
		Product product=new Product();
		ProductDAO productDAO=new ProductDAOImpl();
		product=productDAO.getProduct(productId);
		if(product.getProductId()==0)
		{
			response.getWriter().println("<h1>product not available</h1>");
		}
		else
		response.getWriter().println(product);
		
		response.getWriter().println("</br><a href='getId.html'>Search Again</a>");
		response.getWriter().println("</br><a href='Welcome'>Back</a>");
		
		
		
	}

}
