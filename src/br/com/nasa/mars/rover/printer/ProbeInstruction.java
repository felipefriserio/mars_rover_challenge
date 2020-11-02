package br.com.nasa.mars.rover.printer;

public class ProbeInstruction implements Printer {
    @Override
    public void print() {
        System.out.println(" Type the instructions - L, R and M");
        System.out.println(" Example : MMLMRRM");
    }

    @Override
    public void print(Object[] args) {}
}
