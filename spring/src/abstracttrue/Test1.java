package abstracttrue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Car {
	private int cc;
	private String name;
	private String type;
	private String colour;

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Car [cc=" + cc + ", name=" + name + ", type=" + type + ", colour=" + colour + "]";
	}

}

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("abstracttrue/Abstract.xml");
		Car c = (Car) con.getBean("car2");
		System.out.println(c);
	}
}
