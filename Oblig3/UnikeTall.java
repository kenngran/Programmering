package Oblig3;

import static javax.swing.JOptionPane.*;

public class UnikeTall {
	private int[] array;

	public UnikeTall(int lengde) {
		if(lengde>899) throw new IllegalArgumentException("Length of array cannot exceed amount of unique numbers, and must be greater than 0");
		//Om lengden er større enn mengden unike tall skjører fillArray() evig ettersom den på et punkt aldri vil finne et unikt tall.
		//Om lengden er lavere vil den gi en unchecked excpetion. Her kan try-catch også brukes for å håndtere exceptionen selv. F.eks. ved å sette lengde=1
		array = new int[lengde];
		fillArray();
	}

	//private ettersom den kunn skal kunne brukes innenfor klassens metoder. 
	private boolean isInArray(int t) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == t) return true;
		}
		return false;
	}
	
	//private ettersom arrayet ikke skal kunne endres på etter opprettelse.
	private void fillArray() {
		for (int i = 0; i < array.length; i++) {
			int random = (int)(Math.random()*(900)+100);
			while(this.isInArray(random)) {
				random = (int)(Math.random()*(900)+100);
			}
			array[i]=random;
		}
	}

	//public i tilfelle klassen brukes i andre tilfeller enn displayArray(). Samme for findMax() og findAverage().
	public int findMin() {
		int tempMin=999;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<tempMin) tempMin=array[i];
		}
		return tempMin;
	}

	public int findMax() {
		int tempMax=100;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>tempMax) tempMax=array[i];
		}
		return tempMax;
		
	}

	public double findAverage() {
		int sum=0;
		for (int i : array) {
			sum+=i;
		}
		return (double)sum/array.length;
		
	}

	public void displayArray() {
		String melding ="";
		for (int i = 0; i < array.length-1; i++) {
			if(i%22==0) melding += "\n";
			melding += array[i]+ ", ";
		}
		melding += array[array.length-1];
		melding += "\n\nMinimal number is: "+this.findMin();
		melding += "\nMaximal number is: "+this.findMax();
		melding += "\n\nAverage is: " +String.format("%.2f", this.findAverage());
		showMessageDialog(null, melding);
	}
}
