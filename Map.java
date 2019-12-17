import java.util.*;

class Map extends Topography
{
    private int[][] map = new int[4][4];
    private Topography topo;
    
    public Map()
    {
        topo = new Topography();
        this.map = map;
    }
    
    public String toString()
    {
        String M = "";
        for(int i = 0; i < topo.length; i++)
        {
            map[i] = topo[i];
            M += "[" + map[i] + "]";
        }
        return M;
    }    
////////////////////////////SETTERS GETTERS////////////////////////////////////
    public void setMap(int[][] map)
    {
        this.map = map;
    }
    
    public int[][] getMap()
    {
        return this.map;
    }
}
