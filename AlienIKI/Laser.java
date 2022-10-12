import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(10);
        laserHit();
    }
    public void laserHit(){
        if(isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            Explode explode = new Explode();
            getWorld().addObject(explode,getX(),getY());
            getWorld().removeObject(this);
        }else if (getX()==799){
            getWorld().removeObject(this);
        }
    }
    public Laser(){

    }
}
