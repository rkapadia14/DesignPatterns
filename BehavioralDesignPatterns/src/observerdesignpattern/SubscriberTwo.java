package observerdesignpattern;

public class SubscriberTwo implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}