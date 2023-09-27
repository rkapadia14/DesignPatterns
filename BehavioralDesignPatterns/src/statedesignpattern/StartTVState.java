package statedesignpattern;

public class StartTVState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is now turned ON");
	}

}