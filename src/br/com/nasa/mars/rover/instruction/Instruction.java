package br.com.nasa.mars.rover.instruction;

import br.com.nasa.mars.rover.model.Probe;

public interface Instruction {
	public void execute(Probe probe);
}
