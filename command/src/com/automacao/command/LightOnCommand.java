package com.automacao.command;

import com.automacao.Command;
import com.automacao.receptor.Light;

public class LightOnCommand implements Command {

	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
