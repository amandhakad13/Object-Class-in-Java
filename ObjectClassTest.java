class Car {
	public String name;
	public String color;
	public int model;
	public float price;
	
	public Car(String name, String color, int model, float price) {
		this.name = name;
		this.color = color;
		this.model = model;
		this.price = this.price;
	}
	
	public String toString() {
		return "Car = "+name+"\nColor = "+color+"\nModel = "+model+"\nPrice = "+price;
	}
}

public class ObjectClassTest {
	public static void main(String[] args) {
		Car c = new Car("Swift", "White", 2014, 1000000);
		
		System.out.println(c.toString());
		System.out.println(c.getClass().getName());
	}
}