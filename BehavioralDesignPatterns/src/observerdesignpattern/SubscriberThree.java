package observerdesignpattern;

public class SubscriberThree implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
    }
}