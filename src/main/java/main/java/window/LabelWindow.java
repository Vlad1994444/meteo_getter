package main.java.window;

import javax.swing.*;
import java.awt.*;

public class LabelWindow extends JLabel {

    public LabelWindow(int positionX, int positionY, String startText){

        this.setBounds(positionX, positionY, 200, 50);
        this.setHorizontalTextPosition(JLabel.LEFT);
        this.setText(startText);
        this.setBorder(BorderFactory.createDashedBorder(Color.CYAN));
        this.setFont(new Font("Boank", Font.PLAIN, 45));
        this.setForeground(new Color(199,192,192));

        this.setVisible(false);

    }
}
