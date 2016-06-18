package com.hibernate.validator.learnDemo.chap2;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

public class Car_Method {
	
	private String manufacturer;

    private boolean isRegistered;
      
    public Car_Method(String manufacturer, boolean isRegistered) {
        super();
        this.manufacturer = manufacturer;
        this.isRegistered = isRegistered;
    }

    @NotNull
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @AssertTrue
    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

}
