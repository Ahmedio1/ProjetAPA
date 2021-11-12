public class CompteurTest extends CompteurTableau {

    public CompteurTest(String fichierTexte) {
        super(fichierTexte);
    }

    public void addOccurrence(String mot){
        System.out.println(mot);
    }
    public static void main(String[] args){
        if (
                args.length<1){ System.err.println("nom de fichier manquant");}
        else {

            CompteurTest c = new CompteurTest(args[0]);}
    }
}