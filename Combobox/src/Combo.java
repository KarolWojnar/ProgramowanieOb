import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combo extends JFrame{
    private JPanel MainPanel;
    private JComboBox comboBox1;
    private JButton showButton;
    private JLabel textLab;

    public static void main(String[] args) {
        Combo combo = new Combo();
        combo.setVisible(true);
    }

    public Combo(){
        super("Example");
        this.setContentPane(this.MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        createComboBox();

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Wybrano język: " + comboBox1.getItemAt(comboBox1.getSelectedIndex());
                textLab.setText(data);
            }
        });
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data2 = (String) comboBox1.getSelectedItem();
                JOptionPane.showMessageDialog(Combo.this, "Wybrano język: " + data2);
            }
        });
    }

    private void createComboBox(){
        comboBox1.setModel(new DefaultComboBoxModel(new String[]{"C++", "C#", "Java", "Python", "PHP"}));
    }
}
