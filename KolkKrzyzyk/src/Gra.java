import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gra{
    private JPanel MainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    static int kolej = 0;
    static boolean[] iWasHere = new boolean[9];

    int remis = 0;
    static int[] kombine = new int[9];

    public static void main(String[] args) {
        Gra gierka = new Gra();
    }

    int SprawdzamMozliweWygrane(int[] kombine)
    {
        if ((kombine[0] == 1 && kombine[1] == 1 && kombine[2] == 1) ||
                (kombine[3] == 1 && kombine[4] == 1 && kombine[5] == 1) ||
                (kombine[6] == 1 && kombine[7] == 1 && kombine[8] == 1) ||
                (kombine[0] == 1 && kombine[3] == 1 && kombine[6] == 1) ||
                (kombine[1] == 1 && kombine[4] == 1 && kombine[7] == 1) ||
                (kombine[2] == 1 && kombine[5] == 1 && kombine[8] == 1) ||
                (kombine[0] == 1 && kombine[4] == 1 && kombine[8] == 1) ||
                (kombine[2] == 1 && kombine[4] == 1 && kombine[6] == 1)) {
            return 10;
        }
        else if((kombine[0] == 2 && kombine[1] == 2 && kombine[2] == 2) ||
                (kombine[3] == 2 && kombine[4] == 2 && kombine[5] == 2) ||
                (kombine[6] == 2 && kombine[7] == 2 && kombine[8] == 2) ||
                (kombine[0] == 2 && kombine[3] == 2 && kombine[6] == 2) ||
                (kombine[1] == 2 && kombine[4] == 2 && kombine[7] == 2) ||
                (kombine[2] == 2 && kombine[5] == 2 && kombine[8] == 2) ||
                (kombine[0] == 2 && kombine[4] == 2 && kombine[8] == 2) ||
                (kombine[2] == 2 && kombine[4] == 2 && kombine[6] == 2)){
            return 20;
        }
        else  return remis++;
    }
    public Gra()
    {
        JFrame frame = new JFrame("Kolko krzyzyk");
        frame.setContentPane(this.MainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.pack();
        button1.setFont(new Font("Arial", Font.ROMAN_BASELINE, 130));
        button2.setFont(new Font("Arial", Font.ROMAN_BASELINE, 130));
        button3.setFont(new Font("Arial", Font.ROMAN_BASELINE, 130));
        button4.setFont(new Font("Arial", Font.ROMAN_BASELINE, 130));
        button5.setFont(new Font("Arial", Font.ROMAN_BASELINE, 130));
        button6.setFont(new Font("Arial", Font.ROMAN_BASELINE, 130));
        button7.setFont(new Font("Arial", Font.ROMAN_BASELINE, 130));
        button8.setFont(new Font("Arial", Font.ROMAN_BASELINE, 130));
        button9.setFont(new Font("Arial", Font.ROMAN_BASELINE, 130));
        for(int i = 0; i < 9; i++)
        {
            iWasHere[i] = false;
            kombine[i] = 0;
        }

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(iWasHere[0]==false) {
                    if (kolej % 2 == 0){
                        button1.setText("X");
                        kombine[0] = 1;
                    }
                    else if (kolej % 2 == 1){
                        button1.setText("O");
                        kombine[0] = 2;
                    }
                    kolej++;
                    iWasHere[0] = true;
                    if(SprawdzamMozliweWygrane(kombine)==10)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem 'X'");
                 else if (SprawdzamMozliweWygrane(kombine)==20)
                    JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem '0'");
                 else if(SprawdzamMozliweWygrane(kombine)==26)
                     JOptionPane.showMessageDialog(frame, "REMIS!");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(iWasHere[1]==false) {
                    if (kolej % 2 == 0){
                        button2.setText("X");
                        kombine[1] = 1;
                    }
                    else if (kolej % 2 == 1){
                        button2.setText("O");
                        kombine[1] = 2;
                    }
                    kolej++;
                    iWasHere[1] = true;
                    if(SprawdzamMozliweWygrane(kombine)==10)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem 'X'");
                    else if (SprawdzamMozliweWygrane(kombine)==20)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem '0'");
                    else if(SprawdzamMozliweWygrane(kombine)==26)
                        JOptionPane.showMessageDialog(frame, "REMIS!");
            }}
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(iWasHere[2]==false) {
                    if (kolej % 2 == 0){
                        button3.setText("X");
                        kombine[2] = 1;
                    }
                    else if (kolej % 2 == 1){
                        button3.setText("O");
                        kombine[2] = 2;
                    }
                    kolej++;
                    iWasHere[2] = true;
                    if(SprawdzamMozliweWygrane(kombine)==10)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem 'X'");
                    else if (SprawdzamMozliweWygrane(kombine)==20)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem '0'");
                    else if(SprawdzamMozliweWygrane(kombine)==26)
                        JOptionPane.showMessageDialog(frame, "REMIS!");
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(iWasHere[3]==false) {
                    if (kolej % 2 == 0){
                        button4.setText("X");
                        kombine[3] = 1;
                    }
                    else if (kolej % 2 == 1){
                        button4.setText("O");
                        kombine[3] = 2;
                    }
                    kolej++;
                    iWasHere[3] = true;
                    if(SprawdzamMozliweWygrane(kombine)==10)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem 'X'");
                    else if (SprawdzamMozliweWygrane(kombine)==20)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem '0'");
                    else if(SprawdzamMozliweWygrane(kombine)==26)
                        JOptionPane.showMessageDialog(frame, "REMIS!");
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(iWasHere[4]==false) {
                    if (kolej % 2 == 0){
                        button5.setText("X");
                        kombine[4] = 1;
                    }
                    else if (kolej % 2 == 1){
                        button5.setText("O");
                        kombine[4] = 2;
                    }
                    kolej++;
                    iWasHere[4] = true;
                    if(SprawdzamMozliweWygrane(kombine)==10)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem 'X'");
                    else if (SprawdzamMozliweWygrane(kombine)==20)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem '0'");
                    else if(SprawdzamMozliweWygrane(kombine)==26)
                        JOptionPane.showMessageDialog(frame, "REMIS!");
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(iWasHere[5]==false) {
                    if (kolej % 2 == 0){
                        button6.setText("X");
                        kombine[5] = 1;
                    }
                    else if (kolej % 2 == 1){
                        button6.setText("O");
                        kombine[5] = 2;
                    }
                    kolej++;
                    iWasHere[5] = true;
                    if(SprawdzamMozliweWygrane(kombine)==10)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem 'X'");
                    else if (SprawdzamMozliweWygrane(kombine)==20)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem '0'");
                    else if(SprawdzamMozliweWygrane(kombine)==26)
                        JOptionPane.showMessageDialog(frame, "REMIS!");
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(iWasHere[6]==false) {
                    if (kolej % 2 == 0){
                        button7.setText("X");
                        kombine[6] = 1;
                    }
                    else if (kolej % 2 == 1){
                        button7.setText("O");
                        kombine[6] = 2;
                    }
                    kolej++;
                    iWasHere[6] = true;
                    if(SprawdzamMozliweWygrane(kombine)==10)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem 'X'");
                    else if (SprawdzamMozliweWygrane(kombine)==20)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem '0'");
                    else if(SprawdzamMozliweWygrane(kombine)==26)
                        JOptionPane.showMessageDialog(frame, "REMIS!");
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(iWasHere[7]==false) {
                    if (kolej % 2 == 0){
                        button8.setText("X");
                        kombine[7] = 1;
                    }
                    else if (kolej % 2 == 1){
                        button8.setText("O");
                        kombine[7] = 2;
                    }
                    kolej++;
                    iWasHere[7] = true;
                    if(SprawdzamMozliweWygrane(kombine)==10)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem 'X'");
                    else if (SprawdzamMozliweWygrane(kombine)==20)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem '0'");
                    else if(SprawdzamMozliweWygrane(kombine)==26)
                        JOptionPane.showMessageDialog(frame, "REMIS!");
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(iWasHere[8]==false) {
                    if (kolej % 2 == 0) {
                        button9.setText("X");
                        kombine[8] = 1;
                    }
                    else if (kolej % 2 == 1){
                        button9.setText("O");
                        kombine[8] = 2;
                    }
                    kolej++;
                    iWasHere[8] = true;
                    if(SprawdzamMozliweWygrane(kombine)==10)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem 'X'");
                    else if (SprawdzamMozliweWygrane(kombine)==20)
                        JOptionPane.showMessageDialog(frame, "Wygrał gracz grający znakiem '0'");
                    else if(SprawdzamMozliweWygrane(kombine)==26)
                        JOptionPane.showMessageDialog(frame, "REMIS!");
                }
            }
        });

    }
}
