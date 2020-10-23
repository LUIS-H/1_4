package com.luish.aplicaciongrafica;

import java.awt.EventQueue;
import javax.swing.*;

/**
 * Hola
 *
 * @author Luis
 */
public class AplicacionGrafica extends JFrame {

    /**
     * Panel de la aplicación
     */
    private JPanel contentPane;

    public AplicacionGrafica() {

        // Añade un titulo, no es estrictamente necesario
        setTitle("Título de la ventana");

        /**
         * Coordenas x y de la aplicación y su altura y longitud, si no lo
         * indicamos aparecera una ventana muy pequeña
         */
        setBounds(400, 200, 607, 448);

        /**
         * Indica que cuando se cierre la ventana se acaba la aplicación, si no
         * lo indicamos cuando cerramos la ventana la aplicación seguirá
         * funcionando
         */
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Hace visible la aplicaión, si no lo hacemos no veremos la aplicaión
        setVisible(true);

        // Creamos el panel
        contentPane = new JPanel();

        // Indicamos su diseño
        contentPane.setLayout(null);

        // Asigno el pannel a la ventana
        setContentPane(contentPane);

        //Componentes
        JLabel etiqueta = new JLabel("¡Hola mundo!");
        etiqueta.setBounds(60, 20, 100, 20);
        contentPane.add(etiqueta);

        JTextField textField = new JTextField();
        textField.setBounds(43, 67, 86, 26);
        contentPane.add(textField);

        JButton btnPulsame = new JButton("Pulsame");
        btnPulsame.setBounds(43, 133, 89, 23);
        contentPane.add(btnPulsame);

        JRadioButton rdbtnOpcion = new JRadioButton("Opcion 1", true);
        rdbtnOpcion.setBounds(43, 194, 109, 23);
        contentPane.add(rdbtnOpcion);

        JRadioButton rdbtnOpcion_1 = new JRadioButton("Opcion 2", false);
        rdbtnOpcion_1.setBounds(43, 220, 109, 23);
        contentPane.add(rdbtnOpcion_1);

        JRadioButton rdbtnOpcion_2 = new JRadioButton("Opcion 1", false);
        rdbtnOpcion_2.setBounds(43, 246, 109, 23);
        contentPane.add(rdbtnOpcion_2);

        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(rdbtnOpcion);
        bgroup.add(rdbtnOpcion_1);
        bgroup.add(rdbtnOpcion_2);

        JCheckBox chckbxOpcion = new JCheckBox("Opcion 1", true);
        chckbxOpcion.setBounds(43, 305, 97, 23);
        contentPane.add(chckbxOpcion);

        JCheckBox chckbxNexCheckBox = new JCheckBox("Opcion 2", true);
        chckbxNexCheckBox.setBounds(43, 325, 97, 23);
        contentPane.add(chckbxNexCheckBox);

        JCheckBox chckbxOpcion_1 = new JCheckBox("Opcion 3", false);
        chckbxOpcion_1.setBounds(43, 346, 97, 23);
        contentPane.add(chckbxOpcion_1);

        JTextArea textArea = new JTextArea("prueba");
        textArea.setBounds(189, 18, 141, 117);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        contentPane.add(textArea);

        JScrollPane scroll = new JScrollPane(textArea); //Objeto
        scroll.setBounds(189, 18, 141, 117);
        contentPane.add(scroll);

        JPasswordField pwd = new JPasswordField("fernando");
        pwd.setBounds(189, 171, 139, 20);
        contentPane.add(pwd);

        JComboBox comboBox = new JComboBox<>();
        comboBox.setBounds(189, 221, 141, 22);
        contentPane.add(comboBox);

        comboBox.addItem("Fernando");
        comboBox.addItem("Alberto");
        comboBox.addItem("Arturo");

        JToggleButton tglbtnNewToggleButton = new JToggleButton("Interruptor", true);
        tglbtnNewToggleButton.setBounds(189, 291, 121, 23);
        contentPane.add(tglbtnNewToggleButton);

        JSpinner spinner = new JSpinner();
        spinner.setBounds(371, 20, 29, 20);
        contentPane.add(spinner);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AplicacionGrafica ventana = new AplicacionGrafica();
                    ventana.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
