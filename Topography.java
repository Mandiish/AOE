import java.util.*;

class Topography
{
    private int[] topo = new int[16];
    private int water = 0;
    private int mountain = 0;
    private int green = 0;
    private int soil = 0;
    private int tribe = 0;
    private String b = "";
    private String s = "";
    private String p = "";
    
    public Topography(String b, String s, String p, int tribe)
    {
        this.b = b;
        this.s = s;
        this.p = p;     
        this.tribe = tribe;
        this.topo = topo;
        waterSide(tribe, b);
        mountainSide(tribe, s);
        dryLand(tribe, p);
    }
    
    public void gen(int water, int mountain, int green, int soil)
    {
        Random r = new Random();
        String fin = "";
        this.topo = topo;
        
        for(int i = 0; i < topo.length; i++)
        {
            topo[i] = r.nextInt(4);            
            fin += "[" + topo[i] + "]";
        }
        System.out.println(fin);
    }
    
    public void waterSide(int tribe, String b)
    {
        if (tribe == 1)
        {
            this.water = 5;
            this.mountain = 0;
            this.green = 8;
            this.soil = 3;
            this.topo = topo;
            System.out.println("You chose " + b + ".");
            gen(water, mountain, green, soil);
        }
    }
    
    public void mountainSide(int tribe, String s)
    {
        if (tribe == 2)
        {
            this.water = 2;
            this.mountain = 8;
            this.green = 6;
            this.soil = 0;
            this.topo = topo;
            System.out.println("You chose " + s + ".");
            gen(water, mountain, green, soil);
        }
    }
    
    public void dryLand(int tribe, String p)
    {
        if (tribe == 3)
        {
            this.water = 0;
            this.mountain = 4;
            this.green = 4;
            this.soil = 8;
            this.topo = topo;
            System.out.println("You chose " + p + ".");
            gen(water, mountain, green, soil);
        }
    }

    public void setTopography(int[] topo)
    {
        this.topo = topo;
    }
    
    public int[] getTopography()
    {
        return this.topo;
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
    
    public void setWater(int water)
    {
        this.water = water;
    }
    
    public int getWater()
    {
        return this.water;
    }
    
    public void setMountain(int mountain)
    {
        this.mountain = mountain;
    }
    
    public int getMountain()
    {
        return this.mountain;
    }

    public void setGreen(int green)
    {
        this.green = green;
    }
    
    public int getGreen()
    {
        return this.green;
    }

    public void setSoil(int soil)
    {
        this.soil = soil;
    }
    
    public int getSoil()
    {
        return this.soil;
    }
}

