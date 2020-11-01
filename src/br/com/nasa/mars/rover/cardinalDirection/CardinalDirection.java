package br.com.nasa.mars.rover.cardinalDirection;

import br.com.nasa.mars.rover.cardinalDirection.enumerator.CardinalDirectionEnum;
import br.com.nasa.mars.rover.model.Probe;

public interface CardinalDirection {

	public CardinalDirectionEnum getCardinal();
	public CardinalDirection turnLeft();
	public CardinalDirection turnRight();
	public void move(Probe probe);
}
