package br.com.nasa.mars.rover.model;

import br.com.nasa.mars.rover.cardinalDirection.CardinalDirection;
import br.com.nasa.mars.rover.cardinalDirection.enumerator.CardinalDirectionEnum;
import br.com.nasa.mars.rover.instruction.Instruction;
import br.com.nasa.mars.rover.instruction.enumerator.InstructionEnum;
import br.com.nasa.mars.rover.printer.MarsPlateauSize;
import br.com.nasa.mars.rover.printer.Printer;
import br.com.nasa.mars.rover.printer.WelcomeMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scan implements MarsPlateauCreator {

    MarsPlateau marsPlateau = new MarsPlateau();
    private int[][] plateauSize;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public MarsPlateau create() {
        printInitialMessage();

        getPlateauSize();
        getProbeQuantity();

        scanner.close();
        return marsPlateau;
    }

    private void addProbe(){
        System.out.println(" Type the position and the Cardinal Direction ");
        String probeText = scanner.nextLine();

        int[] position = getProbePosition(probeText);
        CardinalDirection cardinalDirection = getProbeCardinalDirection(probeText);

        System.out.println(" Type the instructions ");
        String instructionsText = scanner.nextLine();
        List<Instruction> instructionList = getProbeInstructions(instructionsText);

        Probe probe = new Probe(position, cardinalDirection, instructionList);
        marsPlateau.addProbe(probe);
    }

    private int getProbeQuantity() {
        System.out.println(" Type the quantity of probes: ");
        int numberOfProbes = scanner.nextInt();

        scanner.nextLine();
        while (numberOfProbes-- > 0) {
            addProbe();
        }

        return numberOfProbes;
    }

    private void printInitialMessage() {
        Printer welcomeMessage = new WelcomeMessage();
        welcomeMessage.print();
    }

    private void getPlateauSize() {
        Printer plateauSizeMessage = new MarsPlateauSize();
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

    private List<Instruction> getProbeInstructions(String instructionsText){
        List<Instruction> instructions = new ArrayList<Instruction>();

        for (int i = 0; i < instructionsText.length(); i++) {
            Instruction instruction = InstructionEnum.findByKey(instructionsText.substring(i, i+1));
            instructions.add(instruction);
        }

        return instructions;
    }

    private int getIntInText(String text, int position) {
        return Integer.valueOf(text.split(" ")[position]);
    }
}
