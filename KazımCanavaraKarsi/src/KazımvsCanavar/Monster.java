
package KazımvsCanavar;

public class Monster 
{
    public int x, y, hp, dmg;
    
    public Monster(int x, int y)
    {
        this.x = x;
        this.y = y;
        hp = (int)(50 + Math.random() * 21);
        dmg = (int)(15 + Math.random() * 11);
        
        System.out.println("M : "+hp+"/"+dmg+" @"+x+","+y+" Oluşturuldu");
    }
}
