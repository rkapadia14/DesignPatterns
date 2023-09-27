package statedesignpattern;

public class StateDesignPatternDemo {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new StartTVState();
		State tvStopState = new StopTVState();
		
		context.setState(tvStartState);
		context.doAction();
		
		
		context.setState(tvStopState);
		context.doAction();
		
	}

}