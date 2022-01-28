package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Car {
	private int cc;
	private String type;

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [cc=" + cc + ", type=" + type + "]";
	}

}

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("spring/Bean.xml");
		Car c1 = (Car) cont.getBean("car");
		System.out.println(c1);

	}
}
