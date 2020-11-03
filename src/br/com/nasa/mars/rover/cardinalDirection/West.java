package br.com.nasa.mars.rover.cardinalDirection;

import br.com.nasa.mars.rover.cardinalDirection.enumerator.CardinalDirectionEnum;
import br.com.nasa.mars.rover.model.Probe;

public class West implements CardinalDirection {

	public CardinalDirectionEnum getName() {
		return CardinalDirectionEnum.WEST;
	}
	
	public void turnLeft(Probe probe) {
		probe.setCardinalDirection(new South());
	}

	public void turnRight(Probe probe) {
		probe.setCardinalDirection(new North());
	}

	public void move(Probe probe) {
		int[] position = probe.getPosition();
		position[0] -= 1;
	}
	
	public CardinalDirectionEnum getCardinal() {
		return CardinalDirectionEnum.WEST;
	}

	@Override
	public String toString() {
		return getCardinal().getKey();
	}
}
