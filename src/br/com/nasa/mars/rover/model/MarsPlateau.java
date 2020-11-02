package br.com.nasa.mars.rover.model;

import java.util.ArrayList;
import java.util.List;

public class MarsPlateau {
	private int[][] size;
	private List<Probe> probesList = new ArrayList<Probe>();

	public MarsPlateau() {}

	public int[][] getSize() {
		return size;
	}
	public void setSize(int[][] size) {
		this.size = size;
	}

	public List<Probe> getProbesList() {
		return probesList;
	}

	public void setProbesList(List<Probe> probesList) {
		this.probesList = probesList;
	}

	public void addProbe(Probe probe) {
		this.probesList.add(probe);
	}
	
	public void sendProbes() {
		for (Probe probe : probesList) {
			probe.executeInstructions();
		}
	}
}
