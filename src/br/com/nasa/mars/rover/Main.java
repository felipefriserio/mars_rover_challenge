package br.com.nasa.mars.rover;

import br.com.nasa.mars.rover.model.creator.MarsPlateauCreator;
import br.com.nasa.mars.rover.model.MarsPlateau;
import br.com.nasa.mars.rover.model.creator.Scan;
import br.com.nasa.mars.rover.printer.Printer;
import br.com.nasa.mars.rover.printer.ProbesPositions;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Printer probePosition = new ProbesPositions();

		MarsPlateauCreator type = new Scan();
		MarsPlateau marsPlateau = type.create();
		marsPlateau.sendProbes();

		final List[] objectList = {marsPlateau.getProbesList()};
		probePosition.print(objectList);
	}
}




