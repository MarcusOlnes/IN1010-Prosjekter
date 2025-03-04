public class Lege {
String navn;
    public Lege(String n)
    {
        this.navn=n;
    }

    public String hentNavn()
    {
        return navn;
    }
    @Override 
    public String toString()
    {
        return ("Denne legen heter "+this.navn+".");
    }

}
