package Sroda;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        super("Układ graficzny (Layout)");
        this.setBounds(300, 320, 300, 200);

        initComponents();

        this.setDefaultCloseOperation(3);
    }

    public void initComponents() {
        centrum = new JButton("Anuluj");
        gora = new JButton("GÓRA");
        dol = new JButton("DÓŁ");
        prawa = new JButton("PRAWA");
        lewa = new JButton("LEWA");

        Container kontener = this.getContentPane();

        centrum.setLocation(215, 135);
        centrum.setSize(centrum.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(centrum);

        gora.setLocation(30, 0);
        gora.setSize(gora.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(gora);

        dol.setLocation(30, 60);
        dol.setSize(gora.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(dol);

        lewa.setLocation(0, 30);
        lewa.setSize(gora.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(lewa);

        prawa.setLocation(70, 30);
        prawa.setSize(gora.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(prawa);
    }

    JButton centrum;
    JButton gora;
    JButton dol;
    JButton prawa;
    JButton lewa;

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
