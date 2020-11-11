package Oblig1;

public class Vare {
    public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		if(antall>0) {			
			this.antall = antall;
		} else throw new IllegalArgumentException("Invalid amount");
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		if(pris>0) {
			
			this.pris = pris;
		} else throw new IllegalArgumentException("Invalid price");
	}

	private String navn;
    private int antall;
    private double pris;

    public Vare(String n, int a, double p) {
    	setPris(p);
    	setAntall(a);
    	setNavn(n);
    }
    
    public double totPris() {
    	return getPris()*getAntall();
    }
    
    @Override
    public String toString() {
    	return "Navn: " + getNavn() +", Pris: " + getPris() + ", Antall: " + getAntall();
    }

}
