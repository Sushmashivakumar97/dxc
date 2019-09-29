package assignment_2;

import java.util.Scanner;

public class StoreProducts {
	
	private  int productId;
	 private  String productName;
	 private  int quantity;
	 private  int price;
	
	
	Scanner sc=new Scanner(System.in);
	
	public void getDetails()
	{
		
		
		System.out.println("enter proctId");
		productId=sc.nextInt();
		
		System.out.println("name");
		productName=sc.next();
		
		System.out.println("quantity");
		quantity=sc.nextInt();
		
		System.out.println("price");
		price=sc.nextInt();	
	}
	public void validate()
	{
		if(productId<0||quantity<0||price<0)
		{
			System.out.println("enter valid details");
			
			getDetails();
		}
	}
	
	public void display()
	{
		System.out.println("Id:"+productId+" Name: " +productName+ " quantity: " +quantity+ " price: "+price);
	}

	public static void main(String[] args) {
		StoreProducts product[]=new StoreProducts[5];
		for (int i = 0; i < product.length; i++) {
			product[i] = new StoreProducts();
		}
		
		
		System.out.println("enter details of product 1");
		product[0].getDetails();
		product[0].validate();
		
		System.out.println("enter details of product 2");
		product[1].getDetails();
		product[1].validate();
		
		System.out.println("enter details of product 3");
		product[2].getDetails();
		product[2].validate();
		
		System.out.println("enter details of product 4");
		product[3].getDetails();
		product[3].validate();
		
		System.out.println("enter details of product 5");
		product[4].getDetails();
		product[4].validate();
		
		product[0].display();
		product[1].display();
		product[2].display();
		product[3].display();
		product[4].display();
	}
}
