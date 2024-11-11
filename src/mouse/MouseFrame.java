package mouse;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName MouseFrame
 * @Description TODO
 * @Author ztc
 * @Date 2024/11/11 11:51
 */
public class MouseFrame extends JFrame {
    public MouseFrame() throws HeadlessException {
        add(new MouseComponent());
        pack();
    }
}
