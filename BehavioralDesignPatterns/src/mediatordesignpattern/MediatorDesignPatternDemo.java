package mediatordesignpattern;

public class MediatorDesignPatternDemo 
{
    public static void main(String[] args) 
    {
        IChatRoom chatroom = new ChatRoom();
         
        User user1 = new ChatUser(chatroom,"1", "Naitik");
        User user2 = new ChatUser(chatroom,"2", "John");
        User user3 = new ChatUser(chatroom,"3", "Charles");
        User user4 = new ChatUser(chatroom,"4", "Lily");
         
        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);
 
        user1.send("Hello John", "2");
        user2.send("Hey Naitik", "1");
    }
}