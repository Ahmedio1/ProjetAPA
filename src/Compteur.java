import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public abstract class Compteur {
    private String nomFichier;
    private int nbMots;
    private int nbMots5;
    public abstract void addOccurrence(String mot);
    public Compteur (String nomFichier){
        try {
            nbMots=0;
            nbMots5=0;
        Scanner scanner=new Scanner(new File(nomFichier));
        // On boucle sur chaque ligne
            scanner.useLocale(Locale.US);
            scanner.useDelimiter(",|\\-|\\.|\\!|\\(|\\)|\\'|\\\"|\t|\n|\r\n|\s");
            String mot;
            while (scanner.hasNext()){
                nbMots++;
                mot=scanner.next();
                mot.toLowerCase();
                if (mot.length()>=5){
                    nbMots5++;
                    addOccurrence(mot);
                }
            }
        scanner.close();
    }
    catch (Exception e){
        e.printStackTrace();
        System.exit(-1);
    }}
}