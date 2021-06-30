package com.github.alexanderfefelov.bgbilling.plugin.demo.client;

import ru.bitel.bgbilling.client.common.BGUTabPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends BGUTabPanel {

    public Main() throws Exception {
        super();
        tabTitle = "Демо";
    }

    @Override
    protected void jbInit() throws Exception {
        setLayout(new GridBagLayout());

        textField1.setColumns(20);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField1, gbc);

        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(spacer1, gbc);

        button1.setText("Привет");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(button1, gbc);
        button1.addActionListener(e -> onButton1Pressed());
    }

    private void onButton1Pressed() {
        String message = "Привет, " + textField1.getText() + "!";
        JOptionPane.showMessageDialog(this, message);
    }

    private JTextField textField1 = new JTextField();
    private JButton button1 = new JButton();

}
