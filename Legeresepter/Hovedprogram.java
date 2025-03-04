public class Hovedprogram {
    public static void main(String[] args)
    {
        //må fylle ut disse
        
        Narkotisk narkotisk = new Narkotisk("Narkose", 1000, 0.1, 50);
        Vanedannende vanedannende = new Vanedannende("Vanedannende", 1100, 0.8, 51);
        Vanlig vanlig = new Vanlig("Vanlig", 100, 0.5);

        Lege lege = new Lege("Marcus");
        Spesialist spesialist = new Spesialist("Overlege Marcus", "godkjent");

        BlaaResept blaa = new BlaaResept(vanlig, lege, 0, 2);
        MilitaerResept militaer = new MilitaerResept(vanedannende, lege, 2);
        PResept PResept = new PResept(narkotisk, lege, 3, 1);

        

        System.out.println(narkotisk+"\n"+vanedannende+"\n"+vanlig+"\n"+blaa+"\n"+militaer+"\n"+PResept+"\n"+lege+"\n"+spesialist);

         
    }
}
