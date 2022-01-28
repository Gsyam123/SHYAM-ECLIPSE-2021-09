package javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

class Car {

}

class Abc {
	@Bean
	public Car getCar() {
		return new Car();

	}
}

public class Test1 {
	public static void main(String[] args) {
		//ApplicationContext c = new AnnotationConfigApplicationContext("configuration.class");

	}
}
