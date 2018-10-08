import javax.swing.*;
import java.awt.*;
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
     * initialize the panel according to the times the method is called
     * @param times the times the method is called
     */
    private void init(int times) {
        if(times == 0) {
            imageNumber = 10;
            //set the layout of the panel to GridLayout
            this.setLayout(new GridLayout(0, 5));
            //use a loop to declare icons of images and add them to the labels according to the number of images
            for (int i = 0; i < imageNumber; i++) {
                ImageIcon icon = new ImageIcon("res/animal/animal" + (i + 1) + ".png");
                imageLabel[i] = new JLabel(icon);
                this.add(imageLabel[i]);
            }
        }
        else{
            this.removeAll();
            this.updateUI();
            //set the layout of the panel to GridLayout
            this.setLayout(new GridLayout(0,5));
            //use a loop to declare icons of images and add them to the labels according to the number of images
            imageNumber = new Random().nextInt(10) + 1;
            for(int i = 0; i < imageNumber; i++) {
                ImageIcon icon = new ImageIcon("res/animal/animal" + (i+1) + ".png");
                imageLabel[i] = new JLabel(icon);
                this.add(imageLabel[i]);
            }
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
    public int getImageNumber()
    {
        return imageNumber;
    }
}
