package com.automacao.command;

import com.automacao.Command;
import com.automacao.receptor.Light;

public class LightOffCommand implements Command {

	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}
