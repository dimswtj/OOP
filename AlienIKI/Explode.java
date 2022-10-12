import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explode extends Actor
{
    /**
     * Act - do whatever the Explode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        turn(2);
        explode();
    }
    int explodeTimer=0;
    public void explode(){
        explodeTimer++;
        if(explodeTimer==30){
            getWorld().removeObject(this);
            explodeTimer=0;
        }
    }
    
    
}
