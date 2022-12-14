import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyLaser extends Actor
{
    /**
     * Act - do whatever the EnemyLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-8);
        laserEnemyCollision();
    }
    protected void laserEnemyCollision(){
        if(isTouching(Hero.class)){
            getWorld().addObject(
                new Explode(),
                getX(),
                getY()
            );
            
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
        } else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
