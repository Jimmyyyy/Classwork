package chatbot;

public class JimmyHello implements Chatbot {
	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponse = {"Let's say something else", "Let's keep the conversation going"};
	private String[] angryResponse = {"Please stop repeating yourself","Do not say hello ever again"};
	
	private int helloCount;
	
	public JimmyHello() {
		helloCount = 0;
	}
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop) {
			helloCount++;
			printResponse();//helper method
			helloResponse = JimmyMain.promptInput();
			
			if(isTriggered(helloResponse)) {
				inHelloLoop = false;
				JimmyMain.promptForever();
			}
		}
	}
	
	private void printResponse() {
		if(helloCount > 4) {
			
			int responseSelection = (int)(Math.random() * angryResponse.length);		
			JimmyMain.print(angryResponse[responseSelection]);
			
		}
		
		else {
			int responseSelection = (int)(Math.random() * calmResponse.length);		
			JimmyMain.print(calmResponse[responseSelection]);
		}
	}
	
	
	public  boolean isTriggered(String userInput) {
		String[] triggers = {"hello","hi","hey"};
		for(int i = 0; i< triggers.length; i++) {
			if (JimmyMain.findKeyword(userInput,triggers[i],0)
					>= 0) {
				return true;
			}

		}
		return false;

	}
}
	
