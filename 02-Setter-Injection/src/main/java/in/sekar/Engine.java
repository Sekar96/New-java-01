package in.sekar;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public Engine() {
		System.out.println("Engine Constructor");
	}

	public int start() {
		return 1;

	}
}
