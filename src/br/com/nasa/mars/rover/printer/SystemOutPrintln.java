package br.com.nasa.mars.rover.printer;

import br.com.nasa.mars.rover.model.Probe;

import java.util.List;

public class SystemOutPrintln implements Printer{

    public void welcomeMessage() {
        System.out.println(" -----------------------------------------------------------------------------------------------------");
        System.out.println(" ------------------------------------------  EXPLORING MARS ------------------------------------------");
        System.out.println(" -----------------------------------------------------------------------------------------------------");
        System.out.println(" ------------- Welcome to the most awesome martian system. A system from another world! --------------");
        System.out.println(" -----------------------------------------------------------------------------------------------------");
    }

    public void marsPlateauSize() {
        System.out.println(" Type the size of the martian plateau like this example: NUMBER [SPACE] NUMBER");
        System.out.println(" Example: 10 10");
    }

    public void probeInstruction() {
        System.out.println(" Type the instructions - L, R and M");
        System.out.println(" Example : MMLMRRM");
    }

    public void probesPositions(List<Probe> probeList) {
        for (Probe probe : probeList) {
            String spaces = spaceBuilder(20);
            System.out.println(spaces + " RESULT " + spaces);
            System.out.println(probe);
        }
    }

    public void probesQuantity() {
        System.out.println(" Type the quantity of probes ");
        System.out.println(" Example: 1");
    }

    @Override
    public void probePositionsAndCardinalDirection() {
        System.out.println(" Type the position and the Cardinal Direction ");
        System.out.println(" POSITION X [SPACE] POSITION Y [SPACE] CARDINAL_DIRECTION  (N,S,E,W)");
        System.out.println(" Example : 5 5 N");
    }

    private String spaceBuilder(int quantity){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= quantity; i++){
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
