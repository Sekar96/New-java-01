package in.sekar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car() {
		System.out.println("CAr: Constructor");
	}

	public void drive() {
		int status = engine.start();
		if (status == 1) {
			System.out.println("Journey Started");
		}
	}
}
