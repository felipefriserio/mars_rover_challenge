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
import java.util.Scanner;

public class Scan implements MarsPlateauCreator {
    private MarsPlateau marsPlateau = new MarsPlateau();
    private Scanner scanner;

    private Printer welcomeMessage = new WelcomeMessage();
    private Printer plateauSizeMessage = new MarsPlateauSize();
    private Printer probesQuantity = new ProbesQuantity();
    private Printer probePositionAndCardinal = new ProbePositionAndCardinalDirection();
    private Printer probeInstruction = new ProbeInstruction();

    @Override
    public MarsPlateau create() {
        welcomeMessage.print();

        scanner = new Scanner(System.in);
        getPlateauSize();
        getProbesInformation();

        scanner.close();
        return marsPlateau;
    }

    private void addProbeInPlateau() {
        probePositionAndCardinal.print();
        String probeText = scanner.nextLine();

        int[] position = getProbePosition(probeText);
        CardinalDirection cardinalDirection = getProbeCardinalDirection(probeText);
        List<Instruction> instructionList = getProbeInstructions();

        Probe probe = new Probe(position, cardinalDirection, instructionList);
        marsPlateau.addProbe(probe);
    }

    private void getProbesInformation() {
        probesQuantity.print();
        int numberOfProbes = scanner.nextInt();
        scanner.nextLine();

        while (numberOfProbes-- > 0) {
            addProbeInPlateau();
        }
    }

    private void getPlateauSize() {
        plateauSizeMessage.print();
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
        CardinalDirection cardinalDirection = CardinalDirectionEnum.findByKey(text);
        return cardinalDirection;
    }

    private List<Instruction> getProbeInstructions(){
        probeInstruction.print();
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
