public abstract class HvitResept extends Resept { //må vurdere å endre denne til abstract

    public HvitResept(Legemiddel l,Lege u, int p, int r) //legemiddel, utskrivendeLege, pasientID, reit
    {
        super(l,u,p,r);
    }
    @Override
    public String farge()
    {
        return("Fargen på resepten er hvit.");
    }

    @Override
    public int prisAABetale()
    {
        int prisen=(legemiddel.hentPris());
        return(prisen);
    }

    
    public String toString()
    {
        return ("Dette er en hvit resept. \n"
            + "Info om legemiddelet er: n" 
            + legemiddel.toString() + ". Pasienten sin ID er"+pasientID
            +". Reit er "+ reit+"."

        
        );
    }

}

