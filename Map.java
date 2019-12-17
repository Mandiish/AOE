import java.util.*;

class Map
{
    private int[][] map = new int[4][4];
    
    public Map()
    {
        this.map = map;
    }
    
    public String toString()
    {
        String M = "";
        for(int i = 0; i < topo.length; i++)
        {
            map[i] = i;
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
