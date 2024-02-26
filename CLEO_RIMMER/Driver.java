public class Driver
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(1920, 1080);
        Pacman player = new Pacman(250, 150, 2);
        //Rectangle playerSprite = new Rectangle(player.getX(), player.getY(), 20, 20, "Yellow");
        

        for (int i = 0; i < 12; i++)
            {  
                for (int j = 0; j < 12; j++)
                {
                    arena.addRectangle(player.getSprite()[i][j]);
                }
           
            }

        while(true)
        {
            if (arena.leftPressed())
            {
                player.setDirection(0);
            }

            if (arena.rightPressed())
            {
                player.setDirection(1);
            }

            if (arena.upPressed())
            {
                player.setDirection(2);
            }

            if (arena.downPressed())
            {
                player.setDirection(3);
            }

            player.movement();
            player.updateSprites();


            for (int i = 0; i < 12; i++)
            {  
                for (int j = 0; j < 12; j++)
                {
                    arena.addRectangle(player.getSprite()[i][j]);
                }
           
            }

            arena.pause();
            arena.clearGameArena();
        }
    }
}