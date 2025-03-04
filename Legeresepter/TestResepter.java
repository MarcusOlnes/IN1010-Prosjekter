public class TestResepter {

    //testfunksjonene her
    public static boolean testID(Resept resept, int forventaID)
    {
        if(resept.hentId()==forventaID)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean testPris(Resept resept, int forventaPris)
    {
        if (resept.prisAABetale()==forventaPris)
        {   
            return true;
        }
        return false;
    }

    public static boolean testReit(Resept resept, int forventaReit)
    {
        if(resept.hentReit()==forventaReit)
        {
            return true;
        }
        return false;
    }


    
    public static void main(String[] args)
    {
        //Legemiddel-objekter
        Narkotisk narkotisk = new Narkotisk("Narkose", 1000, 0.1, 50);
        Vanlig vanlig = new Vanlig("Antibiotika", 500, 0.5);
        Vanedannende vanedannende = new Vanedannende("Morfin", 2000, 0.05, 100);

        //Lege-objekt
        Lege lege= new Lege("Dr. Arne con Carne");

        //Resept-objekter
        BlaaResept blaaresept = new BlaaResept(vanlig, lege, 0, 2);
        MilitaerResept militaer = new MilitaerResept(vanedannende, lege, 2);
        PResept prresept = new PResept(narkotisk, lege, 3, 1);

        //testfunksjoner

        System.out.println("Skal nå teste de spesifike egenskapene implementert for Militærresept: ");

        System.out.println("Tester nå at Reit er for klassen stemmer: ");

        if (testReit(militaer, 3))
        {
            System.out.println("Reit-test 1 til militærklassen er korrekt. ");
        }
        else
        {
            System.out.println("Reit-test 1 til militærklassen er feil. ");
        }
        militaer.bruk(); //da skal Reit bli 2. Sjekker dette så i neste test.
        if (testReit(militaer, 2))
        {
            System.out.println("Reit-test 2 til militærklassen er korrekt. ");
        }
        else
        {
            System.out.println("Reit-test 2 til militærklassen er feil. ");
        }

        System.out.println("\n");
        System.out.println("Skal nå teste de spesifike egenskapene implementert for PRresept: ");

        System.out.println("Tester nå at prisen er korrekt - altså at rabatten er riktig implementert:");
        
        if(narkotisk.hentPris()-108==prresept.prisAABetale())
        {
            System.out.println("Test av pris for PResept er korrekt.");
        }
        else
        {
            System.out.println("Test av pris for PResept er ikke korrekt");
        }

        System.out.println("\n");
        System.out.println("Skal nå teste de spesifike egenskapene implementert for Blåresept: ");

        System.out.println("Tester nå at prisen er korrekt - altså at rabatten er riktig implementert (75%):");

        if(vanlig.hentPris()*0.25==blaaresept.prisAABetale())
        {
            System.out.println("Test av pris for blåresept er riktig.");
        }
        else
        {
            System.out.println("Test av pris for blåresept er feil.");  
        }
    }
}
