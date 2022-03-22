/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package assignment2;

import javax.persistence.*;
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("asgn2PU");
		EntityManager entitymanager = emf.createEntityManager();
		
		Address address = new Address();
		address.setCustomerAddress("dehradun");
		
		
		Customer c = new Customer();
	    c.setCustomerName("Manish");
	    c.setCustomerEmail("qwerty@gmail.com");
	    c.setCustomerAddress(address);
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(c);
		entitymanager.flush();
		entitymanager.getTransaction().commit();
		
		Customer mycustomer = entitymanager.find(Customer.class, "Manish");
		System.out.println(mycustomer.getCustomerName());
		System.out.println(mycustomer.getCustomerEmail());
		System.out.println(mycustomer.getCustomerAddress());
		
		
		
	}
}
