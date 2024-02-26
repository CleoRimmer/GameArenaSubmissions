public class Pacman 
{
       private int lives;
       // the amount of lives pacman has

       private boolean power;
       //Records whether or not pacman is powered by a power pellet
       
       private int x;
       private int y;
       //x, y positions of pacman
       
       private int direction;
       /*Holds the direction that pacman is travelling in
        * 0 - left
        * 1 - right
        * 2 - up
        * 3 - down
        */


       public Pacman (int startX, int startY)
        //Construcutor method
        {
         lives = 3;
         power = false;
         direction = 0;
         x = startX;
         y = startY;
        }


        //Accessor

        public int getDirection ()
        {
            return direction;
        }
    
       public int getLives()
       {
        return lives;
       }
       
    

       public boolean getPower()
       {
        return power;
       }

       public int getX()
       {
        return x;
       }

       public int getY()
       {
        return y;
       }

       //Mutators

       public void setDirection(int newDirection)
       {
        direction = newDirection;
       }

       public void setX(int newX)
       {
        x = newX;
       }

       public void setY(int newY)
       {
        y = newY;
       }

       //Methods

       public void movement()
       {
        if (direction == 0)
            {
                x -= 1;
            }

            if (direction == 1)
            {
                x += 1;
            }
            
            if (direction == 2)
            {
                y -= 1;
            }

            if (direction == 3)
            {
                y += 1;
            }
       }
}
