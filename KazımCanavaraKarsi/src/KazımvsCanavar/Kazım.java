package KazımvsCanavar;

public class Kazım 
{
    public int x,y,hP=100,damage=20;

    public Kazım(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    
    
    
    public void move(char c)
    {
        
        
        switch (c)
            {
                case 'w' : case 'W' : 
                    if (y != 0)    y--; 
                    break;
                    
                case 's' : case 'S' : 
                    if (y != App.seviye - 1) y++;
                    break;
                    
                case 'a' : case 'A' : 
                    if (x != 0)    x--; 
                    break;
                    
                case 'd' : case 'D' : 
                    if (x != App.seviye - 1) x++;
                    break;
            }
        
    }

    public String toString() 
    {
        return "K";
    }
    
    
}
