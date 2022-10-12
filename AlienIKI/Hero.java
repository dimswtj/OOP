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
        heroHit();
        if(getY()==599)
        setLocation(getX(),1);
        if(getY()==0)
        setLocation(getX(),599);
        laserShoot();
    }
    public void Heromove()
    {
        if(Greenfoot.isKeyDown("W"))
        setLocation(getX(), getY()-10);
        if(Greenfoot.isKeyDown("A"))
        setLocation(getX()-4, getY());
        if(Greenfoot.isKeyDown("S"))
        setLocation(getX(), getY()+10);
        if(Greenfoot.isKeyDown("D"))
        setLocation(getX()+4, getY());
    }
    int laserCount=0;
    public void laserShoot(){
        laserCount++;
        if(laserCount==10){
            Laser laser = new Laser();
            getWorld().addObject(laser, getX()+50,getY());
            laserCount=0;
        }
    }
    int heroCount = 0;
    public void heroHit(){
        if(isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            Explode explode = new Explode();
            getWorld().addObject(explode, getX(), getY());
            heroCount++;
            setLocation(30,198);
        }
    }
}
