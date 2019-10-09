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
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productId=Integer.parseInt(request.getParameter("productId"));
		String productName=request.getParameter("productName");
		int quantityOnHand=Integer.parseInt(request.getParameter("quantityOnHand"));
		int price=Integer.parseInt(request.getParameter("price"));
		
		response.getWriter().println("<h1>Product Id:"+productId+"</h1>");
		response.getWriter().println("<h1>Product Name:"+productName+"</h1>");
		response.getWriter().println("<h1>Quantity:"+quantityOnHand+"</h1>");
		response.getWriter().println("<h1>Price:"+price+"</h1>");
		response.getWriter().println("<a href='Welcome'>Back</a>");
		
		Product product=new Product(productId, productName, quantityOnHand, price);
		ProductDAO productDAO=new ProductDAOImpl();
		productDAO.addProduct(product);
		
		
	}

}
