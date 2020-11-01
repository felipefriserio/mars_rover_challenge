package br.com.nasa.mars.rover;

import br.com.nasa.mars.rover.model.MarsPlateauCreator;
import br.com.nasa.mars.rover.model.MarsPlateau;
import br.com.nasa.mars.rover.model.Scan;

public class Main {
	public static void main(String[] args) throws Exception {
		MarsPlateauCreator type = new Scan();

		MarsPlateau marsPlateau = type.create();
		marsPlateau.sendProbes();
	}
}




