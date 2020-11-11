package Oblig2;
import javax.swing.*;

public class Sum {
private int min, max;
	
	private void lesMax() {
		int tempMax = 0;
		try {
			tempMax= Integer.parseInt(JOptionPane.showInputDialog("Tast inn max grense"));
		} catch (Exception e) {
			System.out.println(e);
		}
		if(tempMax<=min) {
			JOptionPane.showMessageDialog(null, "Max tall må være større enn Min tall");
			lesMax();
		}
		else max = tempMax;
	}
	private void lesMin() {
		try {
			min = Integer.parseInt(JOptionPane.showInputDialog("Tast inn min grense"));
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private int beregn() {
		return ((max*(max+1))/2) - (((min-1)*(min))/2);
	}
	
	private void skrivUt() {
		String skriv = "";
		int l = 0;
		
		for (int i = min; i < max; i++) {
			if(l%10==0) skriv += '\n';
			skriv += i + " + ";
			l++;
		}
		
		skriv += max + " = " + beregn();
		JOptionPane.showMessageDialog(null, skriv);
	}
	
	public static void main(String[] args) {
		Sum s = new Sum();
		
		s.lesMin();
		s.lesMax();
		s.skrivUt();
	}
}
