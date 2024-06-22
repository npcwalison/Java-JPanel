package com.project.calculadora;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    // Criando variavel para receber uma fonte
    final private Font mainFont = new Font("Segoe print ", Font.BOLD, 18);
    // Declarando componentes
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;

    public void initialize() {
        /*==========> Form Panel <==========*/
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);


        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout( 4, 1, 5, 5));
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        /*==========> Walcome Label <==========*/
        lbWelcome = new JLabel(); 
        lbWelcome.setFont(mainFont);


        /*==========> Buttons Panel <==========*/
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String firtName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Hello" + firtName + " "  + lastName);
            }
            
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
            
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);



        JPanel maiPanel = new JPanel();
        maiPanel.setLayout(new BorderLayout());
        maiPanel.setBackground(new Color(128, 128, 255));
        maiPanel.add(formPanel, BorderLayout.NORTH);
        maiPanel.add(lbWelcome, BorderLayout.CENTER);
        maiPanel.add(buttonsPanel, BorderLayout.SOUTH);

        // Adicionando painel principal a public void initialize() diretamente
        add(maiPanel);

        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Mensage() {
        System.out.print("Funcionando");
    }
}
