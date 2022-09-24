package PD;
import java.util.*;

public class Store {

	private String number;
	private String name;
	private TreeMap<String,Cashier> cashiers = new TreeMap<String, Cashier>();
	
	private TreeMap<String, Session> sessions = new TreeMap<String, Session>();
	
	private TreeMap<String, Register> registers = new TreeMap<String, Register>();
	
	private TreeMap<String, TaxCategory> taxCategories = new TreeMap<String, TaxCategory>();
	
 	private TreeMap<String, UPC> upcs = new TreeMap<String, UPC>();
	
 	private TreeMap<String, Item> items = new TreeMap<String, Item>();
 	

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cashier getCashiers(String cashier) {
		return this.cashiers.get(cashier);
	}

	public void setCashiers(Cashier cashier, String key) {
		
		this.cashiers = cashiers;
	}

	public Collection<Session> getSessions() {
		return this.sessions;
	}

	public void setSessions(Collection<Session> sessions) {
		this.sessions = sessions;
	}

	public Collection<Register> getRegisters() {
		return this.registers;
	}

	public void setRegisters(Collection<Register> registers) {
		this.registers = registers;
	}

	public Collection<TaxCategory> getTaxCategories() {
		return this.taxCategories;
	}

	public void setTaxCategories(Collection<TaxCategory> taxCategories) {
		this.taxCategories = taxCategories;
	}

	public Collection<UPC> getUpcs() {
		return this.upcs;
	}

	public void setUpcs(Collection<UPC> upcs) {
		this.upcs = upcs;
	}

	public Collection<Item> getItems() {
		return this.items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}

	public Store() {
		// TODO - implement Store.Store
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 * @param name
	 */
	public Store(String number, String name) {
		// TODO - implement Store.Store
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param item
	 */
	public void additem(Item item) {
		// TODO - implement Store.additem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param item
	 */
	public void removeItem(Item item) {
		// TODO - implement Store.removeItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param upc
	 */
	public void addUPC(UPC upc) {
		// TODO - implement Store.addUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param upc
	 */
	public void removeUPC(UPC upc) {
		// TODO - implement Store.removeUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param register
	 */
	public void addRegister(Register register) {
		// TODO - implement Store.addRegister
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param register
	 */
	public void removeRegister(Register register) {
		// TODO - implement Store.removeRegister
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taxCategory
	 */
	public void addTaxCategory(TaxCategory taxCategory) {
		// TODO - implement Store.addTaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taxCategory
	 */
	public void removeTaxCategory(TaxCategory taxCategory) {
		// TODO - implement Store.removeTaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param session
	 */
	public void addSessions(Session session) {
		// TODO - implement Store.addSessions
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param session
	 */
	public void removeSession(Session session) {
		// TODO - implement Store.removeSession
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 */
	public Register findRegisterByNumber(String number) {
		// TODO - implement Store.findRegisterByNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param upc
	 */
	public Item findItemForUPC(String upc) {
		// TODO - implement Store.findItemForUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 */
	public Item findItemForNumber(String number) {
		// TODO - implement Store.findItemForNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 */
	public Cashier findCashierForNumber(String number) {
		// TODO - implement Store.findCashierForNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param category
	 */
	public TaxCategory findTaxCategoryByName(String category) {
		// TODO - implement Store.findTaxCategoryByName
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Store.toString
		throw new UnsupportedOperationException();
	}
	
	
}