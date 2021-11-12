public class Mot {
    private String mot;
    private int cpt=0;
    public Mot(String m){
        this.mot=m;
        this.nouvelleOccurrence();

    }
    public void nouvelleOccurrence(){
        this.cpt++;
    }
    public int getOccurrence(){
        return this.cpt;
    }
    public String getMot(){
        return this.mot;
    }
}

