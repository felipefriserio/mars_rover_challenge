package br.com.nasa.mars.rover.cardinalDirection.enumerator;

import br.com.nasa.mars.rover.cardinalDirection.*;

public enum CardinalDirectionEnum{
	NORTH ("N", new North()),
	SOUTH ("S", new South()),
	EAST  ("E", new East()),
	WEST  ("W", new West());
	
	public String key;
	public CardinalDirection cardinalDirection;
	
	CardinalDirectionEnum(String key, CardinalDirection cardinalDirection) {
		this.key = key;
		this.cardinalDirection = cardinalDirection;
	}
	
	public String getKey() {
		return key;
	}
	
	public CardinalDirection getCardinalDirection() {
		return cardinalDirection;
	}

	public static CardinalDirection findByKey(String key) {
		for (CardinalDirectionEnum cardinalDirection : values()) {
			if( cardinalDirection.getKey().equalsIgnoreCase(key)) 
				return cardinalDirection.getCardinalDirection();
		}
		return null;
	}
}
