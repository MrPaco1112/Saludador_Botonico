
package View;

import java.awt.*;
import javax.swing.*;


public class Ventana {
    
    public static void abrirVentana() {
        
        //Creacion de panel y ventana
        JFrame ventana = new JFrame("Saludador Botonico");
        JPanel panel1 = new JPanel();
        
        //Creacion de botones
        JButton boton1 = new JButton("Deutsch");
        boton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JButton boton2 = new JButton("English");
        boton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JButton boton3 = new JButton("Español");
        boton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JButton boton4 = new JButton("Texto propio");
        boton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JButton boton5 = new JButton("Italiano");
        boton5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JButton boton6 = new JButton("Latin");
        boton6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JButton boton7 = new JButton("Français");
        boton7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JButton boton8 = new JButton("Desactivar botones");
        boton8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JButton boton9 = new JButton("Reactivar botones");
        boton9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JButton boton10 = new JButton("Limpiar casillas");
        boton10.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //Campos de texto
        JTextField campotexto1 = new JTextField(15); 
        JTextField campotexto2 = new JTextField(15);
        JTextField campotexto3 = new JTextField(15);
        JTextField campotexto4 = new JTextField(15);
        JTextField campotexto5 = new JTextField(15);
        JTextField campotexto6 = new JTextField(15);
        JTextField campotexto7 = new JTextField(15);
        
        //Panel
        ventana.add(panel1);
        
            panel1.add(boton1);
            panel1.add(campotexto1);
            panel1.add(boton2);
            panel1.add(campotexto2);
            panel1.add(boton3);
            panel1.add(campotexto3);
            panel1.add(boton4);
            panel1.add(campotexto4);
            panel1.add(boton5);
            panel1.add(campotexto5);
            panel1.add(boton6);
            panel1.add(campotexto6);
            panel1.add(boton7);
            panel1.add(campotexto7);
            panel1.add(boton8);
            panel1.add(boton9);
            panel1.add(boton10);
        
        panel1.setLayout(new FlowLayout(FlowLayout.LEADING)); 
        
        //Cambio de color de botones
        boton4.setBackground(Color.BLACK); //Este es para el color del fondo
        boton4.setForeground(Color.WHITE); //Este es para el color del texto del boton
        boton8.setBackground(Color.BLACK);
        boton8.setForeground(Color.RED);
        boton9.setBackground(Color.BLACK);
        boton9.setForeground(Color.GREEN);
        boton9.setEnabled(false); //Desactiva el boton
        

        //Funciones de los botones
        boton1.addActionListener(e -> campotexto1.setText("Guten tag :D"));
        boton2.addActionListener(e -> campotexto2.setText("Good evening :D"));
        boton3.addActionListener(e -> campotexto3.setText("Buenas tardes :D"));
        boton4.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Escribe tu texto:");
            if (input != null) campotexto4.setText(input);
        });
        boton5.addActionListener(e -> campotexto5.setText("Buon pomeriggio :D"));
        boton6.addActionListener(e -> campotexto6.setText("Bona post meridiem. :D"));
        boton7.addActionListener(e -> campotexto7.setText("Bonne après-midi :D"));
        boton8.addActionListener(e -> { //Este boton nos desactiva los demás botones
            boton1.setEnabled(false);boton2.setEnabled(false);boton3.setEnabled(false);
            boton4.setEnabled(false);boton5.setEnabled(false);boton6.setEnabled(false);
            boton7.setEnabled(false);boton8.setEnabled(false);boton10.setEnabled(false);
            boton9.setEnabled(true);
        });
        boton9.addActionListener(e -> { //Este boton nos reactiva los demás botones
            boton1.setEnabled(true);boton2.setEnabled(true);boton3.setEnabled(true);
            boton4.setEnabled(true);boton5.setEnabled(true);boton6.setEnabled(true);
            boton7.setEnabled(true);boton8.setEnabled(true);boton10.setEnabled(true);
            boton9.setEnabled(false);
        });
        boton10.addActionListener(e -> { //Este boton limpia las demás casillas de texto
            campotexto1.setText("");campotexto2.setText("");campotexto3.setText("");
            campotexto4.setText("");campotexto5.setText("");campotexto6.setText("");
            campotexto7.setText("");
        });
        
        //Hacer visible los elementos
        ventana.setSize(310,450);
        ventana.setVisible(true);
        campotexto1.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Permite cerrar bien
     } 
    
}
