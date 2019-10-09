package com.dxc.pms.dao;//new>class>add>ProductDAO>className>ProductDAOImpl 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dxc.pms.dbcon.DBConnection;
import com.dxc.pms.model.Product;

public class ProductDAOImpl implements ProductDAO {
	
	
	
	private static final String FETCH_PRODUCT_ALL="select* from product";
    Connection connection=DBConnection.getConnection();

	public ProductDAOImpl() {
		
	}
	
//##########################################################################	

public void addProduct(Product product) {
		
		try {
			PreparedStatement preparedStatement;
			
			preparedStatement=connection.prepareStatement("insert into product value(?,?,?,?)");
			preparedStatement.setInt(1, product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setInt(3, product.getQuantityOnHand());
			preparedStatement.setInt(4, product.getPrice());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	
//###########################################################################
	@Override
	public List<Product> getAllProduct() 
	{
		
		List<Product> allProduct=new ArrayList<Product>();
		
		try {
			Statement stat=connection.createStatement();
			ResultSet res=stat.executeQuery(FETCH_PRODUCT_ALL);
			
			while(res.next())
			{
				Product product=new Product();
				product.setProductId(res.getInt(1));
				product.setProductName(res.getString(2));
				product.setQuantityOnHand(res.getInt(3));
				product.setPrice(res.getInt(4));
				allProduct.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allProduct;
	}
//####################################################################################################3

	@Override
	public Product getProduct(int productId) {
		
		Product product =new Product(); 
		
		try {
			PreparedStatement stat=connection.prepareStatement("select* from product where productId=?");
			stat.setInt(1,productId);
			ResultSet res=stat.executeQuery();
			res.next();
			
			
			product.setProductId(res.getInt(1));
			product.setProductName(res.getString(2));
			product.setQuantityOnHand(res.getInt(3));
			product.setPrice(res.getInt(4));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return product;
	}
//###########################################################################################33
	

	@Override
	public void deleteProduct(int productId) {
//Product product =new Product(); 
		
		try {
			PreparedStatement stat=connection.prepareStatement("delete from product where productId=?");
			stat.setInt(1,productId);
			stat.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//##########################################################################################3

	@Override
	public void updateProduct(Product product) {
		
		try {
			PreparedStatement stat=connection.prepareStatement("update product set productName=?,quantityOnHand=?,price=? where productId=?");
			stat.setInt(4, product.getProductId());
			stat.setString(1, product.getProductName());
			stat.setInt(2,product.getQuantityOnHand());
			stat.setInt(3, product.getPrice());
			stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

//###########################################################################################
	@Override
	public boolean isProductExists(int productId) {
		boolean productExists=false;
		PreparedStatement preparedStatement;
		
		try {
			preparedStatement=connection.prepareStatement("select* from product where productId=?" );
			preparedStatement.setInt(1, productId);
			ResultSet res=preparedStatement.executeQuery();
			if(res.next())
			{
				productExists=true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return productExists;
	}
}
