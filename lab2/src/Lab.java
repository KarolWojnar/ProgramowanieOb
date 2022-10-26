import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab extends JFrame implements ActionListener {

    private String user = "karol";
    private String pw = "qwerty";
    private JPanel MainPanel;
    private JButton loginButton;
    private JTextField textUsername;
    private JTextField textPassword;
    private JLabel wynik;
    private JPasswordField passwordField1;

    public static void main(String[] args) {
        Lab logowanie = new Lab();
    }
    public Lab()
    {
        JFrame frame = new JFrame("PasswordLogin");
        frame.setContentPane(this.MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik.setText("Username: "+textUsername.getText()+" Password: "+new String(passwordField1.getPassword()));
                if(textUsername.getText().equals(user) && new String(passwordField1.getPassword()).equals(pw))
                    JOptionPane.showMessageDialog(frame, "Zostałes zalogowany!");
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
