import java.util.*;

class Nourriture {

    private String vegetaux; 
    private String viandes;
    private String poisson;
    private String alcool;

    public Nourriture(String vegetaux, String viande, String poisson, String alcool) {
        this.vegetaux = vegetaux;
        this.viande = viande;
        this.poisson = poisson;
        this.alcool = alcool;
    }

    public String getVegetaux() {
        return this.vegetaux;
    }

    public void setVegetaux(String vegetaux) {
        this.vegetaux = vegetaux;
    }

    public String getViande() {
        return this.viande;
    }

    public void setViande(String viande) {
        this.viande = viande;
    }

    public String getPoisson() {
        return this.poisson;
    }

    public void setPoisson(String poisson) {
        this.poisson = poisson;
    }

    public String getAlcool() {
        return this.alcool;
    }

    public void setAlcool(String alcool) {
        this.alcool = alcool;
    }

    @Override
    public String toString() {
        return "Nourriture [alcool=" + alcool + ", poisson=" + poisson + ", vegetaux=" + vegetaux + ", viande=" + viande
                + "]";
    }




}
