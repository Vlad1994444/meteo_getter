package main.java.window;

import main.java.model.Constants;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class FrameWindow extends JFrame {

    private static final int ZERO_LOCATION = 0;
    private static final Dimension TEXT_FIELD_DIMENSION = new Dimension(350, 50);

    PanelBackground background;

    JTextField countryEntry;

    LabelWindow labelSunrise;
    LabelWindow labelSunset;

    JButton button;

    HashMap<String, LabelWindow> labels;

    public FrameWindow() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setPreferredSize(PanelBackground.DIMENSION);
        this.setLayout(null);

        background = new PanelBackground();

        labelSunrise = new LabelWindow(50, 75, Constants.SYS_SUNRISE);
        labelSunset = new LabelWindow(50, 125, Constants.SYS_SUNSET);

        labels = new HashMap<>();
        labels.put(Constants.SYS_SUNRISE, labelSunrise);
        labels.put(Constants.SYS_SUNSET, labelSunset);

        countryEntry = new JTextField();
        countryEntry.setSize(TEXT_FIELD_DIMENSION);
        countryEntry.setLocation(ZERO_LOCATION, ZERO_LOCATION);
        countryEntry.setText("Enter preferred country");
        countryEntry.setHorizontalAlignment(JLabel.CENTER);
        countryEntry.addActionListener(new ActionToExecute(labels, countryEntry));

        button = new JButton();
        button.setBounds(360, 10, 90, 40);
        button.setText("<html>" + "<center>" + "Get forecast" + "</center>" + "</html>");

        button.addActionListener(new ActionToExecute(labels, countryEntry));

        JLayeredPane layers = new JLayeredPane();
        layers.setBounds(ZERO_LOCATION, ZERO_LOCATION, background.getWidth(), background.getHeight());
        layers.add(background, Integer.valueOf(0));

        for (LabelWindow label : labels.values()) {
            layers.add(label, Integer.valueOf(1));
        }
        layers.add(button, Integer.valueOf(1));
        layers.add(countryEntry, Integer.valueOf(1));


        this.add(layers);
        this.pack();
        this.setVisible(true);
    }
}
