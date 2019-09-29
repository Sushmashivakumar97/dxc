package assignment_2;

import java.util.Scanner;

public class Search_product {

	static Scanner sc=new Scanner(System.in);
	private  int productId;
	private String productName;
	private int qOH;
	private int price;
	
	public static int f; 
	 
	 
	
	
	public Search_product(int Id, String Name, int qH, int prce) 
	{
		
		this.productId = Id;
		this.productName =Name;
		this.qOH = qH;
		this.price = prce;
	}


	public int getPrdctId() {
		return productId;
	}

	public String toString() {
		return "Product [prdctId=" + productId + ", prdctName=" + productName + ", qOH=" + qOH + ", price=" + price + "]";
	}





	public static void main(String[] args) 
	{
		
		Search_product product[]=new Search_product[5];
		
			product[0] = new Search_product(1, "lakme",1, 1);
			product[1] = new Search_product(2, "ponds",1, 1);
			product[2] = new Search_product(3, "whitebeauty",1, 1);
			product[3] = new Search_product(4, "lorial",1, 1);
			product[4] = new Search_product(5, "spinz",1, 1);
		
			System.out.println("enter id");
			 f=sc.nextInt();
			
			 char c = 0;
			 for(int i=0;i<5;i++)
			{
			
				if(f==product[i].getPrdctId())
				{
					System.out.println(product[i]);
					i++;
					c='s';
					
				}
				
			}	
					
			if(c!='s')
			{
				System.out.println("product not available");
			}
			
			
			 
			 
				 
		 }
		
	
}
