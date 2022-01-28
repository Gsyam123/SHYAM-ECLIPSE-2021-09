package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Bike{
	private String model;
	private int cc;
	private String colour;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Bike [model=" + model + ", cc=" + cc + ", colour=" + colour + "]";
	}
	
}
public class Test4 {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("spring/Bike.xml");
	Bike b1=(Bike)con.getBean("bike");
	System.out.println(b1);
}
}
