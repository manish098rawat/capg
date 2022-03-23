package assignment3EmbededId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
public class Passenger {
	
	@EmbeddedId
	private PassengerId passangerId;
	
	private String passengerName;
	private String Source;
	private String destination;
	public Passenger() {}
	
	public Passenger(PassengerId passangerId, String passengerName, String source, String destination) {
		super();
		this.passangerId = passangerId;
		this.passengerName = passengerName;
		Source = source;
		this.destination = destination;
	}

	public PassengerId getPassangerId() {
		return passangerId;
	}

	public void setPassangerId(PassengerId passangerId) {
		this.passangerId = passangerId;
	}

	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Passenger [passangerId=" + passangerId + ", passengerName=" + passengerName + ", Source=" + Source
				+ ", destination=" + destination + "]";
	}
}