package assignment3EmbededId;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PassengerId implements Serializable {
	
		private String passengerEmail;
		private long passengerMobile;
		public PassengerId() {
			super();
			// TODO Auto-generated constructor stub
		}
		public PassengerId(String passengerEmail, long passengerMobile) {
			super();
			this.passengerEmail = passengerEmail;
			passengerMobile = passengerMobile;
		}
		public String getPassengerEmail() {
			return passengerEmail;
		}
		public void setPassengerEmail(String passengerEmail) {
			this.passengerEmail = passengerEmail;
		}
		public long getPassengerMobile() {
			return passengerMobile;
		}
		public void setPassengerMobile(long passengerMobile) {
			passengerMobile = passengerMobile;
		}
		@Override
		public String toString() {
			return "PassengerId [passengerEmail=" + passengerEmail + ", PassengerMobile=" + passengerMobile + "]";
		}
		
}
