class Prioritetskø <E extends Comparable<E>> extends Lenkeliste<E> {

    @Override
    public void leggTil(E x) {
        Node nyNode = new Node(x, null);

        // Hvis listen er tom
        if (første == null) 
        {
            første = nyNode;
        } 
        else {
            Node pekeren = første;
            Node forrige = null;

            // Finn riktig posisjon å sette inn den nye noden
            while (pekeren != null && pekeren.data.compareTo(x) < 0) {
                forrige = pekeren;
                pekeren = pekeren.neste;
            }

            // Sett inn den nye noden på riktig posisjon
            if (forrige == null) {
                nyNode.neste = første;
                første = nyNode;
            }
             else {
                nyNode.neste = pekeren;
                forrige.neste = nyNode;
            }
        }

        antall++;
    }

}
