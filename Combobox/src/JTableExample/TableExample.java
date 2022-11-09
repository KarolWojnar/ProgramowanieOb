package JTableExample;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableExample extends JFrame{
    private JPanel MainPanel;
    private JPanel Table;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField1;
    private JTable table1;
    private JButton epButton;
    private JButton imdbButton;

    public static void main(String[] args) {
        TableExample tabelka = new TableExample();
        tabelka.setVisible(true);

    }

    public  TableExample()
    {
        super("Table");
        this.setContentPane(this.MainPanel);
        this.setDefaultCloseOperation(TableExample.EXIT_ON_CLOSE);
        this.setSize(700, 400);

        createTable();
    }
    private void createTable(){
        Object[][] data = {
                {"film 1 ", 2022, 8.121, 12341},
                {"film 2 ", 2020, 5.121, 3241},
                {"film 3 ", 2021, 7.121, 13341},
        };

        table1.setModel(new DefaultTableModel(
                data, new String[]{"Tytuł", "Rok", "Ocen", "Liczba opinii"}
        ));
    }
}
