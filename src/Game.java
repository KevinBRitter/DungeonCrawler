import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {
    private static final int width = 800, height = 600;

    private Thread thread;
    private boolean running = false;
    //private Handler handler;
    //private Random random;

    public Game()
    {
        new Window(width, height+20, "Dungeon Crawler", this);

        //handler = new Handler();
        //random = new Random();
        /*for(int j = 0; j < 1000; j++)
        {
            handler.addObject(new Dot((width/2), (height - 80), ID.Dot));
        }

        handler.addObject(new Goal(400, 25, ID.Goal));
        System.out.println("Dots: " + (handler.objects.size() - 1));
        */
        run();
    }

    public synchronized void start()
    {
        thread = new Thread(this);
        thread.start();
        running = true;
    }
    public synchronized void stop()
    {
        try
        {
            thread.join();
            running = false;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void run()
    {
        // Game loop that maintains the update frames
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(running)
        {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1)
            {
                tick();
                //newGeneration();
                delta--;
            }
            if(running)
                render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000)
            {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
        stop();
    }
    private void tick()
    {
        //handler.tick();
    }
/*    private void newGeneration()
    {
        handler.newGeneration();
    }
    */
    private void render()
    {
        BufferStrategy buffStrat = this.getBufferStrategy();
        if (buffStrat == null)
        {
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = buffStrat.getDrawGraphics();

        g.setColor(Color.black);
        g.fillRect(0, 0, width, height);

        //handler.render(g);
        g.dispose();
        buffStrat.show();
    }
    public static void main(String [] args)
    {
        new Game();
    }
}
