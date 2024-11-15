package radio;


import check.CheckBoxFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName CheckBoxTest
 * @Description TODO
 * @Author ztc
 * @Date 2024/11/15 14:43
 */
public class RadioButtonTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            RadioButtonFrame frame = new RadioButtonFrame();
            frame.setTitle("RadioButtonTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
