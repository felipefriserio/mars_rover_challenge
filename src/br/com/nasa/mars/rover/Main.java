package br.com.nasa.mars.rover;

import br.com.nasa.mars.rover.model.creator.MarsPlateauCreator;
import br.com.nasa.mars.rover.model.MarsPlateau;
import br.com.nasa.mars.rover.model.creator.UserInputScanner;
import br.com.nasa.mars.rover.printer.Printer;
import br.com.nasa.mars.rover.printer.SystemOutPrintln;

public class Main {
	public static void main(String[] args) {
		Printer printer = new SystemOutPrintln();

		MarsPlateauCreator type = new UserInputScanner();
		MarsPlateau marsPlateau = type.create();
		marsPlateau.sendProbes();

		printer.probesPositions(marsPlateau.getProbesList());
	}
}




