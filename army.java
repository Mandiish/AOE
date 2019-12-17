public class army {
    private String sword;
    private String bow;
    private String catapult;

    public army(String sword, String bow, String catapult) {
        this.sword = sword;
        this.bow = bow;
        this.catapult = catapult;
    }

    public String getSword() {
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    public String getBow() {
        return bow;
    }

    public void setBow(String bow) {
        this.bow = bow;
    }

    public String getCatapult() {
        return catapult;
    }

    public void setCatapult(String catapult) {
        this.catapult = catapult;
    }

    @Override
    public String toString() {
        return "army [bow=" + bow + ", catapult=" + catapult + ", sword=" + sword + "]";
    }

}