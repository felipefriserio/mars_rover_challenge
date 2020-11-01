package br.com.nasa.mars.rover.instruction;

import br.com.nasa.mars.rover.model.Probe;

public class Move implements Instruction {
	@Override
	public void execute(Probe probe) {
		probe.getCardinalDirection().move(probe);
	}
}
