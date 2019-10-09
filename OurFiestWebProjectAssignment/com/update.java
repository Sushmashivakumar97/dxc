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
 * Servlet implementation class update
 */
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
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
		Product product = new Product(productId, productName, quantityOnHand, price);
		
		//Product product=new Product();
		ProductDAO productDAO=new ProductDAOImpl();
		//productDAO.updateProduct( product);
		
		if (productDAO.isProductExists(product.getProductId())) {
			
			productDAO.updateProduct(product);
			response.getWriter().println("<span>your product updated successfully</span></br>");
		}
		
		response.getWriter().println("<a href='Welcome'>BACK</a>");
		
		
		
	}

}
