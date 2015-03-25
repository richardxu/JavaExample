//  Java abstract class example
//  Abstract class represents skeleton of the classes
//  which will extend this abstract class


//      Vehicle abstract class is a general class of all vehicles
//      It contains methods and attributes common to all vehicles
//      but you can't create an instance of the Vehicle class
//      Vehicle class is used as a basic structure for all specific vehicles (car,bus...)    
//    

abstract class Vehicle {
	//subclasses will inhent an attribute
	int maxSpeed;
	
	//subclass must implement this method 
	//(otherwire they have to be declared as abstract classes)
	abstract void showMaxSpeed();
	
//	private void VehicleName(){
		
	public void VehicleName(){
		System.out.print("======CarName: China =======\n");
	}
	
	//subclass will have this method (through inheritance) as is (default implementation)
	//or they may implement their own implementation (override a method)
	int getWheelsNumber() {
		return 4;
	}
}


// Car IS-A Vehicle 
class Car extends Vehicle {
	public Car() {
		maxSpeed = 180;
	}
	
//	private void CarName(){
//		System.out.print("======CarName: China =======");
//	}
	
	public void showMaxSpeed() {
		System.out.println("Car max speed: " + maxSpeed + "km/h");
	}
	
	//Car class will inherit getWheelsNumber() method from the parent class
    //there is no need to override this method because default implementation
    //is appropriate for Car class - 4 wheels
}


// Bus IS-A Vehicle 
class Bus extends Vehicle {
	public Bus(){
		maxSpeed = 100;
	}
	
//	public void showMaxSpeed() {
//		System.out.println("Bus max speed: " + maxSpeed + " km/h");
//	}
	
	//Bus class will overide this method because the default implementation
	//is not appropriate for Bus class
	public int getWheelsNumber(){
		return 6;
	}

void showMaxSpeed() {
	// TODO Auto-generated method stub
	
}
}

//Truck IS-A Vehicle 
class Truck extends Vehicle {
	public Truck(){
		maxSpeed = 80;
	}
	
	public void showMaxSpeed() {
		System.out.println("Truck max speed: " + maxSpeed + " km/h");
	}
	
	//Truck class will overide this method because the default implementation
	//is not appropriate for Truck class
	public int getWheelsNumber(){
		return 10;
	}
}

public  class AbstractClassExample {
		
	public static void main(String[] args){
		Vehicle car = new Car();
		Vehicle bus = new Bus();
		Vehicle truck = new Truck();
		
		car.showMaxSpeed();
		bus.showMaxSpeed();
		truck.showMaxSpeed();
		
		int a[] = new int []{0,0,0,0,0};
		
		car.VehicleName();
		
		if (car instanceof Car) {
			System.out.print("====== car is instance of Car : true ========\n");
		}
		System.out.println("Wheels number-car:" + car.getWheelsNumber() + ", bus: " + bus.getWheelsNumber()
				 + ", truck:" + truck.getWheelsNumber());
	}
	
}
