import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PO_lab2_Swing {
    private JPanel Panel1;
    private JButton startButton;
    private JButton stopButton;
    private JLabel LabA;
    private JLabel LabB;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JLabel WynikLab;
    private JLabel DataLabel;
    double liczbaA, liczbaB, wynik;

    //    public static void main(String[] args) {
//        PO_lab2_Swing okienko = new PO_lab2_Swing();
//        okienko.setVisible(true);//wyswietla ramke
//    }
//    public PO_lab2_Swing()
//    {
//        super("Moja pierwsza aplikacja");
//        this.setContentPane(this.Panel1);//wysw. na ekranie
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//zamkniecie okna
//        this.setSize(300, 400);//rozmiar okienka
//        this.pack();//pozwala spakować wszystko i dostosuje wielkość
//    }
    //sposob 2
    public static void main(String[] args) {
    PO_lab2_Swing okienko2 = new PO_lab2_Swing();
    }
    public PO_lab2_Swing()
    {
        JFrame frame = new JFrame("Moja pierwsza apka");
        frame.setContentPane(this.Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
//        frame.pack();

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczbaA = Double.parseDouble(textFieldA.getText());
                liczbaB = Double.parseDouble(textFieldB.getText());
                wynik = liczbaA+liczbaB;
                WynikLab.setText("Suma"+String.valueOf(liczbaA)+" "+String.valueOf(liczbaB)+ " = "+String.valueOf(wynik));
            }
        });
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczbaA = Double.parseDouble(textFieldA.getText());
                liczbaB = Double.parseDouble(textFieldB.getText());
                wynik = liczbaA-liczbaB;
                WynikLab.setText("Roznica: "+String.valueOf(liczbaA)+" "+String.valueOf(liczbaB)+ " = "+String.valueOf(wynik));
            }
        });
    }

}
