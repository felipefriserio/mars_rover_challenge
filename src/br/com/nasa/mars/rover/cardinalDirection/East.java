package br.com.nasa.mars.rover.cardinalDirection;

import br.com.nasa.mars.rover.cardinalDirection.enumerator.CardinalDirectionEnum;
import br.com.nasa.mars.rover.model.Probe;

public class East implements CardinalDirection {

	public CardinalDirection turnLeft() {
		return new North();
	}

	public CardinalDirection turnRight() {
		return new South();
	}
	
	public void move(Probe probe) {
		int[] position = probe.getPosition();
		position[0] += 1;
	}

	public CardinalDirectionEnum getCardinal() {
		return CardinalDirectionEnum.EAST;
	}

	@Override
	public String toString() {
		return getCardinal().getKey();
	}
}
