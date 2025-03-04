public class MilitaerResept extends HvitResept {
    
    public MilitaerResept(Legemiddel l,Lege u, int p) //legemiddel, utskrivendeLege, pasientID, reit
    {
        super(l,u,p, 3);//reit skal alltid være tre for militær-resepter
    }

    @Override
    public int prisAABetale()
    {
        int prisen=0;
        return(prisen);
    }

    public String toString()
    {
        return ("Dette er en militærresept. "
            + "Info om legemiddelet er: " 
            + legemiddel.toString() + " Pasienten sin ID er "+pasientID
            +". Reit er "+ reit+"."
        );
    }

}
