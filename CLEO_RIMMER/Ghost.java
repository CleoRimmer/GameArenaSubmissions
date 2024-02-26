import java.util.Random; 

public class Ghost 
{
        private boolean released;
        //Records whether or not the ghost has been released from the starting cage

       private boolean power;
       //Records whether or not pacman is powered by a power pellet

       private int speed;
       //Holds the speed of the ghost
       
       private int x;
       private int y;
       //x, y positions of the ghost
       
       private int direction;
       /*Holds the direction that the ghost is travelling in
        * 0 - left
        * 1 - right
        * 2 - up
        * 3 - down
        */

        private Random rand;
        //Holds the random generator for the movement


       public Ghost (int startX, int startY, int startSpeed)
        //Construcutor method
        {
        Random rand = new Random();
         power = false;
         direction = 0;
         x = startX;
         y = startY;
         speed = startSpeed;
        }


        //Accessor

        public boolean getReleased ()
        {
            return released;
        }

        public int getDirection ()
        {
            return direction;
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
       public void toggleReleased ()
       {
            released = ! released;
       }

       public void togglePower ()
       {
            power = ! power;
       }

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

       public int genDirection ()
       {
        return rand.nextInt(0,4);
       }

       public void movement()
       {
        if (direction == 0)
            {
                x -= speed;
            }

            if (direction == 1)
            {
                x += speed;
            }
            
            if (direction == 2)
            {
                y -= speed;
            }

            if (direction == 3)
            {
                y += speed;
            }
       }
}