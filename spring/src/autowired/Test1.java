package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface Sim {
	void browsing();

	void calling();

}

class Jiosim implements Sim {
	public void calling() {
		System.out.println("calling from jsim");

	}

	public void browsing() {
		System.out.println("browsing from jsim");
	}
}

class Mobile {
	Sim sim;

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	@Override
	public String toString() {
		return "Mobile [sim=" + sim + "]";
	}

}

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("autowired/Autowired.xml");
		Mobile m=(Mobile)con.getBean("mobile");
		System.out.println(m);
	}
}
