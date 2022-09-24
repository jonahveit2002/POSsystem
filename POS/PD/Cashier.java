package PD;
import java.util.*;

public class Cashier {

	private String number;
	private String password;
	private Person person;
	private Collection<Session> session;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Collection<Session> getSession() {
		return this.session;
	}

	public void setSession(Collection<Session> session) {
		this.session = session;
	}

	public Cashier() {
		// TODO - implement Cashier.Cashier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 * @param person
	 * @param password
	 */
	public Cashier(String number, Person person, String password) {
		// TODO - implement Cashier.Cashier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param session
	 */
	public void addSession(Session session) {
		// TODO - implement Cashier.addSession
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param session
	 */
	public void removeSession(Session session) {
		// TODO - implement Cashier.removeSession
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param password
	 */
	public Boolean isAuthorized(String password) {
		// TODO - implement Cashier.isAuthorized
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Cashier.toString
		throw new UnsupportedOperationException();
	}

}