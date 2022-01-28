package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Jiosim {
	public void browsing() {
		System.out.println("browsing from jiosim");

	}

	public void calling() {
		System.out.println("calling from jiosim");
	}
}

class Jiomobile {
	private Jiosim sim;

	public Jiosim getSim() {
		return sim;
	}

	public void setSim(Jiosim sim) {
		this.sim = sim;
	}

	@Override
	public String toString() {
		return "Jiomobile [sim=" + sim + "]";
	}

	Jiomobile(Jiosim sim) {
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
	ApplicationContext c=new ClassPathXmlApplicationContext("constructorinjection/Jio.xml");
	Jiomobile mobile=(Jiomobile)c.getBean("jm");
	mobile.call();
	mobile.browse();
	
}
}
