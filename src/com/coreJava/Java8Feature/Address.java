package com.coreJava.Java8Feature;

public class Address {

	// add fields for street, city, state, and zip code
	private String street;
	private String city;
	private String state;
	private String zipCode;

	public Address(String street, String city, String state, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		// compact, null-safe format: "123 Main St, Anytown, CA 12345"
		StringBuilder sb = new StringBuilder();
		if (street != null && !street.isEmpty()) {
			sb.append(street);
		}
		if (city != null && !city.isEmpty()) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(city);
		}
		if (state != null && !state.isEmpty()) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(state);
		}
		if (zipCode != null && !zipCode.isEmpty()) {
			// add space before zip if state was appended, otherwise add comma separation if
			// needed
			if (state != null && !state.isEmpty())
				sb.append(' ');
			else if (sb.length() > 0)
				sb.append(", ");
			sb.append(zipCode);
		}
		return sb.toString();
	}

}
