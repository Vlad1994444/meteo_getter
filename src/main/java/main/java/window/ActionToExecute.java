package main.java.window;

import main.java.GetURLContent;
import main.java.JSONParsing;
import main.java.model.Constants;
import main.java.model.Root;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;

public class ActionToExecute extends AbstractAction{

    JSONParsing parser;
    Root root;
    HashMap<String, LabelWindow> labels;
    JTextField textField;

    public ActionToExecute(HashMap<String, LabelWindow> labelssss, JTextField textField) {
        this.labels = labelssss;
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GetURLContent.CITY = textField.getText();
        parser = new JSONParsing();
        root = parser.parse();
        labels.get(Constants.SYS_SUNRISE).setText("<html>" + "<center>" +
                "Sunrise = " + root.getCountrySunriseSunset().getSunrise() +
                "</center>" + "</html>");
        for(LabelWindow labelWindow: labels.values()){
            labelWindow.setVisible(true);
        }
    }

}
