public class Tribus {

    private String bretagne; 
    private String provence;
    private String savoie;

    public Tribus(String bretagne, String provence, String savoie) {
        this.bretagne = bretagne;
        this.provence = provence;
        this.savoyard = savoie;
    }

    public String getBretagne() {
        return this.bretagne;
    }

    public void setBretagne(String bretagne) {
        this.bretagne = bretagne;
    }

    public String getProvence() {
        return this.provence;
    }

    public void setProvence(String provence) {
        this.provence = provence;
    }

    public String getSavoie() {
        return this.savoie;
    }

    public void setSavoie(String savoie) {
        this.savoie = savoie;
    }

    @Override
    public String toString() {
        return "Tribus [bretagne=" + bretagne + ", provence=" + provence + ", savoie=" + savoie + "]";
    }    
}

