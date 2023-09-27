package observerdesignpattern;

//This is an immutable object so that no class can modify it’s content by mistake.
public class Message 
{
    final String messageContent;
     
    public Message (String m) {
        this.messageContent = m;
    }
 
    public String getMessageContent() {
        return messageContent;
    }
}