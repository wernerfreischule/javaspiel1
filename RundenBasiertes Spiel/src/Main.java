import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public  Main() {

        // Fenster für homescreen
        JFrame homescreen = new JFrame();
        homescreen.setExtendedState(JFrame.MAXIMIZED_BOTH);
        homescreen.setLayout(null);
        homescreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Überschrift
        JLabel titel = new JLabel();
        titel.setLocation(613, 50);
        titel.setSize(500, 100);
        titel.setFont(new Font("Handwritten",Font.BOLD + Font.ITALIC, 34));
        titel.setForeground(Color.white);
        titel.setText("Rundenbasiertes Spiel");

        // Playbutton
        JButton play = new JButton();
        play.setLocation(550, 250);
        play.setSize(500, 100);
        play.setText("Play");
        play.setFont(play.getFont().deriveFont((float) 32));
        play.setBackground(Color.MAGENTA);
        play.setFocusable(false);

        // Rulesbutton
        JButton spielregeln = new JButton();
        spielregeln.setLocation(550, 400);
        spielregeln.setSize(500, 100);
        spielregeln.setText("Game Rules");
        spielregeln.setFont(spielregeln.getFont().deriveFont((float) 32));
        spielregeln.setBackground(Color.pink);
        spielregeln.setFocusable(false);

        // Exitbutton
        JButton exit = new JButton();
        exit.setLocation(550, 550);
        exit.setSize(500, 100);
        exit.setText("Exit");
        exit.setFont(exit.getFont().deriveFont((float) 32));
        exit.setBackground(Color.cyan);
        exit.setFocusable(false);


        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Playbutton playButton = new Playbutton();
                homescreen.dispose();
            }
        });

        spielregeln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Spielregelnbutton spielregelnbutton = new Spielregelnbutton();
                homescreen.dispose();
            }
        });


        // Exit Button
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exitbutton exitButton = new Exitbutton();
                homescreen.dispose();
            }
        });

        // Ermöglicht ein bewegliches Bild (Gif) einzufügen
        ImageIcon icon = new ImageIcon("Bilder/Citygif.gif");
        icon.setImage(icon.getImage().getScaledInstance(1600,820, Image.SCALE_DEFAULT));
        JLabel label = new JLabel();
        label.setBounds(0, 0, 1600, 820);
        label.setIcon(icon);


        homescreen.getContentPane().add(titel);
        homescreen.getContentPane().add(play);
        homescreen.getContentPane().add(spielregeln);
        homescreen.getContentPane().add(exit);
        homescreen.getContentPane().add(label);
        homescreen.setVisible(true);
    }
    public static void main(String[] args) {
        Main hauptfenster = new Main();

    }
}

