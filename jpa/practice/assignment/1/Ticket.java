package assignment1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {

	@Id
	private String source;
	private String destination;
	private float price;
	private String date;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(String source, String destination, float price, String date) {
		super();
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.date = date;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Ticket [source=" + source + ", destination=" + destination + ", price=" + price + ", date=" + date
				+ "]";
	}
	
}
