import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by shenjianan on 2017/5/23.<br>
 * This class stands for a JPanel at the bottom of the panel
 * @author shenjianan
 * @version 1.2
 * @see JPanel1
 * @see JPanel2
 * @see JButton
 */
public class JPanel3 extends JPanel{
    //Declare an JButton variable  as an instance variable
    private JButton button;
    //declare a reference variable of JPanel1 as an instance variable
    private JPanel1 panel1;
    //declare a reference variable of JPanel2 as an instance variable
    private JPanel2 panel2;
    /**
     * sets the components of panel1 and panel2, and initializes and adds 10 buttons
     * @param panel1 The panel at the top of the frame
     * @param panel2 The panel at the center of the frame
     */
    public JPanel3(JPanel1 panel1, JPanel2 panel2) {
        this.panel1 = panel1;
        this.panel2 = panel2;
        button = new JButton("Check!");
        this.add(button);
        //add a ButtonListener to the button
        button.addActionListener(new ButtonListener());
        button.setSize(50,25);
    }
    /**
     * a inner class which implements the class ActionListener to be a Listener
     */
    public class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (panel2.text.getText().equals("")) {}
            else{
                if (panel1.getImageNumber() == panel2.getInputNumber()) {
                    panel2.setLabelText("Correct! How many animals are in the party now?");
                    panel1.rebuilt();
                } else
                    panel2.setLabelText("Wrong! Try again!");
                //to clear the JTextField and make the cursor focused on the textfield
                panel2.text.setText("");
                panel2.text.requestFocus();
            }
        }
    }
}
