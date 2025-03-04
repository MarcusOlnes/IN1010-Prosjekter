public class BlaaResept extends Resept {
    public BlaaResept(Legemiddel l,Lege u, int p, int r)
    {
        super(l,u,p,r); //legemiddel, utskrivendeLege, pasientID, reit
    }

    @Override
    public String farge()
    {
        return("Fargen på resepten er blå.");
    }

    @Override
    public int prisAABetale()
    {
        double prisen=(legemiddel.hentPris()*0.25);
        int pris = (int) Math.round(prisen);
        return(pris);
    }

    
    public String toString()
    {
        return ("Dette er en Blåresept. "
            + "Info om legemiddelet er: " 
            + legemiddel.toString() + " Pasienten sin ID er "+pasientID
            +". Reit er "+ reit+"."

        
        );
    }

}

