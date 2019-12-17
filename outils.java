public class outils {
    private String marteau;
    private String hache;
    private String pioche;
    private String faucille;
    private String canneApeche;
    private String panier;

    public outils(String marteau, String hache, String pioche, String faucille, String canneApeche, String panier) {
        this.marteau = marteau;
        this.hache = hache;
        this.pioche = pioche;
        this.faucille = faucille;
        this.canneApeche = canneApeche;
        this.panier = panier;
    }

    public String getMarteau() {
        return marteau;
    }

    public void setMarteau(String marteau) {
        this.marteau = marteau;
    }

    public String getHache() {
        return hache;
    }

    public void setHache(String hache) {
        this.hache = hache;
    }

    public String getPioche() {
        return pioche;
    }

    public void setPioche(String pioche) {
        this.pioche = pioche;
    }

    public String getFaucille() {
        return faucille;
    }

    public void setFaucille(String faucille) {
        this.faucille = faucille;
    }

    public String getCanneApeche() {
        return canneApeche;
    }

    public void setCanneApeche(String canneApeche) {
        this.canneApeche = canneApeche;
    }

    public String getPanier() {
        return panier;
    }

    public void setPanier(String panier) {
        this.panier = panier;
    }

    @Override
    public String toString() {
        return "outils [canneApeche=" + canneApeche + ", faucille=" + faucille + ", hache=" + hache + ", marteau="
                + marteau + ", panier=" + panier + ", pioche=" + pioche + "]";
    }
}