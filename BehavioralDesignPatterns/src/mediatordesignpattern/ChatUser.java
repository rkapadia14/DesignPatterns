package mediatordesignpattern;

public class ChatUser extends User {
    
    public ChatUser(IChatRoom room, String id, String name) {
        super(room, id, name);
    }
 
    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + " :: Sending Chat Message : " + msg);
        getMediator().sendMessage(msg, userId);
    }
 
    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " :: Received Chat Message : " + msg);
    }
 
}
