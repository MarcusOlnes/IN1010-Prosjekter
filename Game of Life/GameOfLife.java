import java. util. Scanner; 
public class GameOfLife {
    
    public static void main(String[] args){

        //frivillig utvidelse for å la brukeren velge størrelse på spillbrettet via brukerinput
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn hvor mange rader du ønsker å ha på spillbrettet: ");
        String inputten=scanner.nextLine(); //må først lagre variabelen som en String, og så senere konvertere om
        int rad=Integer.parseInt(inputten);
        
        System.out.println("Hvor mange kolonner ønsker du på spillbrettet?");
        String inputten2=scanner.nextLine();
        int kol=Integer.parseInt(inputten2);

        scanner.close();

        Verden verden = new Verden(rad,kol);
        verden.tegn();
        for (int i=0;i<3;i++){
            verden.oppdatering();
            verden.tegn();
        }

    }
}
