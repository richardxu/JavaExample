// Java Interface inheritance example 
// Interface extends another interface

interface Device {
	void switchOn();
}

//Heating device id Device (can be switched ON),
//but also has more specific attribute - max Temperature
interface HeatingDevice extends Device {
	void showMaxTemperature();
}

class TV implements Device {
	String model;
	
	public TV(String model){
		this.model = model;
	}
	
	public void switchOn() {
		System.out.println("TV " + model + " switched ON!");
	}
}

class Radio implements Device {
	String model;
	
	public Radio(String model){
		this.model = model;
	}
	
	public void switchOn() {
		System.out.println("Radio " + model + " switched ON!");
	}
}

class Heater implements HeatingDevice {
	String model;
	int maxTemperature;
	
	public Heater(String model, int maxTemperature) {
		this.model = model;
		this.maxTemperature = maxTemperature;
	}
	
	public void showMaxTemperature() {
		System.out.println("Max Temperature for heater " + model + " is " +  maxTemperature );
	}
	
	public void switchOn() {
		System.out.println("Heater " + model + " switch ON!");
	}
}

class Microwave implements HeatingDevice {
	String model;
	int maxTemperature;
	
	public Microwave(String model, int maxTemperature) {
		this.model = model;
		this.maxTemperature = maxTemperature;
	}
	
	public void showMaxTemperature() {
		System.out.println("Max Temperature for Microwave " + model + " is " +  maxTemperature );
	}
	
	public void switchOn() {
		System.out.println("Microwave " + model + " switch ON!");
	}
	
//	public void showParent
	
}

public class InterfaceInheritanceExample {
	
	public static void main(String[] args){
		Device tv1 = new TV("T-1");
		Device radio1 = new Radio("R-1");
		HeatingDevice heater1 = new Heater("H-1", 38);
		HeatingDevice microwave1 = new Microwave("M-1", 80);
		
		tv1.switchOn();
		radio1.switchOn();
		heater1.switchOn();
		heater1.showMaxTemperature();
		microwave1.switchOn();
		microwave1.showMaxTemperature();
	}
	
}
