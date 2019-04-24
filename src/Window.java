import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.border.LineBorder;

public class Window extends Canvas
{
    public Window(int width, int height, String title, Game game)
    {
        JFrame frame = new JFrame(title);
        frame.setSize(new Dimension(width, height));

        // New Main panel for nesting grid of panels
        JPanel panelMain = new JPanel(new GridBagLayout());

        // Create panel called mobWindow to display game space
        JPanel mobWindow = new JPanel();
        mobWindow.setPreferredSize(new Dimension(300, 300));
        mobWindow.setBorder(LineBorder.createGrayLineBorder());
        try {
            BufferedImage goblin = ImageIO.read(new File("GoblinBasic.PNG"));
            JLabel imageLabel = new JLabel(new ImageIcon(goblin));
            mobWindow.add(imageLabel);
        }catch(IOException e){System.out.print(e);}

        // Create two panels to hold the stats for player and mob
        JPanel mobStatsWindow = new JPanel();
        mobStatsWindow.setPreferredSize(new Dimension(200, 300));
        mobStatsWindow.setBackground(Color.BLUE);
        mobStatsWindow.setBorder(LineBorder.createGrayLineBorder());

        JPanel playerStatsWindow = new JPanel();
        playerStatsWindow.setPreferredSize(new Dimension(200, 300));
        playerStatsWindow.setBackground(Color.BLACK);
        playerStatsWindow.setBorder(LineBorder.createGrayLineBorder());

        // Create bottom panel for action buttons
        JPanel actionButtons = new JPanel();
        actionButtons.setPreferredSize(new Dimension(700, 300));
        actionButtons.setBackground(Color.green);
        actionButtons.setBorder(LineBorder.createGrayLineBorder());

        // Limit frame size to given sizes
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        // Add constraints to grid
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.NORTHWEST;

        // Load the mobWindow to the main panel to display
        panelMain.add(mobWindow, c);

        c.gridx = 1;
        c.fill = GridBagConstraints.NORTH;
        panelMain.add(mobStatsWindow, c);

        c.gridx = 2;
        c.fill = GridBagConstraints.NORTHEAST;
        panelMain.add(playerStatsWindow, c);

        c.gridx = 0;
        c.gridy = 2;
        c.fill = GridBagConstraints.SOUTH;
        panelMain.add(actionButtons, c);



        // Close program when exited out of jFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Don't allow player resize of frame
        frame.setResizable(false);
        // Center the frame
        frame.setLocationRelativeTo(null);
        // Add the game runnable to the frame
        frame.add(game);


        frame.add(panelMain);

        // Set the frame to visible
        frame.setVisible(true);
        // Start the game code
        game.start();
    }
}
