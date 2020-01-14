import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;

public class gui extends JFrame implements ActionListener {
    private JTextField input, result;

    public gui() {
        // Change the title of the GUI window!
        super("Strings Project");
        Box box1 = Box.createVerticalBox();
        box1.add(Box.createVerticalStrut(20));
        // Change the label of the top input!
        box1.add(new JLabel("Input:"));
        box1.add(Box.createVerticalStrut(20));
        // Change the label of the bottom input!
        box1.add(new JLabel("Result:"));

        input = new JTextField(20);
        // Change the background color of the top input box!
        input.setBackground(Color.LIGHT_GRAY);
        input.addActionListener(this);
        input.selectAll();

        result = new JTextField(20);
        // Change the background color of the bottom input box!
        result.setBackground(Color.WHITE);
        result.setEditable(false);

        Box box2 = Box.createVerticalBox();
        box1.add(Box.createVerticalStrut(20));
        box2.add(input);
        box2.add(Box.createVerticalStrut(20));
        box2.add(result);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(box1);
        c.add(box2);
        input.requestFocus();

    }

    public void actionPerformed(ActionEvent e) {
        // Grab text from top GUI input
        String str = input.getText();

        /**
         * TODO:
         *  (1) add your methods here to run in the GUI
         *  (2) only run one at a a time
         *  (3) use str object to pass to your methods
         */

        // METHODS GO HERE!! (Comment out all unused methods)

//        str = sayHello(str);
        str = sayGoodbye(str);







        // Sets the result text to the bottom GUI input
        result.setText(str);
        input.selectAll();
    }

    /**
     * TODO:
     *  (1) create your methods here
     */

    String sayHello(String s){
        return "Hello " + s;
    }

    String sayGoodbye(String s){
        return "Goodbye " + s;
    }


    public static void main(String[] args) {
        // No further work necessary in the main method
        gui window = new gui();
        window.setBounds(100, 100, 360, 160);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}

