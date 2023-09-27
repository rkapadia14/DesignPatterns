package observerdesignpattern;

public class SubscriberOne implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}
