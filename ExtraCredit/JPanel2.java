import javax.swing.*;
import java.awt.*;

/**
 *Created by shenjianan on 2017/5/23.
 * This class stands for a JPanel at the center of the panel
 * @author shenjianan
 * @version 1.2
 * @see JLabel
 * @see JTextField
 */
public class JPanel2 extends JPanel{
    //declare a reference variable of JLabel as an instance variable
    private JLabel label1;
    //declare a reference variable of JPanel as an instance variable
    private JPanel myPanel;
    /**
     *set the layout of the class and initialize a JLabel
     */
    public JPanel2() {
        //set the layout of the panel to BorderLayout
        this.setLayout(new BorderLayout());
        //initiate a new panel so that the message could bt placed in the bottom of the panel as a JLabel
        myPanel = new JPanel();
        this.add(BorderLayout.SOUTH, myPanel);
        label1 = new JLabel("How many animals have come to the party?");
        myPanel.add(label1);
    }
    /**
     * set the text of the label
     * @param a the string needed to be set
     */
    public void setLabelText(String a) {
        label1.setText(a);
    }
}