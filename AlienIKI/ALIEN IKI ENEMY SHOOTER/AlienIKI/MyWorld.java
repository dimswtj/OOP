import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Hero hero = new Hero();
        addObject(hero,30,198);
        hero.setLocation(62,208);
        hero.setLocation(28,351);
        hero.setLocation(20,329);
        Enemy enemy = new Enemy();
        addObject(enemy,784,304);
    }

    public void addenemy(){
        int enemyY= 10 + Greenfoot.getRandomNumber(580);
        Enemy enemy = new Enemy(Greenfoot.getRandomNumber(8)+1);
        addObject(enemy,800,enemyY);
    }
    public void addenemy2(){
        int enemyY= 10 + Greenfoot.getRandomNumber(580);
        Enemy2 enemy2 = new Enemy2(Greenfoot.getRandomNumber(8)+1);
        addObject(enemy2,800,enemyY);
    }
    
    int enemyCount = 0;
    public void act(){
        enemyCount++;
        if (enemyCount==20){
            addenemy();
            addenemy2();
            enemyCount=0;
        }
    }

}
