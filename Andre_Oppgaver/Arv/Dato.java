package Andre_Oppgaver.Arv;

public class Dato {
    private int dag, m�ned, �r;

    public Dato( int dag, int m�ned, int �r ) {
      this.dag = dag;
      this.m�ned = m�ned;
      this.�r =�r;
    }

    private static String m�nedsnavn( int mnd ) {
      String[] navn = { "januar", "februar", "mars", "april", "mai", 
        "juni", "juli", "august", "september", "oktober", "november", 
        "desember" };
      if ( mnd > 0 && mnd < 13 )
        return navn[ mnd - 1 ];
      else
        return "ukjent m�ned";
    }
    
    public String toString(){
    	// lag denne
		return null;
    }
}
