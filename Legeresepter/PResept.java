public class PResept extends HvitResept {
    
    public PResept(Legemiddel l,Lege u, int p, int r)
    {
        super(l,u,p,r);
    }
    @Override
    public int prisAABetale()
    {
        int prisen=(legemiddel.hentPris()-108);

        if(prisen<0)
        {
            prisen=0;
        }
        return  (prisen);
    }
    
    public String toString()
    {
        return ("Dette er en Presept. "
            + "Info om legemiddelet er: " 
            + legemiddel.toString() + " Pasienten sin ID er "+pasientID
            +". Reit er "+ reit+"."

        
        );
    }
}



