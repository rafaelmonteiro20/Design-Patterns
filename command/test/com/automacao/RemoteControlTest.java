package com.automacao;

import com.automacao.command.LightOffCommand;
import com.automacao.command.LightOnCommand;
import com.automacao.receptor.Light;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		RemoteControl control = new RemoteControl();
		
		Light light = new Light();
		
		control.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
		
		System.out.println(control);

		control.onButtonWasPushed(0);
		control.offButtonWasPushed(0);
	}
	
}