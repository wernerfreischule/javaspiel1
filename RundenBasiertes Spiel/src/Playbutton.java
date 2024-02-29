import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Playbutton {
    public Playbutton() {

        final int[] currentHPplayerEins = {550};
        final int[] currentHPplayerZwei = {550};
        final int[] currentMPplayerEins = {200};
        final int[] currentMPplayerZwei = {200};

        JFrame play = new JFrame();
        play.setExtendedState(JFrame.MAXIMIZED_BOTH);
        play.setLayout(null);

        JButton atkEinsPlayerEins = new JButton();
        JButton atkZweiPlayerEins = new JButton();
        JButton atkDreiPlayerEins = new JButton();
        JButton atkVierPlayerEins = new JButton();

        JButton atkEinsPlayerZwei = new JButton();
        JButton atkZweiPlayerZwei = new JButton();
        JButton atkDreiPlayerZwei = new JButton();
        JButton atkVierPlayerZwei = new JButton();


        JProgressBar hpPlayerEins = new JProgressBar(0, 500);
        hpPlayerEins.setValue(currentHPplayerEins[0]);
        hpPlayerEins.setBounds(300, 150, 450, 25);
        hpPlayerEins.setString(currentHPplayerEins[0] + " HP / 550 HP");
        hpPlayerEins.setStringPainted(true);
        hpPlayerEins.setForeground(Color.RED);
        hpPlayerEins.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));

        JProgressBar hpPlayerZwei = new JProgressBar(0, 500);
        hpPlayerZwei.setValue(currentHPplayerZwei[0]);
        hpPlayerZwei.setBounds(800, 150, 450, 25);
        hpPlayerZwei.setString(currentHPplayerZwei[0] + " HP / 550 HP");
        hpPlayerZwei.setStringPainted(true);
        hpPlayerZwei.setForeground(Color.RED);
        hpPlayerZwei.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));

        JProgressBar manaPlayerEins = new JProgressBar(0, 200);
        manaPlayerEins.setValue(currentMPplayerEins[0]);
        manaPlayerEins.setBounds(300, 180, 450, 25);
        manaPlayerEins.setString(currentMPplayerZwei[0] + " MP / 200 MP");
        manaPlayerEins.setStringPainted(true);
        manaPlayerEins.setForeground(Color.BLUE);
        manaPlayerEins.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));

        JProgressBar manaPlayerZwei = new JProgressBar(0, 200);
        manaPlayerZwei.setValue(currentMPplayerZwei[0]);
        manaPlayerZwei.setBounds(800, 180, 450, 25);
        manaPlayerZwei.setString(currentMPplayerZwei[0] + " MP / 200 MP");
        manaPlayerZwei.setStringPainted(true);
        manaPlayerZwei.setForeground(Color.BLUE);
        manaPlayerZwei.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));


        atkEinsPlayerEins.setSize(200, 50);
        atkEinsPlayerEins.setLocation(350, 350);
        atkEinsPlayerEins.setText("NORMAL ATK");
        atkEinsPlayerEins.setBackground(Color.red);
        atkEinsPlayerEins.setFont(new Font("Consolas", Font.BOLD, 18));
        atkEinsPlayerEins.setFocusable(false);

        atkEinsPlayerEins.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (currentMPplayerEins[0] >= 40) {

                    currentHPplayerZwei[0] -= 40;
                    hpPlayerZwei.setValue(currentHPplayerZwei[0] - 40);

                    currentMPplayerEins[0] -= 40;
                    manaPlayerEins.setValue(currentMPplayerEins[0]);
                    System.out.println(currentMPplayerEins[0]);

                    hpPlayerZwei.setString(currentHPplayerZwei[0] + " HP / 550 HP");
                    manaPlayerEins.setString(currentMPplayerEins[0] + " MP / 200 MP");


                    atkEinsPlayerEins.setEnabled(false);
                    atkZweiPlayerEins.setEnabled(false);
                    atkDreiPlayerEins.setEnabled(false);
                    atkVierPlayerEins.setEnabled(false);

                    atkEinsPlayerZwei.setEnabled(true);
                    atkZweiPlayerZwei.setEnabled(true);
                    atkDreiPlayerZwei.setEnabled(true);
                    atkVierPlayerZwei.setEnabled(true);


                } else {

                }
            }
        });

        //STRONG ATK PLAYER 1

        atkZweiPlayerEins.setSize(200, 50);
        atkZweiPlayerEins.setLocation(350, 400);
        atkZweiPlayerEins.setText("STRONG ATK");
        atkZweiPlayerEins.setBackground(Color.orange);
        atkZweiPlayerEins.setFont(new Font("Consolas", Font.BOLD, 18));
        atkZweiPlayerEins.setFocusable(false);

        atkZweiPlayerEins.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentMPplayerEins[0] >= 110) {

                    currentHPplayerZwei[0] -= 95;
                    hpPlayerZwei.setValue(currentHPplayerZwei[0] - 95);


                    currentMPplayerEins[0] -= 110;
                    manaPlayerEins.setValue(currentMPplayerEins[0]);

                    manaPlayerEins.setString(currentMPplayerEins[0] + " MP / 200 MP");
                    hpPlayerZwei.setString(currentHPplayerZwei[0] + " HP / 550 HP");


                    atkEinsPlayerEins.setEnabled(false);
                    atkZweiPlayerEins.setEnabled(false);
                    atkDreiPlayerEins.setEnabled(false);
                    atkVierPlayerEins.setEnabled(false);

                    atkEinsPlayerZwei.setEnabled(true);
                    atkZweiPlayerZwei.setEnabled(true);
                    atkDreiPlayerZwei.setEnabled(true);
                    atkVierPlayerZwei.setEnabled(true);


                } else {

                }

            }
        });


        atkDreiPlayerEins.setSize(200, 50);
        atkDreiPlayerEins.setLocation(350, 450);
        atkDreiPlayerEins.setText("HEALING");
        atkDreiPlayerEins.setBackground(Color.green);
        atkDreiPlayerEins.setFont(new Font("Consolas", Font.BOLD, 18));
        atkDreiPlayerEins.setFocusable(false);

        atkDreiPlayerEins.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (currentMPplayerEins[0] >= 70) {

                    if (currentHPplayerEins[0] + 60 > 550) {
                        currentHPplayerEins[0] = 550;
                        hpPlayerEins.setValue(currentHPplayerEins[0]);

                        currentMPplayerEins[0] -= 70;
                        manaPlayerEins.setValue(currentMPplayerEins[0]);


                        hpPlayerEins.setString(currentHPplayerEins[0] + " HP / 550 HP");
                        manaPlayerEins.setString(currentMPplayerEins[0] + " MP / 200 MP");


                        atkEinsPlayerEins.setEnabled(false);
                        atkZweiPlayerEins.setEnabled(false);
                        atkDreiPlayerEins.setEnabled(false);
                        atkVierPlayerEins.setEnabled(false);
                        atkEinsPlayerZwei.setEnabled(true);
                        atkZweiPlayerZwei.setEnabled(true);
                        atkDreiPlayerZwei.setEnabled(true);
                        atkVierPlayerZwei.setEnabled(true);


                    } else {

                        currentHPplayerEins[0] += 60;
                        hpPlayerEins.setValue(currentHPplayerEins[0]);

                        currentMPplayerEins[0] -= 70;
                        manaPlayerEins.setValue(currentMPplayerEins[0]);

                        hpPlayerEins.setString(currentHPplayerEins[0] + " HP / 550 HP");
                        manaPlayerEins.setString(currentMPplayerEins[0] + " MP / 200 MP");

                        atkEinsPlayerEins.setEnabled(false);
                        atkZweiPlayerEins.setEnabled(false);
                        atkDreiPlayerEins.setEnabled(false);
                        atkVierPlayerEins.setEnabled(false);

                        atkEinsPlayerZwei.setEnabled(true);
                        atkZweiPlayerZwei.setEnabled(true);
                        atkDreiPlayerZwei.setEnabled(true);
                        atkVierPlayerZwei.setEnabled(true);

                    }

                } else {

                }


            }
        });


        atkVierPlayerEins.setSize(200, 50);
        atkVierPlayerEins.setLocation(350, 525);
        atkVierPlayerEins.setText("RECHARGE ENERGY");
        atkVierPlayerEins.setBackground(Color.cyan);
        atkVierPlayerEins.setFont(new Font("Consolas", Font.BOLD, 18));
        atkVierPlayerEins.setFocusable(false);

        atkVierPlayerEins.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (currentMPplayerEins[0] + 55 > 200) {

                    currentMPplayerEins[0] = 200;
                    manaPlayerEins.setString(currentMPplayerEins[0] + " MP / 200 MP");
                    manaPlayerEins.setValue(currentMPplayerEins[0]);

                    atkEinsPlayerEins.setEnabled(false);
                    atkZweiPlayerEins.setEnabled(false);
                    atkDreiPlayerEins.setEnabled(false);
                    atkVierPlayerEins.setEnabled(false);
                    atkEinsPlayerZwei.setEnabled(true);
                    atkZweiPlayerZwei.setEnabled(true);
                    atkDreiPlayerZwei.setEnabled(true);
                    atkVierPlayerZwei.setEnabled(true);


                } else {
                    currentMPplayerEins[0] += 55;
                    manaPlayerEins.setString(currentMPplayerEins[0] + " MP / 200 MP");
                    manaPlayerEins.setValue(currentMPplayerEins[0]);

                    atkEinsPlayerEins.setEnabled(false);
                    atkZweiPlayerEins.setEnabled(false);
                    atkDreiPlayerEins.setEnabled(false);
                    atkVierPlayerEins.setEnabled(false);
                    atkEinsPlayerZwei.setEnabled(true);
                    atkZweiPlayerZwei.setEnabled(true);
                    atkDreiPlayerZwei.setEnabled(true);
                    atkVierPlayerZwei.setEnabled(true);


                }
            }
        });


        atkEinsPlayerZwei.setSize(200, 50);
        atkEinsPlayerZwei.setLocation(950, 350);
        atkEinsPlayerZwei.setText("NORMAL ATK");
        atkEinsPlayerZwei.setBackground(Color.RED);
        atkEinsPlayerZwei.setFont(new Font("Consolas", Font.BOLD, 18));
        atkEinsPlayerZwei.setFocusable(false);

        atkEinsPlayerZwei.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (currentMPplayerZwei[0] >= 35) {

                    currentHPplayerEins[0] -= 40;
                    hpPlayerEins.setValue(currentHPplayerEins[0] - 40);

                    currentMPplayerZwei[0] -= 40;
                    manaPlayerZwei.setValue(currentMPplayerZwei[0]);

                    hpPlayerEins.setString(currentHPplayerEins[0] + " HP / 550 HP");
                    manaPlayerZwei.setString(currentMPplayerZwei[0] + " MP / 200 MP");

                    atkEinsPlayerZwei.setEnabled(false);
                    atkZweiPlayerZwei.setEnabled(false);
                    atkDreiPlayerZwei.setEnabled(false);
                    atkVierPlayerZwei.setEnabled(false);

                    atkEinsPlayerEins.setEnabled(true);
                    atkZweiPlayerEins.setEnabled(true);
                    atkDreiPlayerEins.setEnabled(true);
                    atkVierPlayerEins.setEnabled(true);
                } else {

                }

            }
        });


        atkZweiPlayerZwei.setSize(200, 50);
        atkZweiPlayerZwei.setLocation(950, 400);
        atkZweiPlayerZwei.setText("STRONG ATK");
        atkZweiPlayerZwei.setBackground(Color.ORANGE);
        atkZweiPlayerZwei.setFont(new Font("Consolas", Font.BOLD, 18));
        atkZweiPlayerZwei.setFocusable(false);

        atkZweiPlayerZwei.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentMPplayerZwei[0] >= 110) {

                    currentHPplayerEins[0] -= 95;
                    hpPlayerEins.setValue(currentHPplayerEins[0] - 95);


                    currentMPplayerZwei[0] -= 110;
                    manaPlayerZwei.setValue(currentMPplayerZwei[0]);

                    manaPlayerZwei.setString(currentMPplayerZwei[0] + " MP / 200 MP");
                    hpPlayerEins.setString(currentHPplayerEins[0] + " HP / 550 HP");

                    atkEinsPlayerZwei.setEnabled(false);
                    atkZweiPlayerZwei.setEnabled(false);
                    atkDreiPlayerZwei.setEnabled(false);
                    atkVierPlayerZwei.setEnabled(false);
                    atkEinsPlayerEins.setEnabled(true);
                    atkZweiPlayerEins.setEnabled(true);
                    atkDreiPlayerEins.setEnabled(true);
                    atkVierPlayerEins.setEnabled(true);


                } else {

                }
            }
        });


        atkDreiPlayerZwei.setSize(200, 50);
        atkDreiPlayerZwei.setLocation(950, 450);
        atkDreiPlayerZwei.setText("HEALING");
        atkDreiPlayerZwei.setBackground(Color.GREEN);
        atkDreiPlayerZwei.setFont(new Font("Consolas", Font.BOLD, 18));
        atkDreiPlayerZwei.setFocusable(false);
        atkDreiPlayerZwei.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (currentMPplayerZwei[0] >= 70) {

                    if (currentHPplayerZwei[0] + 60 > 550) {
                        currentHPplayerZwei[0] = 550;
                        hpPlayerZwei.setValue(currentHPplayerZwei[0]);

                        currentMPplayerZwei[0] -= 70;
                        manaPlayerZwei.setValue(currentMPplayerZwei[0]);

                        hpPlayerZwei.setString(currentHPplayerZwei[0] + " HP / 550 HP");
                        manaPlayerZwei.setString(currentMPplayerZwei[0] + " MP / 200 MP");

                        atkEinsPlayerZwei.setEnabled(false);
                        atkZweiPlayerZwei.setEnabled(false);
                        atkDreiPlayerZwei.setEnabled(false);
                        atkVierPlayerZwei.setEnabled(false);
                        atkEinsPlayerEins.setEnabled(true);
                        atkZweiPlayerEins.setEnabled(true);
                        atkDreiPlayerEins.setEnabled(true);
                        atkVierPlayerEins.setEnabled(true);


                    } else {

                        currentHPplayerZwei[0] += 60;
                        hpPlayerZwei.setValue(currentHPplayerZwei[0]);

                        currentMPplayerZwei[0] -= 70;
                        manaPlayerZwei.setValue(currentMPplayerZwei[0]);

                        hpPlayerZwei.setString(currentHPplayerZwei[0] + " HP / 550 HP");
                        manaPlayerZwei.setString(currentMPplayerZwei[0] + " MP / 200 MP");

                        atkEinsPlayerEins.setEnabled(true);
                        atkZweiPlayerEins.setEnabled(true);
                        atkDreiPlayerEins.setEnabled(true);
                        atkVierPlayerEins.setEnabled(true);

                        atkEinsPlayerZwei.setEnabled(false);
                        atkZweiPlayerZwei.setEnabled(false);
                        atkDreiPlayerZwei.setEnabled(false);
                        atkVierPlayerZwei.setEnabled(false);

                    }

                } else {

                }


            }
        });


        atkVierPlayerZwei.setSize(200, 50);
        atkVierPlayerZwei.setLocation(950, 525);
        atkVierPlayerZwei.setText("RECHARGE MP");
        atkVierPlayerZwei.setBackground(Color.CYAN);
        atkVierPlayerZwei.setFont(new Font("Consolas", Font.BOLD, 18));
        atkVierPlayerZwei.setFocusable(false);

        atkVierPlayerZwei.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentMPplayerZwei[0] + 55 > 200) {

                    currentMPplayerZwei[0] = 200;
                    manaPlayerZwei.setString(currentMPplayerZwei[0] + " MP / 200 MP");
                    manaPlayerZwei.setValue(currentMPplayerZwei[0]);

                    atkEinsPlayerEins.setEnabled(true);
                    atkZweiPlayerEins.setEnabled(true);
                    atkDreiPlayerEins.setEnabled(true);
                    atkVierPlayerEins.setEnabled(true);

                    atkEinsPlayerZwei.setEnabled(false);
                    atkZweiPlayerZwei.setEnabled(false);
                    atkDreiPlayerZwei.setEnabled(false);
                    atkVierPlayerZwei.setEnabled(false);

                } else {
                    currentMPplayerZwei[0] += 55;
                    manaPlayerZwei.setString(currentMPplayerZwei[0] + " MP / 200 MP");
                    manaPlayerZwei.setValue(currentMPplayerZwei[0]);

                    atkEinsPlayerEins.setEnabled(true);
                    atkZweiPlayerEins.setEnabled(true);
                    atkDreiPlayerEins.setEnabled(true);
                    atkVierPlayerEins.setEnabled(true);

                    atkEinsPlayerZwei.setEnabled(false);
                    atkZweiPlayerZwei.setEnabled(false);
                    atkDreiPlayerZwei.setEnabled(false);
                    atkVierPlayerZwei.setEnabled(false);

                }
            }
        });


        // Back button
        JButton exit = new JButton();
        exit.setSize(150, 50);
        exit.setLocation(50, 20);
        exit.setText("Back");
        exit.setFont(exit.getFont().deriveFont((float) 32));
        exit.setBackground(Color.MAGENTA);
        exit.setFocusable(false);


        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play.dispose();
                Main main = new Main();
            }
        });


        // Ermöglicht ein bewegliches Bild (Gif) einzufügen
        ImageIcon icon = new ImageIcon("Bilder/Galaxygif.gif");
        icon.setImage(icon.getImage().getScaledInstance(1600,820, Image.SCALE_DEFAULT));
        JLabel label = new JLabel();
        label.setBounds(0, 0, 1600, 820);
        label.setIcon(icon);


        play.getContentPane().add(exit);
        play.getContentPane().add(hpPlayerEins);
        play.getContentPane().add(hpPlayerZwei);
        play.getContentPane().add(manaPlayerEins);
        play.getContentPane().add(manaPlayerZwei);
        play.getContentPane().add(atkEinsPlayerEins);
        play.getContentPane().add(atkZweiPlayerEins);
        play.getContentPane().add(atkDreiPlayerEins);
        play.getContentPane().add(atkVierPlayerEins);
        play.getContentPane().add(atkEinsPlayerZwei);
        play.getContentPane().add(atkZweiPlayerZwei);
        play.getContentPane().add(atkDreiPlayerZwei);
        play.getContentPane().add(atkVierPlayerZwei);
        play.getContentPane().add(label);

        play.setVisible(true);


    }
}
