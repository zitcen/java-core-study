package text;

import mouse.MouseFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName TextFrameTest
 * @Description TODO
 * @Author ztc
 * @Date 2024/11/12 18:00
 */
public class TextFrameTest {
    public static void main(String[] args) {
            EventQueue.invokeLater(() ->{
                TextComponentFrame frame = new TextComponentFrame();
                frame.setTitle("TextTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            });
    }
}
