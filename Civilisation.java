
public class Civilisation {

    private String francais; 
    private String anglais;
    private String espagnol;

    public Civilisation(String francais, String anglais, String espagnol) {
        this.francais = francais;
        this.anglais = anglais;
        this.espagnol = espagnol;
    }

    public String getFrancais() {
        return this.francais;
    }

    public void setFrancais(String francais) {
        this.francais = francais;
    }

    public String getAnglais() {
        return this.anglais;
    }

    public void setAnglais(String anglais) {
        this.anglais = anglais;
    }

    public String getEspagnol() {
        return this.espagnol;
    }

    public void setEspagnol(String espagnol) {
        this.espagnol = espagnol;
    }

    @Override
    public String toString() {
        return "Civilisation [Anglais=" + anglais + ", Espagnol=" + espagnol + ", Francais=" + francais + "]";
    }
}

