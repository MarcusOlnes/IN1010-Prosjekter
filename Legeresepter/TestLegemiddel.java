class TestLegemiddel
{
      //definerer testmoder her:

      private static boolean testNavn(Legemiddel legemiddel, String n)
      {
          boolean sjekk= legemiddel.navn==n;
          return sjekk;
      }
  
      private static boolean testID(Legemiddel legemiddel, int forventaID)
      {
          boolean sjekk= legemiddel.hentID()==forventaID;
          return sjekk;
      }


      //går i gang med tester her:
  
    public static void main(String[] args)
    {

        System.out.println("Tester her klassen Narkose: ");

        System.out.println("I denne testen ønsker jeg å vite om navne-egenskapen er initalisert korrekt.");

        Narkotisk narkotisk = new Narkotisk("Narkose", 1000, 0.1, 50);
       

        if (testNavn(narkotisk, "Narkose")==true)
        {
            System.out.println("Navnetesten til Narkose-klassen var suksessfull.");
        }
        else
        {
            System.out.println("Navnetesten til Narkose-klassen feilet.");
        }

        System.out.println("I denne testen ønsker jeg å vite om id-egenskapen er initalisert korrekt.");
        Narkotisk narkotisk2= new Narkotisk("Narkose", 1001, 0.2, 40);

        /*if(testID(narkotisk, 0) && testID(narkotisk2, 1)==true)
        {
            System.out.println ("ID-test 1 til Narkose-klassen var suksessfull.");
        }
        else
        {
            System.out.println("ID-testen til narkose-klassen feilet.");
        }
            */

            if(testID(narkotisk, 0))
            {
                System.out.println ("ID-test 1 til Narkose-klassen var suksessfull.");
            }
            else
            {
                System.out.println("ID-test 1 til narkose-klassen feilet.");
            }
            if(testID(narkotisk2, 1))
            {
                System.out.println ("ID-test 2 til Narkose-klassen var suksessfull.");
            }
            else
            {
                System.out.println("ID-test 2 til narkose-klassen feilet.");
            }


        System.out.println("\n");
        System.out.println("Tester her klassen Vanedannende: ");
        System.out.println("I denne testen ønsker jeg å vite om navne-egenskapen er initalisert korrekt.");

        Vanedannende vanedannende = new Vanedannende("Vanedannende", 1100, 0.8, 51);
       

        if (testNavn(vanedannende, "Vanedannende")==true)
        {
            System.out.println("Navnetesten til Vanedannende-klassen var suksessfull.");
        }
        else
        {
            System.out.println("Navnetesten til Vanedannende-klassen feilet.");
        }

        System.out.println("I denne testen ønsker jeg å vite om id-egenskapen er initalisert korrekt.");
        Vanedannende vanedannende2= new Vanedannende("Vanedannende", 1200, 0.4, 49);

        if(testID(vanedannende, 0) )//&& testID(vanedannende2, 1)
        {
            System.out.println ("ID-test 1 til Vanedannende-klassen var suksessfull.");
        }
        else
        {
            System.out.println("ID-test 1 til Vanedannende-klassen feilet.");
        }

        if(testID(vanedannende2, 1) )
        {
            System.out.println ("ID-test 2 til Vanedannende-klassen var suksessfull.");
        }
        else
        {
            System.out.println("ID-test 2 til Vanedannende-klassen feilet.");
        }

        System.out.println("\n");
        System.out.println("Tester her klassen Vanlig: ");
        System.out.println("I denne testen ønsker jeg å vite om navne-egenskapen er initalisert korrekt.");

        Vanlig vanlig = new Vanlig("Vanlig", 100, 0.5);
       

        if (testNavn(vanlig, "Vanlig")==true)
        {
            System.out.println("Navnetesten til Vanlig-klassen var suksessfull.");
        }
        else
        {
            System.out.println("Navnetesten til Vanlig-klassen feilet.");
        }

        System.out.println("I denne testen ønsker jeg å vite om id-egenskapen er initalisert korrekt.");
        Vanlig vanlig2= new Vanlig("Vanlig", 120, 0.6);

        if(testID(vanlig, 0))
        {
            System.out.println ("ID-test 1 til Vanlig-klassen var suksessfull.");
        }
        else
        {
            System.out.println("ID-test 1 til Vanlig-klassen feilet.");
        }

        
        if(testID(vanlig2, 1))
        {
            System.out.println ("ID-test 1 til Vanlig-klassen var suksessfull.");
        }
        else
        {
            System.out.println("ID-test 1 til Vanlig-klassen feilet.");
        }



    }
}