
public class Apple {

    SnakeGame main;

    public int posX;
    public int pocY;

    public  Apple(int startX, int startY)
    {
        posX=startX;
        pocY=startY;
    }

    public void setRandomPosition()
    {
        posX=(int)(Math.random()*main.WIDTH);
        pocY=(int)(Math.random()*main.WIDTH);
    }
}
