import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

/**
 * Created by shenjianan on 2017/5/23.
 * This class stands for a JPanel at the top of the panel
 * @author shenjianan
 * @version 1.2
 * @see JLabel
 * @see ImageIcon
 */
public class JPanel1 extends JPanel{
    //Declare an array variable of JLabels
    private JLabel[] imageLabel = new JLabel[10];
    //record the times the method init(int) is called
    private int times = 0;
    //record the number of images
    private int imageNumber;
    public JPanel1() {
        init(times);
        times++;
    }
    /**
     *initialize the panel according the times it is called
     * @param times the times the method is called
     */
    private void init(int times) {
        if(times == 0) {
            imageNumber = 10;
        }
        else{
            imageNumber = new Random().nextInt(10) + 1;
            this.removeAll();
            this.updateUI();
            JPanel3.text.setText("Click on animals you wish to kick out of the party!");
        }
        setImage(imageNumber);
    }
    /**
     * set the images in the Label and add it to the panel according to the number of the images
     * @param imageNumber the number of the images
     */
    private void setImage(int imageNumber) {
        //set the layout of the panel to GridLayout
        this.setLayout(new GridLayout(0, 5));
        //use a loop to declare icons of images and add them to the labels according to the number of images
        for (int i = 0; i < imageNumber; i++) {
            ImageIcon icon = new ImageIcon("res/animal/animal" + (i + 1) + ".png");
            imageLabel[i] = new JLabel(icon);
            imageLabel[i].addMouseListener(new imageListener(i));
            this.add(imageLabel[i]);
        }
    }
    /**
     * provide a method to rebuilt this panel
     */
    public void rebuilt() {
        init(times);
        times++;
    }
    /**
     * @return the number of the images
     */
    public int getImageNumber() {
        return imageNumber;
    }
    /**
     * a inner class which implements MouseListener
     */
    public class imageListener implements MouseListener {
        private int i;
        /**
         * a constructor which gets the number
         * @param i the number stands for the serial number of the images
         */
        public imageListener(int i) {
            this.i = i;
        }
        /**
         * a override method which controls the visibilities of the images
         * @param e MouseEvent
         */
        public void mouseClicked(MouseEvent e) {
            imageLabel[i].setVisible(false);
            imageNumber--;
            JPanel3.text.setText("Animal gone! How many animals are in the party now?");
        }
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
    }
}
