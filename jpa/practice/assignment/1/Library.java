package assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("asgn1PU");
		EntityManager entitymanager = emf.createEntityManager();
		
		Person person = new Person();
		person.setPersonName("Manish Rawat");
		person.setPersonEmail("asdfsf@agsa.com");
		person.setPersonPhone(1234356);
		
		//ticket
		Ticket ticket = new Ticket("delhi","dehradun",113.0f,"15march");
		
		//student
		Student stu = new Student("manish",90,3);
		
		//Employee 
		Employee emp = new Employee("manish","IT","SE3");
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(person);
		entitymanager.persist(ticket);
		entitymanager.persist(stu);
		entitymanager.persist(emp);
		entitymanager.flush();
		entitymanager.getTransaction().commit();
		
	}
}