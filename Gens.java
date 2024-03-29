import java.util.*;

class Gens {

    private String pecheur; 
    private String chasseur;
    private String cueilleur;
    private String soldier;

    public Gens(String pecheur, String chasseur, String cueilleur) {
        this.pecheur = pecheur;
        this.chasseur = chasseur;
        this.cueilleur = cueilleur;
    }

    public String getPecheur() {
        return this.pecheur;
    }

    public void setPecheur(String pecheur) {
        this.pecheur = pecheur;
    }

    public String getChasseur() {
        return this.chasseur;
    }

    public void setChasseur(String chasseur) {
        this.chasseur = chasseur;
    }

    public String getCueilleur() {
        return this.cueilleur;
    }

    public void setCueilleur(String cueilleur) {
        this.cueilleur = cueilleur;
    }

    public String getSoldier() {
        return soldier;
    }

    public void setSoldier(String soldier) {
        this.soldier = soldier;
    }
    @Override
    public String toString() {
        return "Gens [chasseur=" + chasseur + ", cueilleur=" + cueilleur + ", pecheur=" + pecheur + ", soldier=" + soldier + "]";
    }
}
