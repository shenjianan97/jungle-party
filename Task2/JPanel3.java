import javax.swing.*;
import java.awt.*;
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
    //Declare an array variable of JButtons as an instance variable
    private JButton[] button = new JButton[10];
    //declare a reference variable of JPanel1 as an instance variable
    private JPanel1 panel1;
    //declare a reference variable of JPanel2 as an instance variable
    private JPanel2 panel2;
    public int inputNumber;
    /**
     * sets the components of panel1 and panel2, and initializes and adds 10 buttons
     * @param panel1 The panel at the top of the frame
     * @param panel2 The panel at the center of the frame
     */
    public JPanel3(JPanel1 panel1, JPanel2 panel2) {
        this.panel1 = panel1;
        this.panel2 = panel2;
        //set the layout of the panel to GridLayout
        this.setLayout(new GridLayout(0,5,10,10));
        //use a loop to declare JButtons and add them to the panel
        for(int i = 0; i < 10; i++) {
            button[i] = new JButton((i+1) + "");
            button[i].addActionListener(new ButtonListener(i+1));
            this.add(button[i]);
        }
    }
    /**
     * check if existing number of images is equal to the number imputed
     */
    public void check() {
            if (panel1.getImageNumber() == this.inputNumber) {
                panel2.setLabelText("Correct! How many animals are in the party now?");
                panel1.rebuilt();
            } else
                panel2.setLabelText("Wrong! Try again!");
        }
    /**
     * a inner class which implements ActionListener
     */
    public class ButtonListener implements ActionListener {
        int i;
        /**
         * @param i get the number of the loop which stands for the number of the button
         */
        public ButtonListener(int i)
        {
            this.i = i;
        }
        public void actionPerformed(ActionEvent event) {
            inputNumber = i;
            check();
        }
    }
}
