import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Zad1 {
    private JPanel MainPanel;
    private JList list1;
    private JList list2;
    private JButton allToRig;
    private JButton allToLef;
    private JButton selToRight;
    private JButton selToLeft;

    public static String[] tabOfEleme = {"Java", "Python", "C++", "C#"};

    public static List<String> l1 = new ArrayList<>();

    public static List<String> l2 = new ArrayList<>();

    public static void main(String[] args) {
        Zad1 zadanko = new Zad1();
    }

    public Zad1(){
        JFrame frame = new JFrame("Zad1");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(this.MainPanel);
        frame.setVisible(true);
        frame.setSize(400,300);
        l1.addAll(List.of(tabOfEleme));
        createList();

        selToRight.addActionListener(e -> {
            int index = list1.getSelectedIndex();
            l2.add(l1.get(index));
            l1.remove(index);
            createList();
        });
        selToLeft.addActionListener(e -> {
            int index = list2.getSelectedIndex();
            l1.add(l2.get(index));
            l2.remove(index);
            createList();
        });
        allToRig.addActionListener(e ->{
            l2.addAll(l1);
            l1.clear();
            createList();
    });
        allToLef.addActionListener(e ->{
            l1.addAll(l2);
            l2.clear();
            createList();
        });
    }
    public void createList()
    {
        list1.setListData(l1.toArray());
        list2.setListData(l2.toArray());
    }
}
