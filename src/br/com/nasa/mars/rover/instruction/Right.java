package br.com.nasa.mars.rover.instruction;

import br.com.nasa.mars.rover.model.Probe;

public class Right implements Instruction {
	public void execute(Probe probe) {
		probe.turnRight();
	}
}
