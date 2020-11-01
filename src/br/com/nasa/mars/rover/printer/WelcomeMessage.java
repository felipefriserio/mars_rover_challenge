package br.com.nasa.mars.rover.printer;

public class WelcomeMessage implements Printer {

    @Override
    public void print() {
        System.out.println(" -----------------------------------------------------------------------------------------------------");
        System.out.println(" ------------------------------------------  EXPLORING MARS ------------------------------------------");
        System.out.println(" -----------------------------------------------------------------------------------------------------");
        System.out.println(" ------------- Welcome to the most awesome martian system. A system from another world! --------------");
        System.out.println(" -----------------------------------------------------------------------------------------------------");
    }
}
