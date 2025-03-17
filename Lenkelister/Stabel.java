class Stabel <E> extends Lenkeliste<E> {
  
	

    @Override
    public void leggTil(E x)  {
        Node nyNode = new Node(x, første);//x er dataen
        første=nyNode;

        antall++;
    }
}

