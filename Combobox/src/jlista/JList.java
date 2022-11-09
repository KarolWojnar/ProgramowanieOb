package jlista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;

public class JList extends JFrame{
    private JPanel panel1;
    private JLabel ContractText;
    private javax.swing.JList saveList;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField addresField;
    private JTextField birthField;
    private JButton saveNewButton;
    private JButton saveExistingButton;

    List<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        JList lista = new JList();
        lista.setVisible(true);
    }

    public JList(){
        super("app");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JList.DISPOSE_ON_CLOSE);
        this.setSize(500, 600);

        list.add("Jan Kowalski");
        list.add("jkowal@gmail.com");
        list.add("555000444");
        list.add("Piastow 1/33, Rzeszów");
        list.add("05-09-1990");


        saveNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        public void setModel(
                javax.swing.ListModel<E> model)
    }
}
