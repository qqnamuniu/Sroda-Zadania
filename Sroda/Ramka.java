package Sroda;

import javax.swing.*;

public class Ramka extends JFrame
{
    public Ramka()
    {
        super("Tytuł ramki");

        this.setBounds(100, 50, 300, 100);


        this.setDefaultCloseOperation(3);

    }
    public static void main(String[] args)
    {
        new Ramka().setVisible(true);
    }
}
