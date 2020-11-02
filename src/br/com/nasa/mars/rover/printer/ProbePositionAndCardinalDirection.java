package br.com.nasa.mars.rover.printer;

public class ProbePositionAndCardinalDirection implements Printer {
    @Override
    public void print() {
        System.out.println(" Type the position and the Cardinal Direction ");
        System.out.println(" POSITION X [SPACE] POSITION Y [SPACE] CARDINAL_DIRECTION  (N,S,E,W)");
        System.out.println(" Example : 5 5 N");
    }

    @Override
    public void print(Object[] args) {}
}
