package check;


import javax.swing.*;
import java.awt.*;

/**
 * @ClassName CheckBoxTest
 * @Description TODO
 * @Author ztc
 * @Date 2024/11/15 14:43
 */
public class CheckBoxTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            CheckBoxFrame frame = new CheckBoxFrame();
            frame.setTitle("CheckBoxTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
