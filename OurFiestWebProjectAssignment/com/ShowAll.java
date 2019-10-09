package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.pms.dao.ProductDAO;
import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.model.Product;

/**
 * Servlet implementation class ShowAll
 */
public class ShowAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ProductDAO productDAO=new ProductDAOImpl();
		List<Product> allProduct;
		allProduct=productDAO.getAllProduct();
		
		response.getWriter().println("<table cellpadding=\"14\" cellspacing=\"14\" align=\"center\">");
		response.getWriter().println("<td>Product Id</td>");
		response.getWriter().println("<td>Product Name</td>");
		response.getWriter().println("<td>Quantity</td>");
		response.getWriter().println("<td>Price</td>");
		for(Product  p:allProduct)
			{
				
				response.getWriter().println("<tr>");
				
				response.getWriter().println("<td>"+p.getProductId()+"</td>");
				response.getWriter().println("<td>"+p.getProductName()+"</td>");
				response.getWriter().println("<td>"+p.getQuantityOnHand()+"</td>");
				response.getWriter().println("<td>"+p.getPrice()+"</td>");
				response.getWriter().println("</tr>");
			}
		response.getWriter().println("</table>");
		
		response.getWriter().println("<a href='Welcome'>Back</a>");
		
        }
	}


