package org.freecodecamp.runnerz;

import org.springframework.stereotype.Component;

@Component

public class WelcomeMessage {
	
	public String showMessage() {
		return "Hellow World";	
	}

}
