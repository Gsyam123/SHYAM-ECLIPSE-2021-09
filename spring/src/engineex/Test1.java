package engineex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Engine {
	private int cc;
	private String fuel;



	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", fuel=" + fuel + "]";
	}
	
	

}

class Car {
	String name;
	Engine engine;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
	}

	public void start() {
		System.out.println("started");

	}

	public void journey() {
		System.out.println("journey");
	}
}

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("engineex/Eng.xml");
		Car c1 = (Car) con.getBean("car");
		c1.start();
		c1.journey();
		System.out.println(c1);

	}
}
