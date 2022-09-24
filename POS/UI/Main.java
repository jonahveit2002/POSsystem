package UI;
import PD.*;

public class Main {

	public static void main(String args[]) {
		Store testStore = new Store();

		
		
		Cashier cashierOne = new Cashier();
		Person personOne = new Person("Jonah Veit", "3115 Kingston Drive","Bartlesville","OK", "74006", "(918) 397-1961", "11-111-11", cashierOne);
	
		
		Register registerOne = new Register();
		TaxCategory taxCategory = new TaxCategory();
		
		UPC upc = new UPC();
		Item item= new Item();
	}
	
}
