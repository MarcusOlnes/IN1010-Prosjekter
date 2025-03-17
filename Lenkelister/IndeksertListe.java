class IndeksertListe <E> extends Lenkeliste<E> {

   
    public void leggTil (int pos, E x) {
        if (!(0 <= pos && pos  <= størrelse())){
            throw new UgyldigListeindeks(-1);//sikrer lovlig verdi som posisjon
        } 


        Node nyNode = new Node(x, null);

        //Hvis det ikke finnes en første node, skal den nye noden være den første. 
        if (pos == 0) {
            nyNode.neste = første;
            første = nyNode;
            antall++;
            return;
        }

        int teller=0;
        Node pekeren=første;

        while (teller<pos-1){
            pekeren=pekeren.neste;
            teller++;
        }
        //setter den nye noden som den neste til noden med posisjon en foran, og denne noden sin tidligere neste som den nye innsatte noden sin neste
        Node nyNeste=pekeren.neste;

        pekeren.neste=nyNode;
        nyNode.neste=nyNeste;
        antall++;
    }

    
   
    public void sett (int pos, E x) {
        if (!(0 <= pos && pos  < størrelse())){
            throw new UgyldigListeindeks(-1);
        } 


        //Hvis det ikke finnes en første node, skal den nye noden være den første. 
        if (pos == 0) {
            første.data = x;
            første.neste=null;
            antall++;//bare her vi øker antall, hvis den ikke finnes fra før. Ellers gjør vi ikke dette, fordi vi fjerner en i tillegg til å legge til en
            return;
        }

        int teller=0;
        Node pekeren=første;

        while (teller<pos-1){
            pekeren=pekeren.neste;
            teller++;
        }
        pekeren.data=x;
    
    }

    public E hent (int pos) {
        if (!(0 <= pos && pos  < størrelse())){
            throw new UgyldigListeindeks(-1);
        } 

        //Hvis det ikke finnes en første node, skal den første noden returneres 
        if (pos == 0) {
            return første.data;
        }

        
        int teller=0;
        Node pekeren=første;

        //leder en peker til den gitte posisjonen som ønskes returnert
        while (teller<pos){
            pekeren=pekeren.neste;
            teller++;
        }

        //returnerer det pekeren peker på
        return pekeren.data;
    }

    public E fjern(int pos) {
        if (!(0 <= pos  && pos < størrelse())) {
            throw new UgyldigListeindeks(-1);
        }
    
        E data; // variabel for å lagre dataen som skal fjernes
    
        // Hvis posisjon er 0, fjern første node
        if (pos == 0) 
        {
            data = første.data; 
            første = første.neste; 
        } 
        else {
            Node pekeren = første;
            for (int teller = 0; teller < pos -1; teller++) {
                pekeren = pekeren.neste;
            }
    
           
            data = pekeren.neste.data;
            pekeren.neste = pekeren.neste.neste; 
        }
    
        antall--; 
        return data; // returner data fra den fjernede noden
    }
}
