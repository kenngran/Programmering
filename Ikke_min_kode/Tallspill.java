package Ikke_min_kode;


/* OPPGAVE 2:
Det skal brukes javax.swing sine input- og meldings-bokser i denne oppgaven.
Oppgaven er å lage et program for et tallspill.
Programmet skal generere et tilfeldig helt tall (slumptall) mellom 0 og 200 (begge grensene inkludert).
Spilleren skal prøve å gjette på dette tallet. For hver gjetning, som foretas ved at det vises en slik innlesningsboks:

skal brukeren få beskjed om gjetningen er større enn eller mindre enn det ukjente tallet, som i følgende eksempel:

Input tallet bør feilhåndteres ved konverteringen til tall (bruk try/catch).
Så skal ny innlesing foretas. Slik skal det fortsette inntil spilleren har gjettet riktig.
Da skal det gis beskjed om dette sammen med antall gjetninger som ble foretatt, som i følgende eksempel:

Programmet skal organiseres i form av klassen Tallspill som er skissert nedenfor.
*/

import static javax.swing.JOptionPane.*;

class Tallspill{
    public int nyttTall(){
        // Trekker og returnerer et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201),
        // som gir verdier mellom 0 og 200
        int slumptall = (int)(Math.random()*4);
        return slumptall;
    }
    public void visMelding(String melding){
        // Viser parameterens innhold i en meldingsboks.
        melding = "Jeg tenker på et tall mellom 0 og 200. Prøv å gjette på tallet: ";
    }
    private void forLite(int tall){
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
        /*if (tall < nyttTall()){*/
            showMessageDialog(null, tall+" er for lite, prøv igjen.");
    }
    private void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
        /*if (tall > nyttTall()){ */
            showMessageDialog(null,tall+" er for stort, prøv igjen.");
    }
    public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
        /* if (gjetning == nyttTall()){*/
            showMessageDialog(null,gjetning+" er riktig! \n Du gjettet riktig på "+antall+" forsøk.");
    }
    public void kj�rSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */

        int tall = nyttTall();
        int gjetning;
        String melding;
        int antall = 0;
        boolean gjetningRiktig = false;

        while(!gjetningRiktig){
            antall++;
            melding = showInputDialog("Jeg tenker på et tall mellom 0 og 200.\nPrøv å gjette på tallet: ");
            try{
                gjetning = Integer.parseInt(melding);
            }
            catch (Exception e){
                gjetning = 0;
            }
            if(gjetning > tall){
                forStort(gjetning);
            }
            else if(gjetning < tall){
                forLite(gjetning);
            }
            else if (gjetning == tall){
                avsluttRunde(gjetning,antall);
                gjetningRiktig = true;
            }
        }
        System.exit(0);
    }
    public static void main(String[] args) {
    	Tallspill runde1 = new Tallspill();
        runde1.kj�rSpill();
	}
}


