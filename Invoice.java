import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

//------------------------IMPLEMENT LOGIC to Invoice------------------------
public class Invoice implements Printable {
	private String partNum;
	private String partDescription;
	private int quantity;
	private double pricePerPart;

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerPart() {
		return pricePerPart;
	}

	public void setPricePerPart(double pricePerPart) {
		this.pricePerPart = pricePerPart;
	}

	public Invoice(String partNum, String partDescription, int quantity, double pricePerPart) {
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerPart = pricePerPart;
	}

	public double getPayment() {
		return quantity*pricePerPart;
	}


public class INVOICE {

}


public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
	// TODO Auto-generated method stub
	return 0;
}
}

