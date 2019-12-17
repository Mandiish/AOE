import java.util.*;

class menuGame
{
    Scanner sc = new Scanner(System.in);
    private String b = "";
    private String s = "";
    private String p = "";
    private int tribe = 0;
    private Topography topo;

    public menuGame(String b, String s, String p)
    {
        this.b = b;
        this.s = s;
        this.p = p;   
        this.tribe = tribe;        
        ValidGame(tribe);
    }
    
    public boolean ValidGame(int tribe)
    {
        System.out.println("Choose a tribe:\n 1 " + b + "\n 2 " + s + "\n 3 " + p);    
        tribe = sc.nextInt();
        if (tribe == 1 || tribe == 2 || tribe ==  3)
        {
            topo = new Topography(b, s, p, tribe);
            return true;
        }
        
        else
        {
            System.out.println("No such tribe.");
            return false;
        }
    }
    
    public void setTribe(int tribe)
    {
        this.tribe = tribe;
    }
    
    public int getTribe()
    {
        return this.tribe;
    }
    
    public void setB(String b)
    {
        this.b = b;
    }
    
    public String getB()
    {
        return this.b;
    }
    
    public void setS(String s)
    {
        this.s = s;
    }
    
    public String getS()
    {
        return this.s;
    }
    
    public void setP(String p)
    {
        this.p = p;
    }
    
    public String getP()
    {
        return this.p;
    }
}
