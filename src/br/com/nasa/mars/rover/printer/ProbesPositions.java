package br.com.nasa.mars.rover.printer;

import br.com.nasa.mars.rover.model.Probe;

import java.util.List;

public class ProbesPositions implements Printer {
    @Override
    public void print(){}

    @Override
    public void print(Object[] args) {
        List<Probe> probeList = (List<Probe>) args[0];

        for (Probe probe : probeList) {
            String spaces = spaceBuilder(20);
            System.out.println(spaces + " RESULT " + spaces);
            System.out.println(probe);
        }
    }

    private String spaceBuilder(int quantity){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= quantity; i++){
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
