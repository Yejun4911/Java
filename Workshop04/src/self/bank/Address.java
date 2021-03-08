package self.bank;

public class Address {
	private int zipCode;
	private String region;
	private String city;
	
	public Address(int zipCode, String region, String city) {
		this.zipCode=zipCode;
		this.region=region;
		this.city=city;
	}

	public String getAddressInfo() {
		return zipCode+","+region+","+city;
	}
	
}
