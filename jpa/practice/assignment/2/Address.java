package assignment2;

public class Address {
	private String customerAddress;
	public Address() {}
	public Address(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return customerAddress;
	}
	

}