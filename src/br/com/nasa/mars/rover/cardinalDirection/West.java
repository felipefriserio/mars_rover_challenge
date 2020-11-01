package br.com.nasa.mars.rover.cardinalDirection;

import br.com.nasa.mars.rover.cardinalDirection.enumerator.CardinalDirectionEnum;
import br.com.nasa.mars.rover.model.Probe;

public class West implements CardinalDirection {

	public CardinalDirectionEnum getName() {
		return CardinalDirectionEnum.WEST;
	}
	
	public CardinalDirection turnLeft() {
		return new South();
	}

	public CardinalDirection turnRight() {
		return new North();
	}

	public void move(Probe probe) {
		int[] position = probe.getPosition();
		position[0] -= 1;
	}
	
	public CardinalDirectionEnum getCardinal() {
		return CardinalDirectionEnum.WEST;
	}
}
