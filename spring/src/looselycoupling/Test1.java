package looselycoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface Sim {
	void calling();

	void browsing();
}

class Airtelsim implements Sim {
	public void calling() {
		System.out.println("calling from aitelsim");

	}

	public void browsing() {
		System.out.println("browsing from airtelsim");

	}

}

class Jiosim implements Sim {
	public void calling() {
		System.out.println("calling from jiosim");

	}

	public void browsing() {
		System.out.println("calling from jiosim");
	}
}

class Mobile {
	private Sim sim;

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

	public void call() {
		sim.calling();

	}

	public void browse() {
		sim.browsing();

	}
}

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("looselycoupling/AJ.xml");
		Mobile m = (Mobile) c.getBean("mobile");
		m.call();
		m.browse();

	}
}
