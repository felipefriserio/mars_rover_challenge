package br.com.nasa.mars.rover.cardinalDirection;

import br.com.nasa.mars.rover.cardinalDirection.enumerator.CardinalDirectionEnum;
import br.com.nasa.mars.rover.model.Probe;

public class South implements CardinalDirection {

	public CardinalDirection turnLeft() {
		return new East();
	}

	public CardinalDirection turnRight() {return new West();}

	public void move(Probe probe) {
		int[] position = probe.getPosition();
		position[1] -= 1;
	}
	
	public CardinalDirectionEnum getCardinal() {
		return CardinalDirectionEnum.SOUTH;
	}

	@Override
	public String toString() {
		return getCardinal().getKey();
	}
}
