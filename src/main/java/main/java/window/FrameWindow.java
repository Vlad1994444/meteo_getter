package main.java.window;

import main.java.GetURLContent;
import main.java.JSONParsing;
import main.java.model.Root;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameWindow extends JFrame {

    Dimension dimension = new Dimension(500, 500);

    JSONParsing parser;
    Root root;

    public FrameWindow() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setPreferredSize(dimension);
        this.setLayout(null);

        JTextField countryEntry = new JTextField();
        countryEntry.setBounds(0, 0, 350, 50);
        countryEntry.setText("Enter preferred country");

        JLabel label = new JLabel("Sunrise");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVisible(true);
        label.setBounds(200, 200, 100, 50);
        label.setBorder(BorderFactory.createDashedBorder(Color.CYAN));

        JButton button = new JButton();
        button.setBounds(360, 10, 100, 20);
        button.setText("Get forecast");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GetURLContent.CITY = countryEntry.getText();
                parser = new JSONParsing();
                root = parser.parse();
                label.setText("<html>" + "<center>" +
                        "Sunrise = "+ root.getCountrySunriseSunset().getSunrise()+
                        "</center>" + "</html>");
            }
        });



        this.add(label);
        this.add(button);
        this.add(countryEntry);

        this.pack();

    }
}
