import java.util.*;


public class Batiments {

    private String wood;
    private String stone;
    private String glass;
    
    public batiments(String wood) 
    {
        this.wood = wood;
        this.stone = stone;
        this.glass = glass;
    }

    public void setWood(String wood)
    {
        this.wood = wood;
    }
    
    public String getWood()
    {
        return this.wood;
    }
    
    public void setStone(String stone)
    {
        this.stone = stone;
    }
    
    public String getStone()
    {
        return this.stone;
    }
    
    public void setGlass(String glass)
    {
        this.glass = glass;
    }
    
    public String getGlass()
    {
        return this.glass;
    }
    
    @Override
    public String toString() {
        return "Batiments composition :\n" + " wood " + wood + " stone " + stone + " glass " + glass + ".";
    }    
}

