import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad2 {
    private JPanel MainPanel;
    private JComboBox comboBox1;
    private JButton bButton;
    private JButton iButton;
    private JButton zButton;
    private JButton pButton;
    private JTextField textArea;

    private boolean ifBold = false;

    private boolean ifItalic = false;

    private int accSize;

    public static void main(String[] args) {
        Zad2 zadanko2 = new Zad2();
    }

    public Zad2() {
        JFrame frame = new JFrame("Zad2");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(this.MainPanel);
        frame.setSize(400, 400);
        frame.setVisible(true);
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = comboBox1.getSelectedIndex();
                if (index == 0) textArea.setForeground(Color.red);
                else if (index == 1) textArea.setForeground(Color.green);
                else if (index == 2) textArea.setForeground(Color.blue);
                else if (index == 3) textArea.setForeground(Color.yellow);
                else if (index == 4) textArea.setForeground(Color.black);
                else if (index == 5) textArea.setForeground(Color.gray);
                else if (index == 6) textArea.setForeground(new Color(124, 70, 175));
            }
        });

        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!ifBold && !ifItalic)
                {
                    bold();
                    ifBold = true;
                }
                else if(!ifBold && ifItalic)
                {
                    italicibold();
                    ifBold = true;
                }
                else if(ifBold && !ifItalic)
                {
                    unbold();
                    ifBold = false;
                }
                else if(ifBold && ifItalic)
                {
                    italiciunbold();
                    ifBold = false;
                }
            }
        });
        iButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!ifBold && !ifItalic)
                {
                    italic();
                    ifItalic = true;
                }
                else if(!ifBold && ifItalic)
                {
                    unitalic();
                    ifItalic = false;
                }
                else if(ifBold && !ifItalic)
                {
                    italicibold();
                    ifItalic = true;
                }
                else if(ifBold && ifItalic)
                {
                    unitalicibold();
                    ifItalic = false;
                }
            }
        });
        zButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accSize = textArea.getFont().getSize()-1;
                newSize();
            }
        });
        pButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accSize = textArea.getFont().getSize()+1;
                newSize();
            }
        });
    }

    public void newSize()
    {
        textArea.setFont(new Font(textArea.getFont().getName(), textArea.getFont().getStyle(),accSize ));
    }
    public void bold ()
    {
        textArea.setFont(new Font(textArea.getFont().getName(), Font.BOLD, textArea.getFont().getSize()));
    }
    public void italic ()
    {
        textArea.setFont(new Font(textArea.getFont().getName(), Font.ITALIC, textArea.getFont().getSize()));
    }
    public void unbold ()
    {
        textArea.setFont(new Font(textArea.getFont().getName(), ~Font.BOLD, textArea.getFont().getSize()));
    }
    public void unitalic ()
    {
        textArea.setFont(new Font(textArea.getFont().getName(), ~Font.ITALIC, textArea.getFont().getSize()));
    }
    public void italicibold()
    {
        textArea.setFont(new Font(textArea.getFont().getName(), Font.BOLD+Font.ITALIC, textArea.getFont().getSize()));
    }
    public void italiciunbold()
    {
        textArea.setFont(new Font(textArea.getFont().getName(), Font.PLAIN+Font.ITALIC, textArea.getFont().getSize()));
    }
    public void unitalicibold()
    {
        textArea.setFont(new Font(textArea.getFont().getName(), Font.BOLD+Font.PLAIN, textArea.getFont().getSize()));
    }
}

