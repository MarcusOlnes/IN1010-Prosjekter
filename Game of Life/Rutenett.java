public class Rutenett {
    
    public int antRader;
    public int antKolonner;
    public Celle[][] rutene;

    //konstruktør
    public Rutenett(int rader, int kolonner){
        this.antRader=rader;
        this.antKolonner=kolonner;
        this.rutene = new Celle[rader][kolonner];
    }

    //metode for å opprette en instans av klassen Celle og legge den inn på en plass i den todimensjonale array-en rutene 
    public void lagCelle(int rad, int kol){
        Celle nyCelle=new Celle();

        //en tredjedels sjanse for at cellen blir levende eller ikke
        if  (Math.random() <=0.3333){
            nyCelle.settLevende();
        }

        //legger inn nyCelle inn i rutene
        rutene[rad][kol]=nyCelle;
    }

    //Fyller rutenettet med tilfeldige celler
    public void fyllMedTilfeldigeCeller(){
        for (int i=0; i<rutene.length; i++ ){
            for (int j=0; j<rutene[i].length; j++ ){
                lagCelle(i,j);
            }
        }
    }
    //metode for å hente ut en celle i arrayen
    public Celle hentCelle(int rad, int kol){

        //for å returnere null ved ugyldig verdi, både med for store og med verdier under 0
        if (rad>=antRader || rad<0){
            return null;}
        else if (kol>=antKolonner || kol<0){
            return null;}
        //for å hente ut riktig objekt hvis verdien er gyldig
        else{
            return rutene[rad][kol];
        }
    }

    //tegner rutenettet og de tilhørende cellene.
    public void tegnRutenett(){
        for (int i=0; i<rutene.length; i++ ){
            System.out.println(""); //skaper avstand mellom den nøstede arrayen og den neste
            for (int j=0; j<rutene[i].length; j++ ){
                System.out.print(rutene[i][j].hentStatusTegn()); //printer ut cellens status
            }
            

        }
        System.out.println(""); //skaper litt avstand mellom tegningen, og videre handling
    }

    /*Metode for å sette naboer lik hverandre. 
    Litt hardkodet metode, så vet jeg har potensiale 
    til å endre dette mer effektivt:*/
    public void settNaboer(int rad, int kol){
        Celle originalCelle = hentCelle(rad, kol);

        //Hvert koordinat rundt cellen:
        Celle nabo1 = hentCelle(rad-1,kol-1);
        Celle nabo2 = hentCelle(rad, kol-1);
        Celle nabo3 = hentCelle(rad+1, kol-1);
        Celle nabo4= hentCelle(rad+1, kol);
        Celle nabo5= hentCelle(rad+1, kol+1);
        Celle nabo6= hentCelle(rad, kol+1);
        Celle nabo7= hentCelle(rad-1, kol+1);
        Celle nabo8= hentCelle(rad-1, kol);

        //Legger til cellen som nabo hvis det er en celle, og ikke verdien null.
        if (nabo1 != null){
            originalCelle.leggTilNabo(nabo1);}
        if (nabo2 != null){
            originalCelle.leggTilNabo(nabo2);}
        if (nabo3 != null){
            originalCelle.leggTilNabo(nabo3);}
        if (nabo4 != null){
            originalCelle.leggTilNabo(nabo4);}
        if (nabo5 != null){
            originalCelle.leggTilNabo(nabo5);}
        if (nabo6 != null){
            originalCelle.leggTilNabo(nabo6);}
        if (nabo7 != null){
            originalCelle.leggTilNabo(nabo7);}
        if (nabo8 != null){
            originalCelle.leggTilNabo(nabo8);}
    }
    //metode for å koble alle cellene sammen
    public void kobleAlleCeller(){
        for (int i=0; i<rutene.length; i++){
            for (int j=0; j<rutene[i].length; j++){
                settNaboer(i,j);
            }
        }
    }

    public int antallLevende(){
        int teller=0;

        for (int i=0; i<rutene.length;i++){
            for (int j=0; j<rutene[i].length;j++){
                if (rutene[i][j].erLevende()){
                    teller+=1;
                }
            }
        }
        return teller;
    }

    //metode for å returnere arrayen med cellene så jeg har tilgang i verden-filen

    public Celle[][] hentCellene(){
        return rutene;
    }
}
