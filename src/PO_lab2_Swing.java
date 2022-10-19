import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PO_lab2_Swing {
    private JPanel Panel1;
    private JButton startButton;
    private JButton stopButton;
    private JLabel LabA;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JLabel WynikLab;
    private JLabel DataLabel;
    double stopnie;
    double wynik;

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

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopnie = Double.parseDouble(textFieldA.getText());
                wynik = stopnie+32;
                WynikLab.setText(String.valueOf(stopnie)+" na Fahreneity to: "+ String.valueOf(wynik));
            }
        });
    }

}
