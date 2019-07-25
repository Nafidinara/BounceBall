import greenfoot.*;
import java.awt.Font; //tambahkan Font

/**
 * Permainan BounceBall
 * 
 * latihan tugas skd 
 * Alfara Nafi DInara
 */
public class Counter extends Actor
{
    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;
    
    public Counter()
    {
        this("");
    }
    public Counter(String prefix)
    {
        text = prefix;
        stringLength = (text.length() +2) * 16;
        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0f)); //use larger font
        
        updateImage();
    }
    public void act() {
        if(value < target) {
            value++;
            updateImage();
        }
        else if(value > target) {
            value--;
            updateImage();
        }
    }
    public void add(int score)
    {
        target += score;
    }
    public void substract(int score)
    {
        target -= score;
    }
    public int getValue()
    {
        return value;
    }
    /**
     * make the image
     */
    private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 18);
    }
}
