package com.vehicles.project;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}
	
	public void addWheels(Wheel frontWheels, Wheel backWheels) throws InvalidBikeWheelsException{
		
		if(frontWheels.getDiameter()!=backWheels.getDiameter()) throw new InvalidBikeWheelsException();
		
		this.wheels.add(frontWheels);
		this.wheels.add(backWheels);
	}

	@Override
	public String toString() {
		return "Bike [plate=" + plate + ", brand=" + brand + ", color=" + color + ", wheels=" + wheels + "]";
	}

}
