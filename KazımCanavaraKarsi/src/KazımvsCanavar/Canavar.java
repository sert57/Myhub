package KazımvsCanavar;

import java.util.ArrayList;

public class Canavar 
{
    public int x,y,hP,dmg;
    public static ArrayList<Canavar> cL=new ArrayList<>();
    public Canavar(int x,int y) 
    {
        this.x = x;
        this.y = y;
        hP = (int)(50 + Math.random() * 21);
        dmg = (int)(15 + Math.random() * 11);
        
        System.out.println("M : "+hP+"/"+dmg+" @"+x+","+y+" Oluşturuldu");
        
    }

    public Canavar() {
    }
    
    public static void setMonsters()
    {
        for (int i = 0; i < App.seviye * 2; i++) 
        {
            int x = (int)(Math.random() * App.seviye);
            int y = (int)(Math.random() * App.seviye);
            
            if (isLocationAvailable(x, y))
            {
                Canavar c = new Canavar(x, y);
                cL.add(c);
                
            }
        }
    }
    
    public static boolean isLocationAvailable(int x, int y)
    {
        // Oyuncu Noktası
        if (x == 0 && y == 0) return false;
        // Shop Noktası
        if (x == App.seviye/2 && x == y) return false;
        
        // Su Ana Kadar Olusturdugun Canavarların Konumlarını Kontrol Et
        for (Canavar canavar : cL)
        {
            if (canavar.x == x && canavar.y == y)
                return false;
        }
        
        return true;
    }
  

    public String toString() 
    {
        return "M";
    }
 
}
