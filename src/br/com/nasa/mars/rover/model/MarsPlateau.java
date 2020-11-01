package br.com.nasa.mars.rover.model;

import java.util.ArrayList;
import java.util.List;

public class MarsPlateau {
	private int[][]     size;
	private List<Probe> listOfProbes = new ArrayList<Probe>();

	public MarsPlateau() {}
	public MarsPlateau(int[][] size) {
		this.size = size;
	}

	public int[][] getSize() {
		return size;
	}

	public void setSize(int[][] size) {
		this.size = size;
	}

	public void setListOfProbes(List<Probe> listOfProbes) {
		this.listOfProbes = listOfProbes;
	}

	public void addProbe(Probe probe) {
		this.listOfProbes.add(probe);
	}
	
	public void sendProbes() throws Exception {
		for (Probe probe : listOfProbes) {
			probe.executeInstructions();
		}
		printProbesPositions();
	}

	public void printProbesPositions() {
		System.out.println("-------------------------------------------------RESULT----------------------------------------------");
		for (Probe probe : listOfProbes) {
			System.out.println( 
								probe.getPosition()[0] +" "+ 
								probe.getPosition()[1] +" "+
								probe.getCardinalDirection().getCardinal().getKey()
							  );
		}
	}
}
