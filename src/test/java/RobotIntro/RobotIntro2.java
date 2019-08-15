package RobotIntro;

import Utilities.Driver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotIntro2 {
    public static void main(String[] args) throws Exception {
        pressKeypadKeys();
    }

    public static void pressKeypadKeys()throws AWTException{
        Driver.getDriver("chrome").get("https://www.facebook.com");
        Robot robot = new Robot();
        //Key
        robot.keyPress(KeyEvent.CTRL_DOWN_MASK);
        robot.keyPress(KeyEvent.VK_A);

        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.CTRL_DOWN_MASK);
    }
}
