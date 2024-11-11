package mouse;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName MouseTest
 * @Description TODO
 * @Author ztc
 * @Date 2024/11/11 11:49
 */
public class MouseTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            MouseFrame frame = new MouseFrame();
            frame.setTitle("MouseTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
