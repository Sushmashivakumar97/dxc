package assignment_2;



import java.util.Scanner;

public class Store_products_i {
	
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
		Store_Products product[]=new Store_Products[5];
		for (int i = 0; i < product.length; i++) {
			product[i] = new Store_Products();
		}
		
		for(int i=0;i<5;i++)
		{
		System.out.println("enter details of product "+(i+1) );
		product[i].getDetails();
		product[i].validate();
		}
		
		
		for(int i=0;i<5;i++)
		{
		product[i].display();
		}
	}
}

