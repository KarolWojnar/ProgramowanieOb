import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zdj_wybor {
    private JPanel MainPanel;
    private JRadioButton linuxRadioButton;
    private JRadioButton macintoshRadioButton;
    private JRadioButton windowsRadioButton;
    private JButton OKButton;
    private JPanel Panel2;

    private String wybor;

    private JLabel ikonka;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("img.png"));
    private ImageIcon iconWin = new ImageIcon(getClass().getResource("img_1.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("img_2.png"));


    public ImageIcon setSizeIcon(ImageIcon ic) {
        Image im = ic.getImage();
        Image newImg = im.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }


    public static void main(String[] args) {
        Zdj_wybor logowanie = new Zdj_wybor();
    }

    public Zdj_wybor() {
        JFrame frame = new JFrame("Wybor");
        frame.setContentPane(this.MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ikonka.setIcon(setSizeIcon(iconLinux));
                wybor = "Linuxa!";
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ikonka.setIcon(setSizeIcon(iconWin));
                wybor = "Windowsa!";
            }
        });
        macintoshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ikonka.setIcon(setSizeIcon(iconMac));
                wybor = "Maca!";
            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Wybrałeś "+wybor);
            }
        });
    }
}
