import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZnajdzLiczbe {
    private JPanel MainPanel;
    private JLabel Zmiana;
    private JButton startButton;
    private JButton wiecejButton;
    private JButton takButton;
    private JButton mniejButton;
    private JPanel PanelDolny;

    public int x = 1;

    public int i = 512;
    public int liczba = 512;

    public static void main(String[] args) {
        ZnajdzLiczbe mojPanel = new ZnajdzLiczbe();
    }
    public ZnajdzLiczbe()
    {
        JFrame frame = new JFrame("Liczba");
        frame.setContentPane(this.MainPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 300);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Zmiana.setText("Czy Twoja liczba to:         "+ String.valueOf(liczba));
            }
        });
        wiecejButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x*=2;
                Zmiana.setText("Czy Twoja liczba to:         "+ String.valueOf(liczba = liczba + i/x));
            }
        });
        mniejButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x*=2;
                Zmiana.setText("Czy Twoja liczba to:         "+ String.valueOf(liczba = liczba - i/x));
            }
        });
        takButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Twoja liczba to: "+String.valueOf(liczba));
            }
        });
    }
}
