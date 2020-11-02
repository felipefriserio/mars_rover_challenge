package br.com.nasa.mars.rover.printer;

import br.com.nasa.mars.rover.model.Probe;

import java.util.List;

public interface Printer {
    void welcomeMessage();
    void marsPlateauSize();
    void probeInstruction();
    void probesQuantity();
    void probePositionsAndCardinalDirection();
    void probesPositions(List<Probe> probeList);
}
