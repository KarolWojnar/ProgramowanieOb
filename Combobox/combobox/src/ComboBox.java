import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.*;
import java.util.List;

public class ComboBox extends JFrame{
    private JPanel MainPanel;
    private JList listContacts;
    private JPanel buttonsPanel;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField numberField;
    private JTextField adresField;
    private JTextField birthField;
    private JButton saveNewButton;
    private JButton saveExistingButton;
    private JPanel textPanel;
    private JLabel ageLabel;

    private static Object jk[] = {"Jan Kowalski", "jkowalski@gmial.com", "Piastów 1", "543688592", LocalDate.of(2000, 10, 05)};
    private static Object an[] = {"Adam Nowak", "anowak@gmial.com", "Hetmańska 4", "596993012", LocalDate.of(1990, 04, 11)};
    private static Object mw[] = {"Michał Wiśniewski", "mwiśnia@gmial.com", "Rejtana 4", "441030111", LocalDate.of(1998, 11, 29)};
    private static Object ak[] = {"Andrzej Krychowiak", "akrycha@gmial.com", "Biecka 5", "909773621", LocalDate.of(2003, 03, 15)};

    public static List<String> names = new ArrayList<>();
    public static List<Object> allInfo = new ArrayList<>();


    public static void main(String[] args) {
        ComboBox beksik = new ComboBox();
        beksik.setVisible(true);

    }

    public ComboBox()
    {
        super("App");
        this.setContentPane(this.MainPanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 400);

        saveExistingButton.setEnabled(false);

        names.add((String) jk[0]);
        names.add((String) an[0]);
        names.add((String) mw[0]);
        names.add((String) ak[0]);

        allInfo.addAll(List.of(jk));
        allInfo.addAll(List.of(an));
        allInfo.addAll(List.of(mw));
        allInfo.addAll(List.of(ak));

        createListOfNames();

        saveNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allInfo.add(nameField.getText());
                allInfo.add(emailField.getText());
                allInfo.add(numberField.getText());
                allInfo.add(adresField.getText());
                allInfo.add(String.valueOf(LocalDate.parse(String.valueOf(birthField.getText()))));
                names.add(nameField.getText());
                int age = LocalDate.now().getYear() - LocalDate.parse(String.valueOf(birthField.getText())).getYear();
                ageLabel.setText(age+" years");
                createListOfNames();
            }
        });

        saveExistingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int takeIndex = listContacts.getSelectedIndex();
                allInfo.set(takeIndex * 5, nameField.getText());
                names.set(takeIndex, nameField.getText());
                allInfo.set(takeIndex * 5 + 1, emailField.getText());
                allInfo.set(takeIndex * 5 + 2, numberField.getText());
                allInfo.set(takeIndex * 5 + 3, adresField.getText());
                allInfo.set(takeIndex * 5 + 4, LocalDate.parse(String.valueOf(birthField.getText())));
                saveExistingButton.setEnabled(true);
                createListOfNames();
            }
        });

        listContacts.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int takeIndex = listContacts.getSelectedIndex();
                nameField.setText(allInfo.get(takeIndex * 5).toString());
                emailField.setText(allInfo.get(takeIndex * 5 + 1).toString());
                numberField.setText(allInfo.get(takeIndex * 5 + 2).toString());
                adresField.setText(allInfo.get(takeIndex * 5 + 3).toString());
                birthField.setText(allInfo.get(takeIndex * 5 + 4).toString());
                int age = LocalDate.now().getYear() - LocalDate.parse(allInfo.get(takeIndex*5+4).toString()).getYear();
                ageLabel.setText(age + " years");
                saveExistingButton.setEnabled(true);
            }
        });
    }

    public void createListOfNames()throws IndexOutOfBoundsException {
        try {
            DefaultListModel names = new DefaultListModel();
            names.addAll(this.names);
            listContacts.setModel(names);
        } catch(IndexOutOfBoundsException e) {}
    }

}
