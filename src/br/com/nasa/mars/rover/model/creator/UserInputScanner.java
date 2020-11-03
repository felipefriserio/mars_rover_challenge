package br.com.nasa.mars.rover.model.creator;

import br.com.nasa.mars.rover.cardinalDirection.CardinalDirection;
import br.com.nasa.mars.rover.cardinalDirection.enumerator.CardinalDirectionEnum;
import br.com.nasa.mars.rover.instruction.Instruction;
import br.com.nasa.mars.rover.instruction.enumerator.InstructionEnum;
import br.com.nasa.mars.rover.model.MarsPlateau;
import br.com.nasa.mars.rover.model.Probe;
import br.com.nasa.mars.rover.printer.*;

import java.util.ArrayList;
import java.util.List;

public class UserInputScanner implements MarsPlateauCreator {
    private MarsPlateau marsPlateau = new MarsPlateau();
    private java.util.Scanner scanner;

    private Printer printer = new SystemOutPrintln();

    @Override
    public MarsPlateau create() {
        printer.welcomeMessage();

        scanner = new java.util.Scanner(System.in);
        getPlateauSize();
        getProbesInformation();

        scanner.close();
        return marsPlateau;
    }

    private void addProbeInPlateau() {
        printer.probePositionsAndCardinalDirection();
        String probeText = scanner.nextLine();

        int[] position = getProbePosition(probeText);
        CardinalDirection cardinalDirection = getProbeCardinalDirection(probeText);
        List<Instruction> instructionList = getProbeInstructions();

        Probe probe = new Probe(position, cardinalDirection, instructionList);
        marsPlateau.addProbe(probe);
    }

    private void getProbesInformation() {
        printer.probesQuantity();
        int numberOfProbes = scanner.nextInt();
        scanner.nextLine();

        while (numberOfProbes-- > 0) {
            addProbeInPlateau();
        }
    }

    private void getPlateauSize() {
        printer.marsPlateauSize();
        String text = scanner.nextLine();

        int x = getIntInText(text, 0) ;
        int y = getIntInText(text, 1) ;

        marsPlateau.setSize(new int[x][y]);
    }

    private int[] getProbePosition(String probeText) {
        int x = getIntInText(probeText, 0);
        int y = getIntInText(probeText, 1) ;

        return new int[] {x,y};
    }

    private CardinalDirection getProbeCardinalDirection(String probeText){
        String text = probeText.split(" ")[2];
        return CardinalDirectionEnum.findByKey(text);
    }

    private List<Instruction> getProbeInstructions(){
        printer.probeInstruction();
        String probeInstructions = scanner.nextLine();

        List<Instruction> instructions = new ArrayList<Instruction>();
        for (int i = 0; i < probeInstructions.length(); i++) {
            Instruction instruction = getInstructionInText(probeInstructions, i);
            instructions.add(instruction);
        }

        return instructions;
    }

    private Instruction getInstructionInText(String probeInstructions, int i) {
        String textInstruction = probeInstructions.substring(i, i + 1);
        Instruction instruction = InstructionEnum.findByKey(textInstruction);
        return instruction;
    }

    private int getIntInText(String text, int position) {
        return Integer.valueOf(text.split(" ")[position]);
    }
}
