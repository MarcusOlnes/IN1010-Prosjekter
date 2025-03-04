public abstract class Resept 
{
    Legemiddel legemiddel;
    Lege utskrivendeLege;
    int pasientID;
    int reit;


    public Resept(Legemiddel l,Lege u, int p, int r )
    {
        this.legemiddel=l;
        this.utskrivendeLege=u;
        this.pasientID=p;
        this.reit=r;
    }

public int hentId()
{
    return pasientID;
}
public Legemiddel hentLegemiddel()
{
    return legemiddel;
}
public Lege hentLege()
{
    return utskrivendeLege;
}
public int hentPasientId()
{
    return pasientID;
}
 public int hentReit()
 {
    return reit;
 }

 public boolean bruk()
 {
    if (reit<1)
    {
        reit=0;
        return false;
    }
    else
    {
        reit-=1;
        return true;
    }
 }

 abstract public String farge();
 /* 
 {
    if (farge=="Blå")
    {
        return ("Blå");//Returnerer reseptens farge, enten hvit eller blå.
    }
    else
    {
        return("Hvit");
    }
 }
 */
 abstract public int prisAABetale();


}
