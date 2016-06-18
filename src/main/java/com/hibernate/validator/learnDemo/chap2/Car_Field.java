package com.hibernate.validator.learnDemo.chap2;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

public class Car_Field {
	
	@NotNull
	private String manufacturer;

	@AssertTrue
	private boolean isRegistered;

	public Car_Field(String manufacturer, boolean isRegistered) {
		super();
		this.manufacturer = manufacturer;
		this.isRegistered = isRegistered;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

}
