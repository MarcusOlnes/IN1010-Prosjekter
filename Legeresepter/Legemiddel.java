public abstract class Legemiddel {
    public final String navn;
    int pris;
    public final double mengdeVirkestoff;

    public final int id;
    private static int teller=0;

    public Legemiddel(String n, int p, double mv)
    {
        this.navn=n;
        this.pris=p;
        this.mengdeVirkestoff=mv;
        this.id=teller;
        teller++;
    }

    public int hentPris()
    {
        return pris;
    }

    public void settNyPris(int nypris)
    {
        this.pris=nypris;
    }
    public int hentID()
    {
        return id;
    }

    @Override 
    public String toString()
    {
        return ("Legemiddel: "+navn+" koster"+pris+". Mengde virkestoff er " +mengdeVirkestoff+" og IDen er "+id);

    }

}

