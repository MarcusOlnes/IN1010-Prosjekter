public class Verden {

    public int genNr;
    public Rutenett rutenett;

    //konstruktør
    public Verden(int rader, int kolonner){
        this.genNr=0;


        this.rutenett = new Rutenett(rader, kolonner);
        this.rutenett.fyllMedTilfeldigeCeller();
        this.rutenett.kobleAlleCeller();
    }

    public void tegn(){
        rutenett.tegnRutenett();
        System.out.println("Generasjon nummer " + genNr+".");
        System.out.println("Det er "+rutenett.antallLevende()+ " levende celler.");
        System.out.println(""); //litt avstand er aldri feil
    }

     /* henter cellene i rutenettet ved metoden hentCellene jeg har skrevet i rutenett
    for index-cellen. Deretter kjøres metoden tell levende naboer og oppdaterer status:*/
    public void oppdatering(){
        Celle[][] alleCellene = rutenett.hentCellene(); 

    //to doble for looper, for å unngå feilaktig oppdatering av celler, 
    //etter at statusen har blitt endret. Derfor kjører jeg metodene tellLevendeNaboer
    //og oppdaterStatus i forksjellige løkker
        for (int i=0; i<alleCellene.length; i++){
            for(int j=0; j<alleCellene[i].length; j++){
                alleCellene[i][j].tellLevendeNaboer();                
            }}

        for (int i=0; i<alleCellene.length; i++){
            for(int j=0; j<alleCellene[i].length; j++){
                alleCellene[i][j].oppdaterStatus();}}
         //oppdaterer generasjonstelleren
         genNr++;
           
        }

    }


