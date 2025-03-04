
public class Vanlig extends Legemiddel {

    public Vanlig(String n, int p, double mv)
    {
        super(n,p,mv);
    }
    @Override 
    public String toString()
    {
        return ("Vanlig legemiddel: "+navn+" koster "+pris+". Mengde virkestoff er " +mengdeVirkestoff+" og IDen er "+id+".");

    }
}
