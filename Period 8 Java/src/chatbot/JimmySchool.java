package chatbot;


public class JimmySchool implements Chatbot {

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk() {
		inSchoolLoop = true;
		while (inSchoolLoop) {
			JimmyMain.print("(Type 'quit' to go back)");
			//static  call on promptInput method from JimmyMain class
			schoolResponse = JimmyMain.promptInput();
			if (schoolResponse.indexOf("quit") >= 0) {
				inSchoolLoop = false;
				JimmyMain.promptForever();
			}
			else {
				JimmyMain.print("That answer was good too");				
			}

		}
		
	}

	@Override
	public boolean isTriggered(String userInput) {
		String[] triggers = {"school","class","teacher"};
		for(int i = 0; i< triggers.length; i++) {
			if (JimmyMain.findKeyword(userInput,triggers[i],0)
					>= 0) {
				return true;
			}
			return false;
		}
		///////////////////////////////////////////////////////////////////
		if (JimmyMain.findKeyword(userInput,"school",0)
				>= 0) {
			return true;
		}
		if (JimmyMain.findKeyword(userInput,"class",0) 
				>= 0) {
			return true;
		}
		return false;
	}
	
}
