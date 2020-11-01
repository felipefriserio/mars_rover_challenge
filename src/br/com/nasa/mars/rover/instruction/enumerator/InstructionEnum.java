package br.com.nasa.mars.rover.instruction.enumerator;

import br.com.nasa.mars.rover.instruction.Instruction;
import br.com.nasa.mars.rover.instruction.Left;
import br.com.nasa.mars.rover.instruction.Move;
import br.com.nasa.mars.rover.instruction.Right;

public enum InstructionEnum {
	LEFT  ("L", new Left()),
	RIGHT ("R", new Right()),
	MOVE  ("M", new Move());
	
	private String key;
	private Instruction instruction;
	
	InstructionEnum(String direction, br.com.nasa.mars.rover.instruction.Instruction instruction) {
		this.key = direction;
		this.instruction = instruction;
	}
	
	public String getKey() {
		return key;
	}
	
	public Instruction getInstruction() {
		return instruction;
	}
	
	public static Instruction findByKey(String key) {
		for (InstructionEnum direction : values()) {
			if( direction.getKey().equalsIgnoreCase(key)) 
				return direction.getInstruction();
		}
		return null;
	}
}
