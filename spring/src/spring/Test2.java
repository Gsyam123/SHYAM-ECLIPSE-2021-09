package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Bus {
	private int capacity;
	private String company;
	private String busno;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBusno() {
		return busno;
	}

	public void setBusno(String busno) {
		this.busno = busno;
	}

	@Override
	public String toString() {
		return "Bus [capacity=" + capacity + ", company=" + company + ", busno=" + busno + "]";
	}

}

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("spring/Bus1.xml");
		Bus b1=(Bus)con.getBean("bus");
		System.out.println(b1);
	}
}
