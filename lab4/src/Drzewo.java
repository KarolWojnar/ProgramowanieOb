import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Drzewo {
    private JPanel MainPanel;
    private JTextField kursField;
    private JTextField priceField;
    private JButton oplacKursButton;
    private JButton wyjscieButton;
    private JTree kursyTree;
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public static void main(String[] args) {
        Drzewo drzewko = new Drzewo();

    }

    public Drzewo(){
        JFrame frame = new JFrame("Drzewko");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(this.MainPanel);
        frame.setSize(400, 400);
        frame.setVisible(true);
        this.createUIComponents(); //wywołanie naszego drzewka

        kursyTree.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                DefaultMutableTreeNode root = (DefaultMutableTreeNode) kursyTree.getSelectionPath().getLastPathComponent();

                kursField.setText(root.getUserObject().toString());

                String select = root.getUserObject().toString();

                if(select.equals("C++")) kursField.setText("C++");
                else if(select.equals("C#")) kursField.setText("C#");
                else if(select.equals("Java")) kursField.setText("Java");
                else if(select.equals("Python")) kursField.setText("Python");
                else if(select.equals("ASP.NET")) kursField.setText("ASP.NET");
                else if(select.equals("C")) kursField.setText("C");
                else if(select.equals("Photoshop")) kursField.setText("Photoshop");
                else if(select.equals("Corel")) kursField.setText("Corel");
                else if(select.equals("AutoCad")) kursField.setText("AutoCad");
                else if(select.equals("InDesign")) kursField.setText("InDesign");
            }
        });
        oplacKursButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dane;
                String m = JOptionPane.showInputDialog("Podaj dane:");
                if(m.isEmpty()) JOptionPane.showMessageDialog(frame,"Błędne dane");
                else JOptionPane.showMessageDialog(frame, m+ " Kurs opłacony");
            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
         //root
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Moje Kursy");

        //poziom 1
        DefaultMutableTreeNode Kprog = new DefaultMutableTreeNode("Programowanie");

        //poziom 2
        DefaultMutableTreeNode Prog1 = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode Prog2 = new DefaultMutableTreeNode("C#");
        DefaultMutableTreeNode Prog3 = new DefaultMutableTreeNode("Java");
        DefaultMutableTreeNode Prog4 = new DefaultMutableTreeNode("Puthon");
        DefaultMutableTreeNode Prog5 = new DefaultMutableTreeNode("ASP.NET");
        DefaultMutableTreeNode Prog6 = new DefaultMutableTreeNode("C");

        //dodawanie do gałezi Programowanie
        Kprog.add(Prog1);
        Kprog.add(Prog2);
        Kprog.add(Prog3);
        Kprog.add(Prog4);
        Kprog.add(Prog5);
        Kprog.add(Prog6);

        //poziom 1
        DefaultMutableTreeNode Graf = new DefaultMutableTreeNode("Grafika Komputerowa");

        //poziom 2
        DefaultMutableTreeNode Gra1 = new DefaultMutableTreeNode("Photoshop");
        DefaultMutableTreeNode Gra2 = new DefaultMutableTreeNode("Corel");
        DefaultMutableTreeNode Gra3 = new DefaultMutableTreeNode("AutoCad");
        DefaultMutableTreeNode Gra4 = new DefaultMutableTreeNode("Indesign");

        //dodawanie do gałezi grafika
        Graf.add(Gra1);
        Graf.add(Gra2);
        Graf.add(Gra3);
        Graf.add(Gra4);

        //dodanie do roota
        root.add(Kprog);
        root.add(Graf);

        //dodanie do drzewka całej hierarchii
        DefaultTreeModel myModel = new DefaultTreeModel(root);
        kursyTree = new JTree(myModel);
    }
}
