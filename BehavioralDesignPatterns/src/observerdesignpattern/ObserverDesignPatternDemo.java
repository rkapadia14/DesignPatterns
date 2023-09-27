package observerdesignpattern;

public class ObserverDesignPatternDemo 
{
    public static void main(String[] args) 
    {
        SubscriberOne s1 = new SubscriberOne();
        SubscriberTwo s2 = new SubscriberTwo();
        SubscriberThree s3 = new SubscriberThree();
         
        MessagePublisher p = new MessagePublisher();
         
        p.attach(s1);
        p.attach(s2);
         
        p.notifyUpdate(new Message("This is the First Message"));   //s1 and s2 will receive the update
         
        p.detach(s1);
        p.attach(s3);
         
        p.notifyUpdate(new Message("This is the Second Message")); //s2 and s3 will receive the update
    }
}
