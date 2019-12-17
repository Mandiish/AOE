public class Animal {

    private String chat; 
    private String chien;
    private String cheval;
    private String tigre;
    private String mouton;
    private String loup; 
    private String requin;
    private String sanglier;

    public Animal(String chat, String chien, String cheval, String tigre, String mouton, String loup, String requin,
            String sanglier) {
        this.chat = chat;
        this.chien = chien;
        this.cheval = cheval;
        this.tigre = tigre;
        this.mouton = mouton;
        this.loup = loup;
        this.requin = requin;
        this.sanglier = sanglier;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getChien() {
        return chien;
    }

    public void setChien(String chien) {
        this.chien = chien;
    }

    public String getCheval() {
        return cheval;
    }

    public void setCheval(String cheval) {
        this.cheval = cheval;
    }

    public String getTigre() {
        return tigre;
    }

    public void setTigre(String tigre) {
        this.tigre = tigre;
    }

    public String getMouton() {
        return mouton;
    }

    public void setMouton(String mouton) {
        this.mouton = mouton;
    }

    public String getLoup() {
        return loup;
    }

    public void setLoup(String loup) {
        this.loup = loup;
    }

    public String getRequin() {
        return requin;
    }

    public void setRequin(String requin) {
        this.requin = requin;
    }

    public String getSanglier() {
        return sanglier;
    }

    public void setSanglier(String sanglier) {
        this.sanglier = sanglier;
    }

    @Override
    public String toString() {
        return "Animal [chat=" + chat + ", cheval=" + cheval + ", chien=" + chien + ", loup=" + loup + ", mouton="
                + mouton + ", requin=" + requin + ", sanglier=" + sanglier + ", tigre=" + tigre + "]";
    }

    


}
