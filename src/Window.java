import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Window extends Canvas
{
    public Window(int width, int height, String title, Game game)
    {
        JFrame frame = new JFrame(title);
        // New
        JPanel panelMain = new JPanel(new GridBagLayout());
        JPanel mobWindow = new JPanel();
        mobWindow.setSize(100, 300);
        try {
            BufferedImage goblin = ImageIO.read(new File("GoblinTester.jpg"));
            JLabel imageLabel = new JLabel(new ImageIcon(goblin));
            mobWindow.add(imageLabel);
        }catch(IOException e){System.out.print(e);}

        // Old
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);

        // New
        panelMain.add(mobWindow);
        frame.add(panelMain);



        // Old
        frame.setVisible(true);
        game.start();
    }
}
