public class Celle {
    
    public boolean levende; //Levende er true, og død er false. Oppretter alltid nye celler som false
    public int antNaboer;
    public int antLevendeNaboer;
    public Celle[] naboer;

    //konstruktør
    public Celle (){

        this.levende=false;
        this.naboer= new Celle[8]; //array med plass til 8 naboer
        this.antNaboer=0;
        this.antLevendeNaboer=0;
        
    }

    //metode for å endre status på levende til false, altså død
    public void settDoed(){
        levende=false;
    }

    //metode for å endre status på levende til true, altså at cellen er levende
    public void settLevende(){
        levende=true;
    }

    //metode som returnerer cellen sin status
    public boolean erLevende(){
        if (levende==true){
            return(true); //returneres hvis variabelen levende har verdien true
        }
        else{
            return(false); //returneres hvis variabelen levende har verdien false
        }
    }

    //metode som returnerer en char-verdi som er en tegnrepre-sentasjon av cellens status
    public char hentStatusTegn(){
        if (levende==true){
            return('O');
        }
        else {
            return('.');
        }
    }
    //metode for å legge til celle elementer som naboer i arrayen
    public void leggTilNabo(Celle nabo){

        for (int i=0; i<naboer.length; i++ ){
            if (naboer[i]==null){ //sjekker om indeksen i arrayen er tom
                naboer[i]=nabo; //hvis den er tom replacer vi denne med nabocellen, slik overskriver de ikke hverandre
                antNaboer++;
                break;//for at ikke resten av arrayen skal bli fykt opp med samme celler
            }
            
            }
        }
        
    public void tellLevendeNaboer(){

        antLevendeNaboer=0;

        int teller=0; //følger med på hvor mange av naboene i arrayen er levende

        for (int i=0; i<naboer.length; i++){
            if (naboer[i]!=null){ //for å unngå NullPointerException ved at tomme plasser får metoden erLevende kjørt på seg
                if (naboer[i].erLevende()==true){
                    teller+=1;
                    }
            }
            }
        antLevendeNaboer=teller; //oppdaterer antall levende naboer til telleren
    }

    public void oppdaterStatus() {
        // Kjører bare hvis cellen er levende
        if (levende) {
            // dør hvis det er mindre enn 2 levende naboer
            if (antLevendeNaboer < 2) {
                levende = false;
            }
            // dør hvis det er mer enn 3 levende naboer
            else if (antLevendeNaboer > 3) {
                levende = false;
            }
            // Lever videre hvis det er 2 eller 3 levende naboer
        } 
        //Kjører bare hvis cellen er død ( før vi startet sjekken).
        else { 
            // Cellen blir levende igjen hvis det er nøyaktig 3 levende naboer
            if (antLevendeNaboer == 3) {
                levende = true;
            }
        }
    }
 }


