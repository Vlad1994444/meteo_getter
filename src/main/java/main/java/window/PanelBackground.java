package main.java.window;

import javax.swing.*;
import java.awt.*;

public class PanelBackground extends JPanel {

    public static ImageIcon weather = new ImageIcon(PanelBackground.class.getResource("/weatherOne.png"));
    public static Dimension DIMENSION = new Dimension(weather.getIconWidth(), weather.getIconHeight());

    public PanelBackground(){

        this.setLayout(null);
        this.setBounds(0,0, weather.getIconWidth(), weather.getIconHeight());

        JLabel backgroundPicture = new JLabel();
        backgroundPicture.setIcon(weather);
        backgroundPicture.setBounds(0,0,weather.getIconWidth(), weather.getIconHeight());

        this.add(backgroundPicture);

//        this.setVisible(true);
    }
}
