package br.com.nasa.mars.rover.printer;

public class ProbesQuantity implements Printer{
    @Override
    public void print() {
        System.out.println(" Type the quantity of probes ");
        System.out.println(" Example: 1");
    }

    @Override
    public void print(Object[] args) {}
}
