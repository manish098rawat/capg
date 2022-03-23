
package assignment3;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("asgn3PU");
		EntityManager entitymanager = emf.createEntityManager();
		
		PassengerId pid = new PassengerId();
		pid.setPassengerEmail("qwerty@asd.com");
		pid.setPassengerMobile(1234567l);
		
		Passenger pass = new Passenger();
		pass.setPassengerEmail(pid.getPassengerEmail());
		pass.setPassengerMobile(pid.getPassengerMobile());
		pass.setPassengerName("Manish Rawat");
		pass.setSource("dehradun");
		pass.setDestination("haridwar");
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(pass);
		entitymanager.flush();
		entitymanager.getTransaction().commit();
		
		
		
	}
}