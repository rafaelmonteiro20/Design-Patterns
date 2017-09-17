package com.automacao;

import com.automacao.command.LightOnCommand;
import com.automacao.receptor.Light;

public class SimpleRemoteControlTest {

	public static void main(String[] args) {
		
		SimpleRemoteControl control = new SimpleRemoteControl();
		
		control.setCommand(new LightOnCommand(new Light()));

		control.buttonWasPressed();
	}
	
}
