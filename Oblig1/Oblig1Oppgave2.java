package Oblig1;
import javax.swing.*; 


public class Oblig1Oppgave2 {
	public static void main(String[] args){
		Vare vare1;
		Vare vare2;
		
		String vare1Navn, vare2Navn;
		int vare1Antall, vare2Antall;
		double vare1Pris, vare2Pris;
		
		try {
			vare1Navn = JOptionPane.showInputDialog("Skriv inn navn på vare1");
			vare1Antall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall av vare1"));
			vare1Pris = Double.valueOf(JOptionPane.showInputDialog("Skriv inn pris på vare1"));
		} catch (Exception e) {
			throw new IllegalArgumentException("Antall og pris må være over null. Antall må være et helt tall.");
		}
		
		try {
			vare2Navn = JOptionPane.showInputDialog("Skriv inn navn på vare2");
			vare2Antall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall av vare2"));
			vare2Pris = Double.valueOf(JOptionPane.showInputDialog("Skriv inn pris på vare2"));
		} catch (Exception e) {
			throw new IllegalArgumentException("Antall og pris må være over null. Antall må være et helt tall.");
		} 
        
		vare1 = new Vare(vare1Navn, vare1Antall, vare1Pris);
		vare2 = new Vare(vare2Navn, vare2Antall, vare2Pris);
        
		System.out.println(vare1);
		System.out.printf("Total pris av "+ vare1.getNavn()+" er %4.2f",vare1.totPris());
		System.out.println("\n"+vare2);
		System.out.printf("Total pris av "+ vare2.getNavn()+" er %4.2f",vare2.totPris());
	}
}
