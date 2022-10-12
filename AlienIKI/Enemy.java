import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Enemy (){
        setRotation (180);
    
    }
    
    public Enemy (int speed){
        setRotation(180);
        this.speed = speed;
    }
    public int speed = 4;
    public void act()
    {
        // Add your action code here.
        move(speed);
        turn(70);
        //if(isAtEdge())
        setLocation(getX()-speed, getY());
        enemyRemove();
    }
    public void enemyRemove(){
        if(getX()==0){
            getWorld().removeObject(this);
        }
    }
    
}
