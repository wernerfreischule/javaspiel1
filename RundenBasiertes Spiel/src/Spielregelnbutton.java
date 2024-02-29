import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spielregelnbutton {
    public Spielregelnbutton() {

        // Fenster der Spielregeln
        JFrame spielregeln = new JFrame();
        spielregeln.setExtendedState(JFrame.MAXIMIZED_BOTH);
        spielregeln.setLayout(null);

        // Überschrift
        JLabel titel = new JLabel();
        titel.setLocation(700, 0);
        titel.setSize(300, 100);
        titel.setFont(new Font("Handwritten",Font.BOLD + Font.ITALIC, 50));
        titel.setForeground(Color.white);
        titel.setText("Rules");

        // Back button
        JButton rebutton = new JButton();
        rebutton.setSize(150, 50);
        rebutton.setLocation(50, 20);
        rebutton.setText("Back");
        rebutton.setFont(rebutton.getFont().deriveFont((float) 32));
        rebutton.setBackground(Color.MAGENTA);
        rebutton.setFocusable(false);


        // Ermöglicht ein bewegliches Bild (Gif) einzufügen
        ImageIcon icon = new ImageIcon("Bilder/Rulesbackground.gif");
        icon.setImage(icon.getImage().getScaledInstance(1600,820, Image.SCALE_DEFAULT));
        JLabel label = new JLabel();
        label.setBounds(0, 0, 1600, 820);
        label.setIcon(icon);

        rebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main main = new Main();
                spielregeln.dispose();
            }
        });

        spielregeln.getContentPane().add(rebutton);
        spielregeln.getContentPane().add(titel);
        spielregeln.getContentPane().add(label);
        spielregeln.setVisible(true);
    }
}