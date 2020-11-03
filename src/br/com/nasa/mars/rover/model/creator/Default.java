package br.com.nasa.mars.rover.model.creator;

import br.com.nasa.mars.rover.cardinalDirection.CardinalDirection;
import br.com.nasa.mars.rover.cardinalDirection.North;
import br.com.nasa.mars.rover.instruction.Instruction;
import br.com.nasa.mars.rover.instruction.Move;
import br.com.nasa.mars.rover.model.MarsPlateau;
import br.com.nasa.mars.rover.model.Probe;

import java.util.Arrays;
import java.util.List;

public class Default implements MarsPlateauCreator{
    @Override
    public MarsPlateau create() {
        MarsPlateau marsPlateau = new MarsPlateau();
        marsPlateau.setSize(new int[10][10]);

        int[] position = new int[] {5,5};
        CardinalDirection cardinalDirection = new North();
        List<Instruction> instructionList = Arrays.asList(new Move(), new Move(), new Move());

        Probe probe = new Probe(position, cardinalDirection, instructionList);
        marsPlateau.addProbe(probe);

        return marsPlateau;
    }
}
