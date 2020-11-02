package br.com.nasa.mars.rover.printer;

public class MarsPlateauSize implements Printer{
    @Override
    public void print() {
        System.out.println(" Type the size of the martian plateau like this example: NUMBER [SPACE] NUMBER");
        System.out.println(" Example: 10 10");
    }

    @Override
    public void print(Object[] args) {}
}
