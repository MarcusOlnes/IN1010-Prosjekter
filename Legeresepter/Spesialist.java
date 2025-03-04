public class Spesialist extends Lege implements Godkjenningsfritak {

    String kontrollkode;
    
    public Spesialist(String n, String kontroll)
    {
        super(n);
        this.kontrollkode=kontroll;
    }

    @Override
    public String hentKontrollkode(){
        return kontrollkode;
    }

    @Override 
    public String toString()
    {
        return ("Denne legen heter "+this.navn+" og er en spesialist.");
    }

}
