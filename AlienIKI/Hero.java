import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        Heromove();
        if(getX()==799)
        setLocation(1,getY());
        if(getX()==0)
        setLocation(799,getY());
        if(getY()==599)
        setLocation(getX(),1);
        if(getY()==0)
        setLocation(getX(),599);
    }
    public void Heromove()
    {
        if(Greenfoot.isKeyDown("W"))
        setLocation(getX(), getY()-4);
        if(Greenfoot.isKeyDown("A"))
        setLocation(getX()-4, getY());
        if(Greenfoot.isKeyDown("S"))
        setLocation(getX(), getY()+4);
        if(Greenfoot.isKeyDown("D"))
        setLocation(getX()+4, getY());
    }
}
