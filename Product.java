

package Question4;

import java.util.*;

public class Product
{
	private int ProductID;
	private String ProductName;
	private int ProductPrice;
	
	public Product(int productID, String productName, int productPrice) {
		ProductID = productID;
		ProductName = productName;
		ProductPrice = productPrice;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}
	

}