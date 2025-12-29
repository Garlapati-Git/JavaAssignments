package assignment4;

import java.util.HashMap;
import java.util.Map;

public class ProductDetails 
{
	public static void main(String[] args) 
	{
		Map<String, Map<String, String>> Products = new HashMap<>();
		
		Map<String, String> PD1 = new HashMap<>();
        PD1.put("ProductID", "P001");
        PD1.put("Product", "Laptop");
        PD1.put("Category", "Electronics");
        PD1.put("Price", "12000");
        PD1.put("StockQuality", "Not Available");
        PD1.put("Supplier", "Tech Supplies");
        PD1.put("Warranty", "2 Years");
        PD1.put("ExpiryDate", "Aug 2028");
        PD1.put("Rating", "4.5");
        PD1.put("ManufactureDate", "Aug 2023");
        
        Products.put("Product1", PD1);
        
	
        Map<String, String> PD2 = new HashMap<>();
        PD2.put("ProductID", "P002");
        PD2.put("Product", "Desk Chair");
        PD2.put("Category", "Furniture");
        PD2.put("Price", "150000");
        PD2.put("StockQuality", "Two");
        PD2.put("Supplier", "Office Depot");
        PD2.put("Warranty", "1 Year");
        PD2.put("ExpiryDate", "N/A");
        PD2.put("Rating", "4");
        PD2.put("ManufactureDate", "Sep 2024");
        
        Products.put("Product2", PD2);
        
        
        Map<String, String> PD3 = new HashMap<>();
        PD3.put("ProductID", "P003");
        PD3.put("Product", "Coffee Maker");
        PD3.put("Category", "Kitchen");
        PD3.put("Price", "75000");
        PD3.put("StockQuality", "Two Hundred");
        PD3.put("Supplier", "Kitchen World");
        PD3.put("Warranty", "6 Months");
        PD3.put("ExpiryDate", "Jan 2027");
        PD3.put("Rating", "4.2");
        PD3.put("ManufactureDate", "Jan 2025");
        
        Products.put("Product3", PD3);
        
        
        System.out.println("Product2 Supplier: "+ Products.get("Product2").get("Supplier"));
        
        
/*	String[] ProductID = {"P001", "P002", "P003"};
	String[] Product = {"Laptop", "Desk Chair", "Coffee Maker"};
	String[] Category = {"Electronics", "Furniture", "Kitchen"};
	int[] Price = {12000, 150000, 75000};
	String[] StockQuality = {"Not Available", "Two", "Two Hundred"};
	String[] Supplier = {"Tech Supplies", "Office Depot", "Kitchen World"};
	String[] Warranty = {"2 Years", "1 year", "6 Months"};
	String[] ExpiryDate = {"Aug 2028", "N/A", "Jan 2027"};
	double[] rating = {4.5, 4, 4.2};
	String[] ManufactureDate = {"Aug 2023", "Sep 2024", "Jan 2025"};		*/
	}
}
