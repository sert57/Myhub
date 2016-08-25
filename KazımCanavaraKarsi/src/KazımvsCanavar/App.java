package KazımvsCanavar;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static Scanner oku=new Scanner(System.in);
    
    public static Kazım kazım;
    public static Canavar canavar;
    public static Shop shop;
    static int seviye;
    public static String [][]map;
    public static void seviyeSec()
    {
        System.out.print("Seviye seçiniz\n"
                + "1-Kolay\n"
                + "2-Orta\n"
                + "3-Zor\n"
                + "Seçim[1-3] :");
        int k=oku.nextInt();
        if(k==1)
            seviye=7;
        else if(k==2)
            seviye=9;
        else if(k==3)
            seviye=11;
        else 
        {
            System.out.println("Hatalı giriş");
            seviyeSec();
        }
            
    }
    public static void printMap(int size)
    {
        map=new String[size][size];
        map[kazım.y][kazım.x]=kazım.toString();
        map[shop.y][shop.x]=shop.toString();
        map[canavar.y][canavar.x]=canavar.toString();
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j <size ; j++) {
                if(i==canavar.x )
                map[i][j]="M";
            }
        }
        
        for (int i = 0; i < size; i++) 
            for (int j = 0; j < size; j++) 
                if(map[i][j]==null)
                    map[i][j]="\u25A1";
        
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
                System.out.print(map[i][j]);
            System.out.println("");
        }
        
    }
    public static void main(String[] args) 
    {
        seviyeSec();
        kazım=new Kazım(0,0);
        shop=new Shop(seviye/2,seviye/2);
        canavar=new Canavar();
        canavar.setMonsters();
        
        while(true)
        {
            printMap(seviye);
//            for (int i = 0; i < seviye*2; i++) 
//            {
//                Canavar yeni=new Canavar();
//                yeni.canavarOlustur();
//            }
            char c=oku.next().charAt(0);
            kazım.move(c);
            
            
        }
        
        
    }
}
