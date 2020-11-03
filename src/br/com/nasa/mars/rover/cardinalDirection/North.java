package br.com.nasa.mars.rover.cardinalDirection;

import br.com.nasa.mars.rover.cardinalDirection.enumerator.CardinalDirectionEnum;
import br.com.nasa.mars.rover.model.Probe;

public class North implements CardinalDirection {

	public void turnLeft(Probe probe) {
		probe.setCardinalDirection(new West());
	}

	public void turnRight(Probe probe) {
		probe.setCardinalDirection(new East());
	}

	public void move(Probe probe) {
		int[] position = probe.getPosition();
		position[1] += 1;
	}
	
	public CardinalDirectionEnum getCardinal() {
		return CardinalDirectionEnum.NORTH;
	}

	@Override
	public String toString() {
		return getCardinal().getKey();
	}
}
