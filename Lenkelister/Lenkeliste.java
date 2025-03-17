abstract class Lenkeliste <E> implements Liste<E> {
    
    protected class Node {
	
        E data; //innholdet/dataen i noden
        Node neste; //referanse/peker til neste node i listen

        Node(E data, Node neste) 
        {
            this.data = data;
            this.neste=neste;
        }
        
    }
    public Node første;
    public int antall=0; //midlertidig antall

    @Override
    public String toString () {

        //her plusser vi på elementene til teksten
        String tekst="";
        Node iter=første;

        while (iter!=null){

            
            tekst+=iter.data;//+", ";
            
            iter=iter.neste;
        }

        	return tekst;  // ...
    }

    @Override
    public int størrelse() {
	return antall;  
    }

    @Override
    public void leggTil(E x) 
    {
        Node ny = new Node(x, null);
        //Hvis den første noden er null, 
        //betyr det at listen er tom. I så fall settes  første til den nye noden
         if (første == null) 
        {
            første = ny; 
        } 
        else 
        {
            
            Node peker = første;
            //Går gjennom lista helt til den finner noden som peker på null, altså slutten
            while (peker.neste != null) 
            {
                peker = peker.neste;
            }
            peker.neste = ny; //Da legges den nye noden til, bakerst i lista
        }
        antall++; //øke mengden på listen med 1
    }
    
    @Override
    public E hent() {
        if (første==null){throw new UgyldigListeindeks(-1);}

	return første.data;  // prøver å hente data i Node, fordi dette samsvarer med typen E som sto i skjelettet
    }

    @Override
    public E fjern() 
    {
        if (første==null){ throw new UgyldigListeindeks(-1);}

        E innholdetViReturnerer=første.data;//Mellomlagrer så vi returnerer dataen til den første vi senere fjerner
        
        
        første = første.neste;
        antall--;
        return innholdetViReturnerer;//returnerer dataen til første-elementet
    }
}
