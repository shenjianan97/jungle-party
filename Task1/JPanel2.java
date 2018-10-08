import javax.swing.*;
import java.awt.*;

/**
 * Created by shenjianan on 2017/5/23.
 * This class stands for a JPanel at the center of the panel
 * @author shenjianan
 * @version 1.2
 * @see JLabel
 * @see JTextField
 */
public class JPanel2 extends JPanel{
    //declare a reference variable of JLabel as an instance variable
    private JLabel label1;
    //declare a reference variable of JTextField
    public JTextField text;
    //declare a reference variable of JPanel as an instance variable
    private JPanel myPanel;
    /**
     *set the layout of the class and initialize a JLabel and a JTextFiled
     */
    public JPanel2() {
        //set the layout of the panel to BorderLayout
        this.setLayout(new BorderLayout());
        myPanel = new JPanel();
        this.add(BorderLayout.SOUTH, myPanel);
        //initiate a new panel so that the message could bt placed in the bottom of the panel as a JLabel
        label1 = new JLabel("How many animals have come to the party?");
        text = new JTextField(2);
        myPanel.add(label1);
        myPanel.add(text);
    }
    /**
     * @return The number in the JTextField
     */
    public int getInputNumber() {
        String numString = text.getText();
        return Integer.parseInt(numString);
    }
    /**
     * @param a the string needed to be set
     */
    public void setLabelText(String a) {
        label1.setText(a);
    }
}