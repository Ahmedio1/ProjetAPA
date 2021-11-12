import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class CompteurTableau extends Compteur {
    public final int TAILLE_INITIALE = 100;
    private Mot[] elements;
    private int der=-1;
    public void addOccurrence(String mot) {
        int taille=TAILLE_INITIALE;
        Mot[] element1 = elements;
        Mot[] tmp = new Mot[taille];
        if(der==taille){
            taille*=2;
            Mot[] tab = new Mot[taille];
            for(int i=0;i<der;i++){
                tab[i]=element1[i];
            }
            tmp = new Mot[taille];
            for(int i=0;i<der;i++){
                tmp[i]=tab[i];
            }
            tmp[der]=new Mot(mot);
            der++;

        }
        else{elements[der]=new Mot((mot));
        der++;}
        if(der <= TAILLE_INITIALE){
            for(int i=0;i<der;i++){
            System.out.println(element1[i].getOccurrence()+"" + elements[i].getMot());
        }}
        else{
            for(int i=0;i<der;i++) {
                System.out.println(tmp[i].getOccurrence() + "" + tmp[i].getMot());

                }
            }
    }
    public CompteurTableau (String fichierTexte) {
        super(fichierTexte);
        System.out.println("Fichier :"+fichierTexte);
        System.out.println("Nombre de mot :"+ der);
        System.out.println("Nombre de mot > 4 :"+ 0);
        System.out.println("------------------------");


    }
}