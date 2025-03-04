public class Narkotisk extends Legemiddel {

    public final int styrke;

    public Narkotisk(String n, int p, double mv, int s)
    {
        super(n,p,mv);

        this.styrke=s;

    }
    @Override 
    public String toString()
    {
        return ("Narkotisk legemiddel: "+navn+" koster "+pris+". Mengde virkestoff er " +mengdeVirkestoff+" og styrken er "+ styrke+". IDen er "+id+".");
    }

}


