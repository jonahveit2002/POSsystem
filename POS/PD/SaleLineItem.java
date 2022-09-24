package PD;
import java.math.BigDecimal;

public class SaleLineItem {

	private Sale sales;
	private int quantity;
	private Item item;

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public SaleLineItem() {
		// TODO - implement SaleLineItem.SaleLineItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sale
	 * @param item
	 * @param quantity
	 */
	public SaleLineItem(Sale sale, Item item, String quantity) {
		// TODO - implement SaleLineItem.SaleLineItem
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcSubTotal() {
		// TODO - implement SaleLineItem.calcSubTotal
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcTax() {
		// TODO - implement SaleLineItem.calcTax
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement SaleLineItem.toString
		throw new UnsupportedOperationException();
	}

}