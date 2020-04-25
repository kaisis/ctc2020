import java.util.Scanner;


public class lounasbotti {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("");
        System.out.println("===============");
        System.out.println("LOUNASBOTTI 1.0");
        System.out.println("===============");
        System.out.println("");

        System.out.println("Mitä tänään syötäisiin? Kirjoita liha, kala, tai kana.");
        
        String prode = lukija.nextLine();
        System.out.println("");
           

        if (prode.equals("liha")) {
            System.out.println("Punainen liha on epäterveellistä ja epäeettistä. Keksi itse miten sen valmistat.");
            System.out.println("Hyvästi moukka!");
            System.out.println("");
            System.exit(0);
                   
            }
        else if (prode.equals("kana"))  {
            System.out.println("Hienoa, liha onkin moukille.");
            System.out.println("Kanaa riisillä vai salaatilla? r/s");

            String lisukeKana = lukija.nextLine();
            
            while (!lisukeKana.equals("s") && !lisukeKana.equals("r"));            
                   
            if (lisukeKana.equals("r")) {                
                System.out.println("");
                System.out.println("Juotko jotain?");
                String juoma = lukija.nextLine(); 
                
                System.out.println("");
                System.out.println("Tilasit kanaa, lisukkeena riisi ja juomana " + juoma + ".");

                System.out.println("");
                System.out.println("Hyvää ruokahalua!");
                System.out.println("");

                System.exit(0);

                } else {
                    System.out.println("");
                    System.out.println("Juotko jotain?");
                    String juoma = lukija.nextLine(); 

                    System.out.println("");
                    System.out.println("Tilasit kanaa, lisukkeena salaatti ja juomana " + juoma + ".");

                    System.out.println("");
                    System.out.println("Hyvää ruokahalua!");
                    System.out.println("");
    
                    System.exit(0);
                
            }}

        else if (prode.equals("kala")) {
            System.out.println("Hienoa, liha onkin moukille.");
            System.out.println("Kalaa muusilla vai parsalla? m/p");
    
            String lisukeKala = lukija.nextLine();
                
            while (!lisukeKala.equals("m") && !lisukeKala.equals("p"));            
                       
            if (lisukeKala.equals("m")) {                
                System.out.println("");
                System.out.println("Juotko jotain?");
                String juoma = lukija.nextLine(); 
                
                System.out.println("");
                System.out.println("Tilasit kalaa, lisukkeena muusi ja juomana " + juoma + ".");
                
                System.out.println("");
                System.out.println("Hyvää ruokahalua!");
                System.out.println("");
                System.exit(0);
    
                } else {
                System.out.println("");
                System.out.println("Juotko jotain?");
                String juoma = lukija.nextLine(); 

                System.out.println("");
                System.out.println("Tilasit kalaa, lisukkeena parsa ja juomana " + juoma + ".");
                }
                System.out.println("");
                System.out.println("Hyvää ruokahalua!");
                System.out.println("");

                System.exit(0);
                   
        }

    }}
 


        
	