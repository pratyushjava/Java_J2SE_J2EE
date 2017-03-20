package mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Message-Driven Bean implementation class for: TestMyMDB
 * 
 */
/*@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/MyQueue") },mappedName="my_mdb")*/
@MessageDriven(mappedName="jms/MyQueue", activationConfig =  {
        @ActivationConfigProperty(propertyName = "acknowledgeMode",
                                  propertyValue = "Auto-acknowledge"),
        @ActivationConfigProperty(propertyName = "destinationType",
                                  propertyValue = "javax.jms.Queue")
    })

public class TestMyMDB implements MessageListener {

	/**
	 * Default constructor.
	 */
	public TestMyMDB() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see MessageListener#onMessage(Message)
	 */
	public void onMessage(Message message) {
		// text msg handling
		try {
			// chk if its TM
			if (message instanceof TextMessage)
				System.out.println("Msg rcvd : "
						+ ((TextMessage) message).getText());
			else
				System.out.println("invalid msg type");
		} catch (Exception e) {
			System.out.println("err in onMesg " + e);
		}

	}

}
