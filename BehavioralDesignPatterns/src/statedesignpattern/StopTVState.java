package statedesignpattern;

public class StopTVState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is now turned OFF");
	}

}