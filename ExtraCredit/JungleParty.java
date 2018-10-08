import javax.swing.*;
import java.awt.*;

/**
 * <p>Created by shenjianan on 2017/5/23.</p>
 * <p>This class is the main class of this project. It implements JFrame class and has three JPanels.</p>
 * @author shenjianan
 * @version 1.2
 * @see #main(String[])
 * @see JPanel1
 * @see JPanel2
 * @see JPanel
 */
public class JungleParty extends JFrame{
    /**
     * Instance variable for panel1
     */
    private JPanel1 panel1;
    /**
     * Instance variable for panel2
     */
    private JPanel2 panel2;
    /**
     * Instance variable for panel3
     */
    private JPanel3 panel3;
    /**
     * Description: initialize three panels and set the layout
     * @param num receives the number of images needed to be displayed firstly
     */
    public JungleParty(int num) {
        panel1 = new JPanel1(num);
        panel2 = new JPanel2();
        panel3 = new JPanel3(panel1, panel2);
        //set the layout of the frame to BorderLayout
        this.getContentPane().setLayout(new BorderLayout());
        //add three panels to the frame
        this.getContentPane().add(BorderLayout.NORTH, panel1);
        this.getContentPane().add(BorderLayout.CENTER, panel2);
        this.getContentPane().add(BorderLayout.SOUTH, panel3);
    }
    public static void main(String[] args) {
        //check if the user input a number
        if(args.length == 0) {
            System.out.println("You have not input a number!");
            System.exit(0);
        }
        //check if the number the user input is between 10 and 20
        if((Integer.parseInt(args[0]) < 10) || (Integer.parseInt(args[0])) > 20) {
            System.out.println("The number you input is out of bound!");
            System.exit(0);
        }
        //initiate a frame according to the number the user input
        JungleParty frame = new JungleParty(Integer.parseInt(args[0]));
        //set the attributes of the frame
        frame.setTitle("Welcome to the Jungle Party!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);
        frame.setLocationRelativeTo(frame.getOwner());
        frame.setVisible(true);
    }
}