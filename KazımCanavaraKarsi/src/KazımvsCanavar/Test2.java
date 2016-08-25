package KazımvsCanavar;

import java.util.ArrayList;

public class Test2 
{
    public static int SIZE = 7;
    public static String[][] map = new String[7][7];
    public static ArrayList<Monster> mL = new ArrayList<>();
    
    public static void setMonsters()
    {
        for (int i = 0; i < SIZE * 2; i++) 
        {
            int rX = (int)(Math.random() * SIZE);
            int rY = (int)(Math.random() * SIZE);
            
            if (isLocationAvailable(rX, rY))
            {
                Monster m = new Monster(rX, rY);
                mL.add(m);
            }
        }
    }
    
    public static boolean isLocationAvailable(int x, int y)
    {
        // Oyuncu Noktası
        if (x == 0 && y == 0) return false;
        // Shop Noktası
        if (x == SIZE/2 && x == y) return false;
        
        // Su Ana Kadar Olusturdugun Canavarların Konumlarını Kontrol Et
        for (Monster canavar : mL)
        {
            if (canavar.x == x && canavar.y == y)
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        setMonsters();
    }
}
