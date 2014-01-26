package net.chlab.sandbox.inappqueue;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven
public class MessageReceiverBean implements MessageListener {

    public void onMessage(Message message) {
    }
}
