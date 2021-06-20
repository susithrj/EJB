package MDBean;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {@ActivationConfigProperty(propertyName = "destinationonookup", propertyValue = "jmsDemo/susith")})
public class MYMessageBean implements  MessageListener{

    @Override
    public void onMessage(Message message) {
        TextMessage msg = (TextMessage) message;
        try {
            System.out.println("got msg from:"+msg.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }
}
