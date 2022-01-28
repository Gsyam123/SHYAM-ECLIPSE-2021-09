package setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class AirtelSim {
	public void calling() {
		System.out.println("calling from Airtel Sim");

	}

	public void browsing() {
		System.out.println("browsing from Airtel Sim");

	}
}

class MotoC {
	AirtelSim sim;

	public AirtelSim getSim() {
		return sim;
	}

	public void setSim(AirtelSim sim) {
		this.sim = sim;
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
		ApplicationContext con = new ClassPathXmlApplicationContext("setterinjection/Airtel.xml");
		MotoC m = (MotoC) con.getBean("mobile");
		m.call();
		m.browse();

	}
}
