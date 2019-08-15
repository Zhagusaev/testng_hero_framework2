package RobotIntro;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class RobotIntro {

    public static void main(String[]args)throws Exception{
        Robot robot = new Robot();

        Rectangle rectangle = new Rectangle(500,500);
        BufferedImage image = robot.createScreenCapture(rectangle);
        ImageIO.write(image,"jpg",new File("src/test/resources/robot"+System.currentTimeMillis()+".jpg"));
    }



}
