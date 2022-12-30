import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
 
        setLocation(getX()-speed, getY());
        shootLaserEnemy2();
        enemyRemove();
        //super.moveEnemy();
    }
    public Enemy2(){
        super();
        setRotation(-90);
        
    }
    public Enemy2(int speed){
        super(speed);
        setRotation(-90);
    }
    private int laserTimer = 0;
    public void shootLaserEnemy2(){
        if(laserTimer == 45){
            getWorld().addObject(new EnemyLaser(), getX()-30, getY());
            laserTimer = 0;
        } else{
            laserTimer++;
        }
    }
    public void enemyRemove(){
        if(getX()==0){
            getWorld().removeObject(this);
        }
    }
}
