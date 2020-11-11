package Oblig2;

import javax.swing.JOptionPane;

class Tallspill{
	
	private int i;
	private boolean avsluttet = false;
	
  public int nyttTall() {
    return (int) (Math.random() * 201);
  }

  public void visMelding(String melding){
    JOptionPane.showMessageDialog(null, melding);
  }

  private void forLite(int tall){
	  visMelding(tall + " var for lite, prøv igjen");
  }

  private void forStort(int tall) {
	  visMelding(tall+" var for stort, prøv igjen");
  }

  public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
	  visMelding(gjetning + " var riktig! Du brukte "+antall+" forsøk.");
	  avsluttet = true;
  }

  public int gjett() {
	  int g = -1;
	  i++;
	  try {
		g = Integer.parseInt(JOptionPane.showInputDialog("Jeg tenker på et heltall mellom 0 og 200. \n Prøv å gjette dette tallet:"));
		return g;
	} catch (Exception e) {
		System.out.println(e);
	}
	return g;
  }
  
  public void kjørSpill() {
	  i=0;
	  avsluttet = false;
	  int tall = nyttTall();
	 
	  while (!avsluttet) {
		int gjetning = gjett();
		if(gjetning < 0) {
			JOptionPane.showMessageDialog(null, "Invalid input");
			break;
		}
		else if(gjetning == tall) avsluttRunde(i, gjetning);
		else if(gjetning < tall) forLite(gjetning);
		else if(gjetning >tall) forStort(gjetning);
	}
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
	  
  }
  public static void main(String[] args) {
	Tallspill t = new Tallspill();
	t.kjørSpill();
}
}
