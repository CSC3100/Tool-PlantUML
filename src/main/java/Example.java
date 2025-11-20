import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.GridLayout;

public class Example extends JFrame {

    public Example() {

        String uml = "@startuml\n" +
                "!pragma layout smetana\n" +
                "class Foo\n" +
                "class Bar\n" +
                "interface Interactive\n" +
                "abstract class Device\n" +
                "Foo ..|> Interactive\n" +
                "Bar --> Device\n" +
                "Bar ..> Foo\n" +
                "Device *-- Interactive\n" +
                "@enduml";

        UMLPanel panel = new UMLPanel(uml);
        JScrollPane panelWithScrollBars = new JScrollPane(panel);
        setLayout(new GridLayout(1, 1));
        add(panelWithScrollBars);
    }

    public static void main(String[] args) {
        Example frame = new Example();
        frame.setTitle("PlantUML Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}