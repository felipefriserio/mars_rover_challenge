package br.com.nasa.mars.rover.cardinalDirection;

import br.com.nasa.mars.rover.cardinalDirection.enumerator.CardinalDirectionEnum;
import br.com.nasa.mars.rover.model.Probe;

public class North implements CardinalDirection {

	public CardinalDirection turnLeft() {
		return new West();
	}

	public CardinalDirection turnRight() {
		return new East();
	}

	public void move(Probe probe) {
		int[] position = probe.getPosition();
		position[1] += 1;
	}
	
	public CardinalDirectionEnum getCardinal() {
		return CardinalDirectionEnum.NORTH;
	}
}
