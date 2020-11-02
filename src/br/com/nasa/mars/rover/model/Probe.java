package br.com.nasa.mars.rover.model;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import br.com.nasa.mars.rover.cardinalDirection.CardinalDirection;
import br.com.nasa.mars.rover.instruction.Instruction;
import br.com.nasa.mars.rover.instruction.enumerator.InstructionEnum;

public class Probe {
	
	private int[] position;
	private CardinalDirection cardinalDirection;
	private List<Instruction> instructions = new ArrayList<Instruction>();

	public Probe(int[] position, CardinalDirection cardinalDirection, List<Instruction> instructions){
		this.position          = position;
		this.cardinalDirection = cardinalDirection;
		this.instructions      = instructions;
	}

	public int[] getPosition() {
		return position;
	}

	public void setPosition(int[] position) {
		this.position = position;
	}

	public CardinalDirection getCardinalDirection() {
		return cardinalDirection;
	}

	public void setCardinalDirection(CardinalDirection cardinalDirection) {
		this.cardinalDirection = cardinalDirection;
	}

	public List<Instruction> getInstructions() {
		return instructions;
	}

	public void setInstructions(List<Instruction> instructions) {
		this.instructions = instructions;
	}

	public void executeInstructions(){
		for (Instruction instruction : instructions) {
			  instruction.execute(this);
		}
	}
	
	@Override
	public String toString() {
		return position[0] + " " + position[1] + " " + cardinalDirection;
	}
}
